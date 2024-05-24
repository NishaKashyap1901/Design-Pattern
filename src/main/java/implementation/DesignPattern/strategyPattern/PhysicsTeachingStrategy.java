package implementation.DesignPattern.strategyPattern;

public class PhysicsTeachingStrategy implements TeachingStrategy {

    @Override
    public void teach() {
        System.out.println("Teaching Physics using experiments and practical demonstrations.");
    }

}
