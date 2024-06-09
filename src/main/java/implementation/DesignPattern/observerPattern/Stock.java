package implementation.DesignPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String symbol;
    private double price;
    private List<Observer> observers;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(symbol, price);
        }
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }
}

