package implementation.DesignPattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CartHistory {

    private final List<ShoppingCartMemento> mementos = new ArrayList<>();

    public void save(ShoppingCart cart) {
        mementos.add(cart.save());
    }

    public void undo(ShoppingCart cart) {
        if (!mementos.isEmpty()) {
            ShoppingCartMemento memento = mementos.remove(mementos.size() - 1);
            cart.restore(memento);
        }
    }
}

