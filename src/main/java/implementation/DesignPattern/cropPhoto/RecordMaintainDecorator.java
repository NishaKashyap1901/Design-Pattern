package implementation.DesignPattern.cropPhoto;

public class RecordMaintainDecorator extends CommandDecorator {
    public RecordMaintainDecorator(Command command) {
        super(command);
    }

    @Override
    public void execute() {
        System.out.println("RecordMaintain: Executing " + command.getClass().getSimpleName());
        command.execute();
    }
}
