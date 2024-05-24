package implementation.DesignPattern.strategyPattern;

public class LiteratureTeachingStrategy implements TeachingStrategy {
    @Override
    public void teach() {
        System.out.println("Teaching Literature through reading, discussion, and analysis of texts.");
    }
}