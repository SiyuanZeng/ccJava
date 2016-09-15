package Lambda;

import java.util.function.Consumer;

public class ConsumerAcceptTest {

    public static void main(String[] args) {
        Consumer consumer = ConsumerAcceptTest::printNames;
        consumer.accept("Jeremy");
        consumer.accept("Paul");
        consumer.accept("Richard");
    }



    private static void printNames(Object name) {
        System.out.println(name);
    }
}