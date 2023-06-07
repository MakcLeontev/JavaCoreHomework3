public class WorkerTime extends Worker{
    int hourlyRate;

    public WorkerTime(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    @Override
    public int payroll() {
        return 0;
    }

    public double payroll(int hourlyRate) {
        double averageSal = 20.8*8*hourlyRate;
        return averageSal;
    }

    @Override
    public String toString() {
        return "WorkerTime{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
