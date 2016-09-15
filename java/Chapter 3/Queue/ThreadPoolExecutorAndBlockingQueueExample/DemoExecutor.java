package Queue.ThreadPoolExecutorAndBlockingQueueExample;

import java.util.concurrent.*;

public class DemoExecutor
{
    public static void main(String[] args)
    {
        Integer threadCounter = 0;
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(3);
//      int corePoolSize,
//      int maximumPoolSize
//      blockingQueue - after maximum
        CustomThreadPoolExecutor executor = new CustomThreadPoolExecutor(1, 2, 5000, TimeUnit.MILLISECONDS, blockingQueue);
        System.out.println(executor.getMaximumPoolSize());
        executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("DemoTask Rejected : " + ((DemoThread) r).getName());
                System.out.println("BlockingQueue Size: " + blockingQueue.size());
                System.out.println("Waiting for a second !!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Lets add another time : " + ((DemoThread) r).getName());
                executor.execute(r);
            }
        });

        // Let start all core threads initially
        executor.prestartAllCoreThreads();
        while (true) {
            threadCounter++;
            // Adding threads one by one
            System.out.println("Adding DemoTask : " + threadCounter);
            executor.execute(new DemoThread(threadCounter.toString()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (threadCounter == 100) {
                break;
            }


        }
    }
}