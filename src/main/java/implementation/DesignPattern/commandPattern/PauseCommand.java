package implementation.DesignPattern.commandPattern;

public class PauseCommand implements Command {
    private MusicPlayer player;

    public PauseCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }

    @Override
    public void undo() {
        player.play();
    }
}
