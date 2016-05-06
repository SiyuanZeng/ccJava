package Question11_1;

import CtCILibrary.AssortedMethods;

/**
 * Created by SiyuanZeng's on 10/14/2014.
 */
public class Practice03 {
    public static void merge (int[] arrA, int[] arrB, int lenA, int lenB) {
        int indexMerged = lenA + lenB - 1;
        int indexA = lenA - 1;
        int indexB = lenB - 1;

        while (indexB >= 0 ) {// Why use B, because A has buffer, once move all B elements to A, then we can call it done.
            if (indexA >= 0 && arrA[indexA] >= arrB[indexB]) {//If arrA[indexA] >= arrB[indexB], then 765, 555.
                arrA[indexMerged] = arrA[indexA];
                indexA--;
            } else { // indexA < 0 ||  indexA >= 0 && arrA[indexA] < arrB[indexB])
                arrA[indexMerged] = arrB[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }


    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {2, 2, 2, 2, 2, 2};
        merge(a, b, 8, 6);
        System.out.println(AssortedMethods.arrayToString(a));
    }
}
