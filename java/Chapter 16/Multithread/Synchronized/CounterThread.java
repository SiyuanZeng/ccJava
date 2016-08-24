package Multithread.Synchronized;

/**
 * Created by SiyuanZeng's on 8/24/2016.
 */
public class CounterThread extends Thread{

    protected Counter counter = null;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run() {
        synchronized(CounterThread.class) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter.add(i);
            }
        }
    }
}
