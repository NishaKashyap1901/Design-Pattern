package implementation.DesignPattern.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        DataReader excelReader = new ExcelDataReader();
        DataReader numbersReader = new NumberBookDataReader();
        DataReader quickBooksReader = new QuickBooksDataReader();

        excelReader.setNextReader(numbersReader);
        numbersReader.setNextReader(quickBooksReader);

        String fileName1 = "report.xlsx";
        String fileName2 = "budget.numbers";
        String fileName3 = "accounts.qbw";
        String fileName4 = "unsupported.txt";

        excelReader.read(fileName1);
        excelReader.read(fileName2);
        excelReader.read(fileName3);
        excelReader.read(fileName4);
    }
}

