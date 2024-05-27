package implementation.DesignPattern.Assignment1Part2;

public class RemoveProductCommand implements CheckOutCommand {
    private Cart cart;
    private Product product;

    public RemoveProductCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.removeProduct(product);
    }
}