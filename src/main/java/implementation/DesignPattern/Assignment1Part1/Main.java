package implementation.DesignPattern.Assignment1Part1;

public class Main {
    public static void main(String[] args) {
        // Command Pattern
        SmartLight livingRoomLight = new SmartLight();
        DeviceCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        DeviceCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);
        remote.pressButton();
        remote.setCommand(lightOffCommand);
        remote.pressButton();

        // Decorator Pattern
        SmartDevice basicDevice = new SmartDevice();
        SmartDevice powerSavingDevice = new PowerSavingMode(basicDevice);
        SmartDevice vacationModeDevice = new VacationMode(basicDevice);

        basicDevice.operate();
        powerSavingDevice.operate();
        vacationModeDevice.operate();

        // Strategy Pattern
        TempratureControl ecoFriendly = new EcoFriendlyRegulation();
        TempratureControl quickCool = new QuickCoolRegulation();

        ecoFriendly.regulate();
        quickCool.regulate();

        // Adapter Pattern
        ThirdPartyDevice thirdPartyDevice = new ThirdPartyDevice();
        DeviceAdapter adapter = new ThirdPartyDeviceAdapter(thirdPartyDevice);
        
        adapter.turnOn();
        adapter.turnOff();
    }
}
