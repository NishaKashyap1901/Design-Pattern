package implementation.DesignPattern.mementoPattern;

public class ShoppingMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        CartHistory history = new CartHistory();

        cart.addItem("Laptop");
        history.save(cart);

        cart.addItem("Smartphone");
        history.save(cart);

        cart.addItem("Headphones");
        System.out.println("Current Cart Items: " + cart.getItems());

        history.undo(cart);
        System.out.println("After Undo: " + cart.getItems());

        history.undo(cart);
        System.out.println("After Undo: " + cart.getItems());
    }
}
