package implementation.DesignPattern.commandPattern;

public class PlayCommand implements Command {
    private MusicPlayer player;

    public PlayCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }

    @Override
    public void undo() {
        player.stop();
    }
}
