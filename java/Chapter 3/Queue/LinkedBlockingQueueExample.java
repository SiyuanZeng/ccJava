package Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by SiyuanZeng's on 5/31/2016.
 */
public class LinkedBlockingQueueExample {
    public static void main(String... args) throws InterruptedException {
        BlockingQueue<String> linkedBQueue = new LinkedBlockingQueue<String>(2);
        linkedBQueue.put("Java"); //puts object into BlockingQueue
        System.out.println("size of BlockingQueue before peek : " + linkedBQueue.size());
        System.out.println("example of peek() in BlockingQueue: " + linkedBQueue.peek());
        System.out.println("size of BlockingQueue after peek : " + linkedBQueue.size());
        System.out.println("calling poll() on BlockingQueue: " + linkedBQueue.poll());
        System.out.println("size of BlockingQueue after poll : " + linkedBQueue.size());
    }
}