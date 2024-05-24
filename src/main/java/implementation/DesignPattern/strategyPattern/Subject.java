package implementation.DesignPattern.strategyPattern;

public class Subject {
    private TeachingStrategy teachingStrategy;
    private LearningStrategy learningStrategy;

    public void setTeachingStrategy(TeachingStrategy teachingStrategy) {
        this.teachingStrategy = teachingStrategy;
    }

    public void setLearningStrategy(LearningStrategy learningStrategy) {
        this.learningStrategy = learningStrategy;
    }

    public void teach() {
        teachingStrategy.teach();
    }

    public void learn() {
        learningStrategy.learn();
    }
}
