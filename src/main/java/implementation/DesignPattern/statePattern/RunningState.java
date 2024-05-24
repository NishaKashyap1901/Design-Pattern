package implementation.DesignPattern.statePattern;

    public class RunningState implements BikeState {
        @Override
        public void start(Bike bike) {
            System.out.println("Bike is already running.");
        }

        @Override
        public void stop(Bike bike) {
            System.out.println("Stopping the bike.");
            bike.setState(bike.getStoppedState());
        }
    }



