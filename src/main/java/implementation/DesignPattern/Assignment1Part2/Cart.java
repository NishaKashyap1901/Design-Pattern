package implementation.DesignPattern.Assignment1Part2;

import java.util.*;


public class Cart {
    private List<CartItem> items = new ArrayList<>();
    private double discount = 0.0;

    public void addProduct(Product product) {
        items.add(new CartItem(product, 1));
    }

    public void removeProduct(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total * (1 - discount);
    }

    public double getTotalWeight() {
        return items.size() * 2.0;
    }
}
