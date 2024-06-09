package implementation.DesignPattern.chainOfResponsibility;

abstract class DataReader {
    protected DataReader nextReader;

    public void setNextReader(DataReader nextReader) {
        this.nextReader = nextReader;
    }

    public void read(String fileName) {
        if (canRead(fileName)) {
            handleRead(fileName);
        } else if (nextReader != null) {
            nextReader.read(fileName);
        } else {
            throw new UnsupportedOperationException("File format not supported: " + fileName);
        }
    }

    protected abstract boolean canRead(String fileName);

    protected abstract void handleRead(String fileName);
}
