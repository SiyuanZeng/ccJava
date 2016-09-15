package Lambda;

import java.util.function.Consumer;

/**
 * Created by SiyuanZeng's on 6/19/2016.
 */
public class MethodOverloadReference {

    public static void doSomething(Integer i){
        System.out.println(i);
    }
    public static void doSomething(Integer i, Integer x){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer1 = x -> doSomething(x);
        consumer1.accept(1);

        Consumer<Integer> consumer2 = MethodOverloadReference::doSomething;
        consumer1.accept(1);
    }

}
