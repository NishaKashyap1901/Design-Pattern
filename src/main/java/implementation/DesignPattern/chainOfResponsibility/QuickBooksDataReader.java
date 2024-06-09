package implementation.DesignPattern.chainOfResponsibility;

class QuickBooksDataReader extends DataReader {
    @Override
    protected boolean canRead(String fileName) {
        return fileName.endsWith(".qbw");
    }

    @Override
    protected void handleRead(String fileName) {
        System.out.println("Reading QuickBooks file: " + fileName);
    }
}
