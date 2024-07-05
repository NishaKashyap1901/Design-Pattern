package implementation.DesignPattern.cropPhoto;

public class CommandFactory {

    private ResizeImage resizeImage;

    private ExpandImage expandImage;

    private CropPhoto cropImage;

    private RemoveBgImage removeBgImage;

    public Command createCommand(String type, String[] args) {
        switch (type) {
            case "resize":
                resizeImage.setParams(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                return resizeImage;
            case "expand":
                expandImage.setParams(args[0], args[1], Integer.parseInt(args[2]));
                return expandImage;
            case "crop":
                cropImage.setParams(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
                return cropImage;
            case "remove-bg":
                removeBgImage.setParams(args[0]);
                return removeBgImage;
            default:
                throw new IllegalArgumentException("Invalid command type");
        }
    }}
