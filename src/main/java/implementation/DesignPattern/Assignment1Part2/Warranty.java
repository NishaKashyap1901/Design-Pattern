package implementation.DesignPattern.Assignment1Part2;

public class Warranty extends ProductDecorator {
    public Warranty(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + 20.00;
    }
}