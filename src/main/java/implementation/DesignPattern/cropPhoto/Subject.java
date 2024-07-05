package implementation.DesignPattern.cropPhoto;

import java.util.*;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String message);
    }