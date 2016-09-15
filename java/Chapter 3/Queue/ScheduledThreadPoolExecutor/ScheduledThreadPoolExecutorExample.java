package Queue.ScheduledThreadPoolExecutor;


import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample
{
    public static void main(String[] args)
    {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        Task task1 = new Task ("Demo Task 1");
        Task task2 = new Task ("Demo Task 2");
        Task task3 = new Task ("Demo Task 3");
        Task task4 = new Task ("Demo Task 4");
        Task task5 = new Task ("Demo Task 5");

        System.out.println("The time is : " + new Date());

        executor.schedule(task1, 0 , TimeUnit.SECONDS);
        executor.schedule(task2, 0 , TimeUnit.SECONDS);
        executor.schedule(task3, 0 , TimeUnit.SECONDS);
        executor.schedule(task4, 0 , TimeUnit.SECONDS);
        executor.schedule(task5, 0 , TimeUnit.SECONDS);

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}