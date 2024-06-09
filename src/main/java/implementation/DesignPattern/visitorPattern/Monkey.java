package implementation.DesignPattern.visitorPattern;

public class Monkey implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMonkey(this);
    }

    public String howl() {
        return "Chatter!";
    }
}
