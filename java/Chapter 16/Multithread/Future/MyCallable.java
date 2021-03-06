package Multithread.Future;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"Running now...");
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName()+"Siyuan";
    }

    public static void main(String args[]){
        //Get Multithread.ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Multithread.Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
        Callable<String> callable = new MyCallable();

        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            //Does submit complete immediately?
            Future<String> future = executor.submit(callable);
            //add Multithread.Future to the list, we can get return value using Multithread.Future
            list.add(future);
        }

        for(Future<String> fut : list)
            try {
                //print the return value of Multithread.Future, notice the output delay in console
                // because Multithread.Future.get() waits for task to get completed
                System.out.println("isCancelled" + "::" + fut.isCancelled());
                System.out.println("isDone"  + "::" + fut.isDone());
                System.out.println(new Date() + "::" + fut.get());
                System.out.println("cancel"  + "::" + fut.cancel(true));
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        //shut down the executor service now
        executor.shutdown();
    }

}