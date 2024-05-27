package implementation.DesignPattern.Assignment1Part2;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.00);
        Product phone = new Product("Phone", 500.00);

        // Decorator Pattern
        Product giftWrappedLaptop = new GiftWrap(laptop);
        Product laptopWithWarranty = new Warranty(laptop);
        Product phoneWithAllFeatures = new Warranty(new GiftWrap(phone));

        // Command Pattern
        Cart cart = new Cart();
        CheckOutCommand addLaptop = new AddProductCommand(cart, giftWrappedLaptop);
        CheckOutCommand addPhone = new AddProductCommand(cart, phoneWithAllFeatures);
        CheckOutCommand removeLaptop = new RemoveProductCommand(cart, giftWrappedLaptop);
        CheckOutCommand applyDiscount = new ApplyDiscountCommand(cart, 0.10);

        addLaptop.execute();
        addPhone.execute();
        removeLaptop.execute();
        applyDiscount.execute();

        // Strategy Pattern
        ShippingMethod shippingMethod = new InternationalShipping();
        double shippingCost = shippingMethod.calculate(cart.getTotalWeight(), 100);

        //Adapter Pattern
        PayPal payPal = new PayPal();
        GooglePay stripe = new GooglePay();
        PaymentAdapter payPalAdapter = new PayPalAdapter(payPal);
        PaymentAdapter stripeAdapter = new GooglePayAdapter(stripe);

        double totalAmount = cart.getTotalPrice() + shippingCost;
        payPalAdapter.pay(totalAmount);

    }
}

