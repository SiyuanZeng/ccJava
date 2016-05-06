package Interview0_1;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by SiyuanZeng's on 4/29/2016.
 */
public class FindMostDuplicate {

    public static int findMostDuplicate(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i = 0; i< arr.length; i++) {
            if ( null != map.get(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }


        int maxCount = 0;
        int number = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet() ) {

            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();// forget this, so that it always come out the last value.
                number = entry.getKey();
                System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            }
        }

        return number;
    }
}
