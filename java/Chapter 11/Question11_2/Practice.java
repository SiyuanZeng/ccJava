package Question11_2;

import CtCILibrary.AssortedMethods;

/**
 * Created by SiyuanZeng's on 10/12/2014.
 */
public class Practice {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
        sort(array);
        System.out.println(AssortedMethods.stringArrayToString(array));
    }

    public static void sort(String[] arr) {
        // What is the order?
        // How to check whether strings are anagram?
        for (int runner = 0; runner < arr.length; runner++) {
            int lastNonAnagram = runner + 1;
            for (int i = runner + 1; i < arr.length; i++) {
                boolean result = checkAnagram(arr[runner], arr[i]);
                if (result) {
                    String temp = arr[lastNonAnagram];
                    arr[lastNonAnagram] = arr[i];
                    arr[i] = temp;
                    lastNonAnagram++;// This one is critical
                }
            }
            runner++;
        }
    }

    public static boolean checkAnagram(String strA, String strB) {
        // Assumption, ASCII
        if (strA.length() != strB.length()) return false;

        int[] charsA = new int[256];

        int index = 0;
        while (index < strA.length()) {
            charsA[strA.charAt(index)]++;
            index++;
        }

        int indexB = 0;
        while (indexB < strB.length()) {
            charsA[strB.charAt(indexB)]--;
            if (charsA[strB.charAt(indexB)] < 0) {
                return false;
            }
            indexB++;
        }

        return true;
    }


}
