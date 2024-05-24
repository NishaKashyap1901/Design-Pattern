package implementation.DesignPattern.adapterPattern;

public class OfficeEmployee implements Employee {
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is working on office tasks.");
    }
}