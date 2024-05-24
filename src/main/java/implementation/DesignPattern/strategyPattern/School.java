package implementation.DesignPattern.strategyPattern;

public class School {
    public static void main(String[] args) {
        Subject science = new Subject();
        Subject maths = new Subject();
        Subject english = new Subject();

        science.setTeachingStrategy(new PhysicsTeachingStrategy());
        maths.setTeachingStrategy(new AlgebraTeachingStrategy());
        english.setTeachingStrategy(new LiteratureTeachingStrategy());


        science.setLearningStrategy(new PhysicsLearningStrategy());
        maths.setLearningStrategy(new AlgebraLearningStrategy());
        english.setLearningStrategy(new LiteratureLearningStrategy());


        System.out.println("Science class:");
        science.teach();
        science.learn();

        System.out.println("\nMaths class:");
        maths.teach();
        maths.learn();

        System.out.println("\nEnglish class:");
        english.teach();
        english.learn();

    }
}
