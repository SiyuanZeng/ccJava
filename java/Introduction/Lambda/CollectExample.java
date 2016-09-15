package Lambda;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SiyuanZeng's on 6/19/2016.
 */
public class CollectExample {

    public static void main(String[] args) {

        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");
        HOSTING.put(5, "aws.amazon.com");

        String result = "";
        for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
            if ("aws.amazon.com".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Before Java 8 : " + result);

        //Map -> Stream -> Filter -> String
        result = HOSTING.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(Collectors.joining());

        System.out.println("With Java 8 : " + result);


//1) Convert Stream to List using stream.collect(Collectors.toList())
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());


        System.out.print(evenNumbersList);


        //2) Convert Stream to array using stream.toArray(EntryType[]::new)

        list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);

        for (int i = 0; i < evenNumbersArr.length; i++) {
            System.out.print(evenNumbersArr[i]);
        }
        System.out.println();


        List<String> memberNames = new ArrayList<String>();
        memberNames.add("LOKESH");
        memberNames.add("AMAN");
        memberNames.add("SALMAN");
        memberNames.add("AMITABH");
        memberNames.add("SHEKHAR");
        memberNames.add("RAHUL");
        memberNames.add("SHAHRUKH");
        memberNames.add("YANA");

        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(memNamesInUppercase);

        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        Stream<Integer> lengthStream = memberNames.stream().map(s -> s.length());

        Supplier<Stream<Integer>> streamSupplier = () -> memberNames.stream().map((x)->x.length());

        Optional<Integer> sum = streamSupplier.get().reduce(Integer::sum);
        sum.ifPresent(System.out::println);



        Optional<Integer> reduced2 = lengthStream
                .reduce((s1, s2) -> s1 + s2);
        reduced2.ifPresent(System.out::println);


        // Suplier

        Optional<Integer> reduced3 = streamSupplier.get()
                .reduce((s1, s2) -> s1 + s2);
        reduced3.ifPresent(System.out::println);



        // same or different stream?
        System.out.println(streamSupplier.get() == streamSupplier.get());

    }

}
