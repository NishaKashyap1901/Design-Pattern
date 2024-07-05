package implementation.DesignPattern.cropPhoto;

public class GoogleDriveStorage implements CloudStorage {
    @Override
    public void store(String... params) {
        if (params.length != 2) {
            throw new IllegalArgumentException("Google Drive requires 2 parameters: path, image");
        }
        String path = params[0];
        String image = params[1];
        System.out.println("Storing " + image + " in Google Drive at " + path);
    }
}
