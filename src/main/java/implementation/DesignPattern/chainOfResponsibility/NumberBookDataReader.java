package implementation.DesignPattern.chainOfResponsibility;

class NumberBookDataReader extends DataReader {
    @Override
    protected boolean canRead(String fileName) {
        return fileName.endsWith(".numbers");
    }

    @Override
    protected void handleRead(String fileName) {
        System.out.println("Reading Numbers file: " + fileName);
    }
}

