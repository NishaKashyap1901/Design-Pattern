package implementation.DesignPattern.cropPhoto;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CloudStorageFactory {
    private final Map<String, Function<String[], CloudStorage>> storageMap = new HashMap<>();

    public CloudStorageFactory(GoogleDriveStorage googleDriveStorage, AwsS3Storage awsS3Storage) {
        storageMap.put("google-drive", args -> {
            googleDriveStorage.store(args);
            return googleDriveStorage;
        });
        storageMap.put("aws-s3", args -> {
            awsS3Storage.store(args);
            return awsS3Storage;
        });
    }

    public CloudStorage createStorage(String type, String[] args) {
        if (!storageMap.containsKey(type)) {
            throw new IllegalArgumentException("Invalid storage type");
        }
        return storageMap.get(type).apply(args);
    }}
