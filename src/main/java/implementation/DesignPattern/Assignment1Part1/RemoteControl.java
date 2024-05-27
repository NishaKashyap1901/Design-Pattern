package implementation.DesignPattern.Assignment1Part1;

public class RemoteControl {
    private DeviceCommand command;

    public void setCommand(DeviceCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

