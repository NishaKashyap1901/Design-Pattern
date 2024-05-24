package implementation.DesignPattern.adapterPattern;

public class Student implements CollegeStudent {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying for exams.");
    }
}
