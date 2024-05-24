package implementation.DesignPattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public ShoppingCartMemento save() {
        return new ShoppingCartMemento(items);
    }

    public void restore(ShoppingCartMemento memento) {
        items = memento.getItems();
    }
}
