package implementation.DesignPattern.Assignment1Part1;

public class ThirdPartyDeviceAdapter implements DeviceAdapter {
    private ThirdPartyDevice thirdPartyDevice;

    public ThirdPartyDeviceAdapter(ThirdPartyDevice thirdPartyDevice) {
        this.thirdPartyDevice = thirdPartyDevice;
    }

    @Override
    public void turnOn() {
        thirdPartyDevice.powerUp();
    }

    @Override
    public void turnOff() {
        thirdPartyDevice.powerDown();
    }
}