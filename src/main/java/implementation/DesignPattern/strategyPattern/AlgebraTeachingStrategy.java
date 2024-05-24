package implementation.DesignPattern.strategyPattern;

public class AlgebraTeachingStrategy implements TeachingStrategy {
    @Override
    public void teach() {
        System.out.println("Teaching Algebra using problem-solving and interactive exercises.");
    }
}
