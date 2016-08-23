package RealInterview;

/**
 * Created by SiyuanZeng's on 5/12/2016.
 */
public class AppleClientTest {
    public static boolean areAnagrams(String a, String b) {
        char[] characters = a.toCharArray();
        StringBuilder sbSecond = new StringBuilder(b);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("neural", "unreal"));
    }


}
