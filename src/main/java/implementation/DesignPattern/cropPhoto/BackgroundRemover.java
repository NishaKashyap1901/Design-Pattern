package implementation.DesignPattern.cropPhoto;

public class BackgroundRemover {
    private BackgroundRemovalStrategy strategy;

    public BackgroundRemover(BackgroundRemovalStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(BackgroundRemovalStrategy strategy) {
        this.strategy = strategy;
    }

    public void removeBackground(String image) {
        strategy.removeBackground(image);
    }}
