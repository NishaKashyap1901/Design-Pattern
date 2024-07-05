package implementation.DesignPattern.cropPhoto;

public class AwsS3Storage implements CloudStorage {
    @Override
    public void store(String... params) {
        if (params.length != 3) {
            throw new IllegalArgumentException("AWS S3 requires 3 parameters: bucket, key, image");
        }
        String bucket = params[0];
        String key = params[1];
        String image = params[2];
        System.out.println("Storing " + image + " in AWS S3 at bucket " + bucket + " with key " + key);
    }
}
