package Question11_5;

public class Practice02 {

    public static void main(String[] args) {
        String[] stringList = {"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower"};
        System.out.println(search(stringList, 0, 14, "ac"));
        System.out.println(search(stringList, 0, 14, "apple"));
        System.out.println(search(stringList, 0, 14, "banana"));
        System.out.println(search(stringList, 0, 14, "carrot"));
        System.out.println(search(stringList, 0, 14, "duck"));
        System.out.println(search(stringList, 0, 14, "eel"));
        System.out.println(search(stringList, 0, 14, "flower"));

        //for (String s : stringList) {
        //	String cloned = new String(s);
        //	System.out.println("<" + cloned + "> " + " appears at location " + search(stringList, cloned));
        //}
    }
    public static int search(String[] array, int start, int end, String target) {
        if (start < 0 || end > array.length || end < 0 || start > array.length) {//Both boundaries should check.
            return -1;
        }

        int middle = (end - start) / 2 + start;


        if (array[middle].isEmpty()) {
            int left = middle --;
            int right = middle ++;
            while (array[left].isEmpty() && array[right].isEmpty()) {
                left--;
                right++;
            }
            if (!array[left].isEmpty()) {
                middle = left;
            } else if (!array[right].isEmpty()) {
                middle = right;
            } else {
                return -1;
            }
        }
        if (target.compareTo(array[middle]) == 0) {
            return middle;
        } else if (target.compareTo(array[middle]) > 0) {    //What is the value?
            return search(array, middle + 1, end, target);
        } else {
            return search(array, start, middle - 1, target);
        }
    }
}
