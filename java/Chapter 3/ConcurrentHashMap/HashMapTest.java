package ConcurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapTest implements Runnable{
    private String name;
    private static Map<String,String> conpage=new HashMap<String,String>();
    HashMapTest(String name){
        conpage.put("1","A");
        conpage.put("2","B");
        conpage.put("3","C");
        this.name=name;
    }
    public void run() {
        try{
            Iterator<String> it = conpage.keySet().iterator();
            while(it.hasNext()){
                String key=it.next();
                conpage.put("A"+key, "A"+key);
                System.out.println("[" + name + "] > Add > " + key +": " + conpage.get(key));
            }
            it = conpage.keySet().iterator();
            while(it.hasNext()){
                String key=it.next();
                System.out.println(name + "> " + key +": " + conpage.get(key));
            }



            System.out.println(name +" completed.");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        }
    }
    public static void main(String[] args) {
        ExecutorService  executor= Executors.newCachedThreadPool();
        executor.execute(new HashMapTest("Thread 1"));
        executor.execute(new HashMapTest("Thread 2"));
        executor.shutdownNow();
    }
}