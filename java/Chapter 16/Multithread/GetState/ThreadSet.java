package Multithread.GetState;

/**
 * Created by SiyuanZeng's on 8/22/2016.
 */
import java.util.Set;

public class ThreadSet {
    public static void main(String args[]){
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        System.out.println("Number of active threads from the given thread: " + Thread.activeCount());
        for ( Thread t : threadSet){
            System.out.println("Thread :"+t+":"+"state:"+t.getState());
        }

        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();

        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++)
            System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());
    }

}