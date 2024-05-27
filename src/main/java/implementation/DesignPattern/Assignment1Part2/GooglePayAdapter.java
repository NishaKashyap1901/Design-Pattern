package implementation.DesignPattern.Assignment1Part2;

public class GooglePayAdapter implements PaymentAdapter {
    private GooglePay googlePay;

    public GooglePayAdapter(GooglePay googlePay) {
        this.googlePay = googlePay;
    }

    @Override
    public void pay(double amount) {
        googlePay.charge(amount);
    }
}
