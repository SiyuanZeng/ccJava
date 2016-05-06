package Interview0_3.SubString;

import java.util.HashMap;

/**
 * Created by SiyuanZeng's on 5/5/2016.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    //

    public int lengthOfLongestSubstring1(String s) {
        if(s==null)
            return 0;
        boolean[] flag = new boolean[256];

        int result = 0;
        int start = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if (flag[current]) {
                result = Math.max(result, i - start);
                // the loop update the new start point
                // and reset flag array
                // for example, abccab, when it comes to 2nd c,
                // it update start from 0 to 3, reset flag for a,b
                for (int k = start; k < i; k++) {
                    if (arr[k] == current) {
                        start = k + 1;
                        break;
                    }
                    flag[arr[k]] = false;
                }
            } else {
                flag[current] = true;
            }
        }

        result = Math.max(arr.length - start, result);

        return result;
    }


    //

    public static int lengthOfLongestSubstring2(String s) {
        if(s==null)
            return 0;
        char[] arr = s.toCharArray();
        int pre = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                pre = Math.max(pre, map.size());
                i = map.get(arr[i]);
                map.clear();
            }
        }

        return Math.max(pre, map.size());
    }
}
