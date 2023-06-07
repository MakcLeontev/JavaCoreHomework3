import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {
        WorkerArray workerArray = new WorkerArray();
        Worker[] workers = {new WorkerFix("иван","иванов",23),
                new WorkerTime("иван","иванов",23),
                new WorkerFix("иван","иванов",23),
                new WorkerTime("иван","иванов",23)};
        workerArray.printArray(workers);
    }
}