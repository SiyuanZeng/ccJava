package Question11_2.Practice01;

import CtCILibrary.AssortedMethods;

import java.util.Arrays;

/**
 * Created by SiyuanZeng's on 10/14/2014.
 */
public class Practice {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
        AnagramComparator comparator = new AnagramComparator();
        Arrays.sort(array, new AnagramComparator());
        System.out.println(AssortedMethods.stringArrayToString(array));
    }
}
