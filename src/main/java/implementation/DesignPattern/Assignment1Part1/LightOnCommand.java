package implementation.DesignPattern.Assignment1Part1;

public class LightOnCommand implements DeviceCommand {
    private SmartLight light;

    public LightOnCommand(SmartLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

