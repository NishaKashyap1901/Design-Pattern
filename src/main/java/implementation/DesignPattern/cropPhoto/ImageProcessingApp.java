package implementation.DesignPattern.cropPhoto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ImageProcessingApp implements CommandLineRunner {


    private ImageProcessor processor;

    private Logger logger;
   
    private CommandFactory commandFactory;

    private CloudStorageFactory storageFactory;

    private BackgroundRemover remover;

    private FeignClientStrategy feignClientStrategy;

    private RestTemplateStrategy restTemplateStrategy;

    public static void main(String[] args) {
        SpringApplication.run(ImageProcessingApp.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        processor.attach(logger);

        System.out.println("Enter command (resize, expand, crop, remove-bg, store):");
        String commandType = scanner.nextLine();

        if ("store".equals(commandType)) {
            System.out.println("Enter service (google-drive, aws-s3):");
            String service = scanner.nextLine();
            System.out.println("Enter parameters separated by space:");
            String[] params = scanner.nextLine().split(" ");
            storageFactory.createStorage(service, params);
        } else if ("remove-bg".equals(commandType)) {
            System.out.println("Choose strategy (feign, rest):");
            String strategy = scanner.nextLine();
            if ("feign".equals(strategy)) {
                remover.setStrategy(feignClientStrategy);
            } else if ("rest".equals(strategy)) {
                remover.setStrategy(restTemplateStrategy);
            } else {
                System.out.println("Invalid strategy");
                System.exit(1);
            }
            System.out.println("Enter arguments separated by space:");
            String[] commandArgs = scanner.nextLine().split(" ");
            Command command = commandFactory.createCommand(commandType, commandArgs);
            if (command != null) {
                Command decoratedCommand = new RecordMaintainDecorator(command);
                processor.process(decoratedCommand);
            }
        } else {
            System.out.println("Enter arguments separated by space:");
            String[] commandArgs = scanner.nextLine().split(" ");
            Command command = commandFactory.createCommand(commandType, commandArgs);
            if (command != null) {
                Command decoratedCommand = new RecordMaintainDecorator(command);
                processor.process(decoratedCommand);
            }
        }
    }}
