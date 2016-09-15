package Multithread.Concurrency;

/**
 * Created by SiyuanZeng's on 6/19/2016.
 */
import java.util.function.Consumer;
/*from ww  w. j a  v  a  2 s .com*/
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        Consumer<String> andThen = (x) -> System.out.println(x.toUpperCase());
        c.accept("Java2s.com");
        c.andThen(andThen).accept("Java2s.com");
    }
}