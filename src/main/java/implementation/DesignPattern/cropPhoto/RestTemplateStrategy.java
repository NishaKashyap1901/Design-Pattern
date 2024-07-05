package implementation.DesignPattern.cropPhoto;

public class RestTemplateStrategy implements BackgroundRemovalStrategy {
    @Override
    public void removeBackground(String image) {
        System.out.println("Removing background of " + image + " using RestTemplate");
        // Implement RestTemplate logic here
    }}
