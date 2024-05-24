package implementation.DesignPattern.statePattern;

public class StoppedState implements BikeState {
    @Override
    public void start(Bike bike) {
        System.out.println("Starting the bike.");
        bike.setState(bike.getRunningState());
    }

    @Override
    public void stop(Bike bike) {
        System.out.println("Bike is already stopped.");
    }
    }