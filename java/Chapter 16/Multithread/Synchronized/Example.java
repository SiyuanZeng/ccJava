package Multithread.Synchronized;

/**
 * Created by SiyuanZeng's on 8/24/2016.
 */
public class Example {

    public static void main(String[] args){
        Counter counter = new Counter();
        Thread  threadA = new CounterThread(counter);
        Thread  threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }
}