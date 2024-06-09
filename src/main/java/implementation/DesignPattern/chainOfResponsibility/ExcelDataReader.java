package implementation.DesignPattern.chainOfResponsibility;

class ExcelDataReader extends DataReader {
    @Override
    protected boolean canRead(String fileName) {
        return fileName.endsWith(".xlsx") || fileName.endsWith(".xls");
    }

    @Override
    protected void handleRead(String fileName) {
        System.out.println("Reading Excel file: " + fileName);
    }
}
