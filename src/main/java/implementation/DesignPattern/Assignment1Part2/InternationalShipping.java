package implementation.DesignPattern.Assignment1Part2;

public class InternationalShipping implements ShippingMethod {
    @Override
    public double calculate(double weight, double distance) {
        return weight * distance * 0.20;
    }
}
