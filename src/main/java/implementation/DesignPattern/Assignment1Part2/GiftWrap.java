package implementation.DesignPattern.Assignment1Part2;

public class GiftWrap extends ProductDecorator {
    public GiftWrap(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + 5.00;
    }
}