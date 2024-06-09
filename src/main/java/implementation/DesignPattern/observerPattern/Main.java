package implementation.DesignPattern.observerPattern;

public class Main {
    public static void main(String[] args) {
        Stock googleStock = new Stock("GOOGLE", 1500);
        Stock appleStock = new Stock("APPLE", 300);

        StatusBar statusBar = new StatusBar();
        StockListView stockListView = new StockListView();

        googleStock.registerObserver(statusBar);
        googleStock.registerObserver(stockListView);
        appleStock.registerObserver(stockListView);

        googleStock.setPrice(1510);
        appleStock.setPrice(305);
    }
}

