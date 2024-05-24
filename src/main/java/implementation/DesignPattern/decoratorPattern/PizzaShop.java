package implementation.DesignPattern.decoratorPattern;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza basicPizza = new PlainPizza();
        System.out.println(basicPizza.getDescription() + " Rs." + basicPizza.getCost());

        Pizza cheesePizza = new CheeseDecorator(new PlainPizza());
        System.out.println(cheesePizza.getDescription() + " Rs." + cheesePizza.getCost());

        Pizza pannerDecorator = new PannerDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println(pannerDecorator.getDescription() + " Rs." + pannerDecorator.getCost());

    }
}

