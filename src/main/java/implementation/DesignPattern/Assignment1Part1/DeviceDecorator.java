package implementation.DesignPattern.Assignment1Part1;

public abstract class DeviceDecorator extends SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
    }
}
