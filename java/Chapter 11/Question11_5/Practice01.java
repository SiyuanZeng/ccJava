package Question11_5;

/**
 * Created by SiyuanZeng's on 10/13/2014.
 */
public class Practice01 {
    public static void main(String[] args) {
        String[] stringList = {"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower"};
        System.out.println("result is " + findString(stringList, 0, 13, "flower"));

        //for (String s : stringList) {
        //	String cloned = new String(s);
        //	System.out.println("<" + cloned + "> " + " appears at location " + search(stringList, cloned));
        //}
    }


    public static int findString(String[] arr, int start, int end, String str) {

        if (start > end) {//Why would this one happen?
            return -1;
        }

        int mid = start + (end - start) / 2;

        int result = -1;

        int temp = mid;
        // Should go both end,  it would be easier
        while (arr[temp].trim().length() == 0 && temp <end) {
            temp++;
            if (arr[temp].trim().length() != 0) {
                mid = temp;
            }

        }

        if (str.compareTo(arr[mid]) == 0) {
            return mid;
        }

        if (arr[mid].trim().length() != 0 && str.compareTo(arr[mid]) > 0) {
            result = findString(arr, mid+1, end, str);// Plus one to prevent infinite loop, such as 10 for mid, and 11 for end.
        } else if (arr[mid].trim().length() != 0 && str.compareTo(arr[mid]) < 0) { // String library.
            result = findString(arr, start, mid - 1, str);// > 0, means that it is in the front of the compared value.Seems to be stringBufferReverse.
        } else { // The middle is empty value.
            result = findString(arr, mid + 1, end, str);// Plus one to prevent infinite loop, such as 10 for mid, and 11 for end.
            if (result == -1)
            result = findString(arr, start, mid - 1, str);// > 0, means that it is in the front of the compared value.Seems to be stringBufferReverse.
        }


        return result;
    }
}
