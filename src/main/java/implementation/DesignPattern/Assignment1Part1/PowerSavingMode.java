package implementation.DesignPattern.Assignment1Part1;

public class PowerSavingMode extends DeviceDecorator {
    public PowerSavingMode(SmartDevice decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void operate() {
        System.out.println("Power-saving mode activated.");
        decoratedDevice.operate();
    }
}
