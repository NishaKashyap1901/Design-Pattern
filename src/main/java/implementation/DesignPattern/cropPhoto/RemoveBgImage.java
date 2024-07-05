package implementation.DesignPattern.cropPhoto;

public class RemoveBgImage implements Command {
    private String image;
    private BackgroundRemover remover;

    public RemoveBgImage(BackgroundRemover remover) {
        this.remover = remover;
    }

    public void setParams(String image) {
        this.image = image;
    }

    @Override
    public void execute() {
        remover.removeBackground(image);
    }}
