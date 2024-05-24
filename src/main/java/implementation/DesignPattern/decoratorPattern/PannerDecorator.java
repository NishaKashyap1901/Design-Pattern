package implementation.DesignPattern.decoratorPattern;

public class PannerDecorator extends PizzaDecorator {
    public PannerDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Panner";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 200; // cost of pepperoni
    }
}
