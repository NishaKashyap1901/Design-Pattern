package implementation.DesignPattern.cropPhoto;

public class FeignClientStrategy implements BackgroundRemovalStrategy {
    @Override
    public void removeBackground(String image) {
        System.out.println("Removing background of " + image + " using Feign Client");
        // Implement Feign Client logic here
    }}
