package implementation.DesignPattern.commandPattern;

public class Client {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        Command playCommand = new PlayCommand(player);
        Command stopCommand = new StopCommand(player);
        Command pauseCommand = new PauseCommand(player);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(playCommand);
        remote.pressButton();

        remote.setCommand(pauseCommand);
        remote.pressButton();

        remote.pressUndo();

        remote.setCommand(stopCommand);
        remote.pressButton();

    }
}
