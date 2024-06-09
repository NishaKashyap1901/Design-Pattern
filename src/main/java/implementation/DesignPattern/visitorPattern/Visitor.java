package implementation.DesignPattern.visitorPattern;

public interface Visitor {
    void visitLion(Lion lion);
    void visitElephant(Elephant elephant);
    void visitMonkey(Monkey monkey);
}
