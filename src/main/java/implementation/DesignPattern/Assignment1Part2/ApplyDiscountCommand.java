package implementation.DesignPattern.Assignment1Part2;

public class ApplyDiscountCommand implements CheckOutCommand {
    private Cart cart;
    private double discount;

    public ApplyDiscountCommand(Cart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }

    @Override
    public void execute() {
        cart.applyDiscount(discount);
    }
}