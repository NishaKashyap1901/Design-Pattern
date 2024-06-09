package implementation.DesignPattern.observerPattern;

public class StockListView implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("StockListView: " + stockSymbol + " price updated to " + price);
    }
}

