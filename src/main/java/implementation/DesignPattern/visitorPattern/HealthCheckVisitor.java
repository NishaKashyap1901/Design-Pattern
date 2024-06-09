package implementation.DesignPattern.visitorPattern;

public class HealthCheckVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Checking the lion's health");
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Checking the elephant's health");
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Checking the monkey's health");
    }
}