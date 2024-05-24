package implementation.DesignPattern.statePattern;

public class Bike {

    private BikeState runningState;
    private BikeState stoppedState;
    private BikeState currentState;

    public Bike() {
        runningState = new RunningState();
        stoppedState = new StoppedState();
        currentState = stoppedState;
    }

    public void setState(BikeState state) {
        currentState = state;
    }

    public BikeState getRunningState() {
        return runningState;
    }

    public BikeState getStoppedState() {
        return stoppedState;
    }

    public void start() {
        currentState.start(this);
    }

    public void stop() {
        currentState.stop(this);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.start();
        bike.start();
        bike.stop();
        bike.stop();
    }
}
