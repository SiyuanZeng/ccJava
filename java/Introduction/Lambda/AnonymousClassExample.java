package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by SiyuanZeng's on 6/19/2016.
 */
public class AnonymousClassExample {

    private static final AnonymousClassExample INSTANCE = new AnonymousClassExample();
    private int var = 1;
    private List<Integer> integers = Arrays.asList(1,2,3,4,5);

    public void doSomething() {
        integers.forEach(new Consumer<Integer>() {
            private int state = 10;
            @Override
            public void accept(Integer x) {
                int y = this.state + AnonymousClassExample.this.var + x;
                System.out.println("Anonymous class " + y);
            }
        });
    }

    public static void main(String[] args) {
        INSTANCE.doSomething();
    }

}
