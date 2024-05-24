package implementation.DesignPattern.strategyPattern;

public class AlgebraLearningStrategy implements LearningStrategy {
    @Override
    public void learn() {
        System.out.println("Learning Algebra by solving equations and using visual aids.");
    }
}
