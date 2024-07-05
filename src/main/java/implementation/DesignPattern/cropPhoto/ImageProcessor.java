package implementation.DesignPattern.cropPhoto;

import java.util.ArrayList;
import java.util.List;

public class ImageProcessor implements Subject {
        private List<Observer> observers = new ArrayList<>();

        @Override
        public void attach(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers(String message) {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }

        public void process(Command command) {
            notifyObservers("Processing: " + command.getClass().getSimpleName());
            command.execute();
        }
}
