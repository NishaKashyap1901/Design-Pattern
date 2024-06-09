package implementation.DesignPattern.visitorPattern;

public class Elephant implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElephant(this);
    }

    public String trumpet() {
        return "Baroo!";
    }
}