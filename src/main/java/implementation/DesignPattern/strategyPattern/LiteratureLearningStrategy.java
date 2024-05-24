package implementation.DesignPattern.strategyPattern;

public class LiteratureLearningStrategy implements LearningStrategy {
    @Override
    public void learn() {
        System.out.println("Learning Literature through reading assignments and group discussions.");
    }
}
