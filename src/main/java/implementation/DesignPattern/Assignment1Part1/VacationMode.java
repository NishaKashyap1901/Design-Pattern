package implementation.DesignPattern.Assignment1Part1;

public class VacationMode extends DeviceDecorator {
    public VacationMode(SmartDevice decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        System.out.println("Vacation mode activated.");
        decoratedDevice.operate();
    }
}