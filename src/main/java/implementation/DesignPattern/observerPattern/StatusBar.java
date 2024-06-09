package implementation.DesignPattern.observerPattern;

public class StatusBar implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("StatusBar: " + stockSymbol + " price updated to " + price);
    }
}
