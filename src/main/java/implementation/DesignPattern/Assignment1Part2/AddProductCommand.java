package implementation.DesignPattern.Assignment1Part2;

public class AddProductCommand implements CheckOutCommand {
    private Cart cart;
    private Product product;

    public AddProductCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.addProduct(product);
    }
}