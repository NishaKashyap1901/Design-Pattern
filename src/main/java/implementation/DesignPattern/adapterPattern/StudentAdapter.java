package implementation.DesignPattern.adapterPattern;

public class StudentAdapter implements Employee {
    private CollegeStudent student;

    public StudentAdapter(CollegeStudent student) {
        this.student = student;
    }

    @Override
    public void doWork() {
        student.study();
    }
}
