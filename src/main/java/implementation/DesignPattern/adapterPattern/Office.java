package implementation.DesignPattern.adapterPattern;

public class Office {
    public static void main(String[] args) {
        Employee officeEmployee = new OfficeEmployee("Nisha");

        CollegeStudent collegeStudent = new Student("Khushi");

        Employee adaptedStudent = new StudentAdapter(collegeStudent);

        Boss boss = new Boss();
        boss.assignWork(officeEmployee);
        boss.assignWork(adaptedStudent);
    }
}
