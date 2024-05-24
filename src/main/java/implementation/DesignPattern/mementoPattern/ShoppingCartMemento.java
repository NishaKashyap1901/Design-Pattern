package implementation.DesignPattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartMemento {

    private final List<String> items;

    public ShoppingCartMemento(List<String> items) {

        this.items = new ArrayList<>(items);
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
}
