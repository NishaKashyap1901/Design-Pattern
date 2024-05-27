package implementation.DesignPattern.Assignment1Part1;

public class LightOffCommand implements DeviceCommand {
    private SmartLight light;

    public LightOffCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}