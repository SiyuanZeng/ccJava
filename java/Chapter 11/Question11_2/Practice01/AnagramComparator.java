package Question11_2.Practice01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by SiyuanZeng's on 10/14/2014.
 */
public class AnagramComparator implements Comparator<String> {
    public int compare(String strA, String strB) {
        return sort(strA).compareTo(sort(strB));
    }

    public String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

}