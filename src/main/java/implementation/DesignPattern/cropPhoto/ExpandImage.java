package implementation.DesignPattern.cropPhoto;

public class ExpandImage implements Command{
    private String image;
    private String direction;
    private int pixels;

    public ExpandImage() {}

    public void setParams(String image, String direction, int pixels) {
        this.image = image;
        this.direction = direction;
        this.pixels = pixels;
    }

    @Override
    public void execute() {
        System.out.println("Expanding image " + image + " to the " + direction + " by " + pixels + " pixels");
    }
}
