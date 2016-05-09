package LeetCode.FlatternNestedListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class FlatternNestedListIterator {

    public static List<Object> list(Object... args) {
        return Arrays.asList(args);
    }

    public static List<Object> flattenNonRecursive(List<Object> list) {
        List<Object> result = new ArrayList<>();
        LinkedList<Object> que = new LinkedList<>(list);
        while (que.size() > 0) {
            Object e = que.remove();
            if (e instanceof List<?>)
                que.addAll(0, (List<?>)e);
            else
                result.add(e);
        }
        return result;
    }

    //todo sorted

    public static void main(String[] args) {
        List<Object> list = list(1, 3, 5, list(6, 7), 8, 9, 10, list(11, 13, 15, list(16, 17, list(18, 19))), 20);
        System.out.println("flatten=" + flattenNonRecursive(list));
        // -> flatten=[1, 3, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 17, 18, 19, 20]

    }
}
