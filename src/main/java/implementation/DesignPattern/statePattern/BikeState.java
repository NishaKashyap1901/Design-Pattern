package implementation.DesignPattern.statePattern;

public interface BikeState {
    void start(Bike bike);
    void stop(Bike bike);
}
