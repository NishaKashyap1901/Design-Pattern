package implementation.DesignPattern.commandPattern;

public class StopCommand implements Command {
    private MusicPlayer player;

    public StopCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }

    @Override
    public void undo() {
        player.play();
    }
}