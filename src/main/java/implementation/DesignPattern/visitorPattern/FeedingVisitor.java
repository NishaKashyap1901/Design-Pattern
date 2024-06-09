package implementation.DesignPattern.visitorPattern;

public class FeedingVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Feeding the lion: " + lion.roar());
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Feeding the elephant: " + elephant.trumpet());
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Feeding the monkey: " + monkey.howl());
    }
}