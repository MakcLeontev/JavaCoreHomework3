public class WorkerFix extends Worker{

    public WorkerFix(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    @Override
    public int payroll() {
        return 0;
    }
    public int payroll(int averageSal) {
        int fixSal = averageSal;
        return fixSal;
    }

    @Override
    public String toString() {
        return "WorkerFix{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
