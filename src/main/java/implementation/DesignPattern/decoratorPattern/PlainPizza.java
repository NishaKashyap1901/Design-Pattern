package implementation.DesignPattern.decoratorPattern;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 50; // base cost of the pizza
    }
}
