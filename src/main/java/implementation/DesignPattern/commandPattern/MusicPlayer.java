package implementation.DesignPattern.commandPattern;

public class MusicPlayer {
    public void play() {
        System.out.println("Music is playing");
    }

    public void stop() {
        System.out.println("Music is stopped");
    }

    public void pause() {
        System.out.println("Music is paused");
    }

    public void rewind() {
        System.out.println("Music is rewinding");
    }
}

