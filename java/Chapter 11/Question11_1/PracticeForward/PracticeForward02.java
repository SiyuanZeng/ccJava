package Question11_1.PracticeForward;

import CtCILibrary.AssortedMethods;

/**
 * Created by SiyuanZeng's on 10/19/2014.
 */
public class PracticeForward02 {

    public static void merge(int arrA[], int arrB[], int lenA, int lenB) {

        int runnerA = 0;
        int runnerB = 0;
        while (runnerB < lenB ) {
            while (runnerA < lenA) {
                if (arrB[runnerB] <= arrA[runnerA]) {
                    int lenACopy = lenA -1 ;
                    while (lenACopy >= runnerA) {
                        arrA[lenACopy+ 1] = arrA[lenACopy];
                        lenACopy --;
                    }
                    arrA[runnerA] = arrB[runnerB];// What parameters do I need?
                    runnerB++;
                    runnerA++;
                    lenA++;//constraints?
                    break;
                }
                runnerA++;
            }
        // How to write correct codes?
            while (runnerA >= lenA && runnerB < lenB) {
                arrA[runnerA] = arrB[runnerB];
                runnerA++;
                runnerB++;
            }
        }
    // To write the algorithm, first make it wrok then consider about refactoring. Or it will be too hard to have the precise soluation immediately.
    // Write
        // debug

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 7, 6, 7, 7};
        merge(a, b, 8, 6);
        System.out.println(AssortedMethods.arrayToString(a));
    }


}



// Why does it take so much time to write a algorithm ?
//

