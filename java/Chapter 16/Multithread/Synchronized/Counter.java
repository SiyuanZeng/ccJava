package Multithread.Synchronized;

/**
 * Created by SiyuanZeng's on 8/24/2016.
 */
public class Counter{

    long count = 0;

    public synchronized void add(long value){
        System.out.println(Thread.currentThread().getName() + "   " + count);
        this.count += value;
    }
}
