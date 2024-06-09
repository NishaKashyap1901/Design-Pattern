package implementation.DesignPattern.visitorPattern;

public class Lion implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLion(this);
    }

    public String roar() {
        return "Roar!";
    }
}