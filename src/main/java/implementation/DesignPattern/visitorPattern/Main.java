package implementation.DesignPattern.visitorPattern;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        Animal[] animals = { lion, elephant, monkey };

        Visitor feedingVisitor = new FeedingVisitor();
        Visitor healthCheckVisitor = new HealthCheckVisitor();

        System.out.println("Feeding animals:");
        for (Animal animal : animals) {
            animal.accept(feedingVisitor);
        }

        System.out.println("\nHealth check for animals:");
        for (Animal animal : animals) {
            animal.accept(healthCheckVisitor);
        }
    }
}

