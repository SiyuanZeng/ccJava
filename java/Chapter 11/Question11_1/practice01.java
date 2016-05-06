package Question11_1;

import CtCILibrary.AssortedMethods;

/**
 * Created by SiyuanZeng's on 10/12/2014.
 */
public class practice01 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 7, 6, 7, 7}; // Why is it sorted?
        combine(a, b, 8, 6);
        System.out.println(AssortedMethods.arrayToString(a));
    }

    public static void combine(int[] arrA, int[] arrB, int lenA, int lenB) {
        //Qustion: Do I know how many elements are there?
        // What is the value of buffers?
        //

//        int len1 = last1; Useless
//        int len2 = last2;
// Problem, I don't even know how to read my own code. No abbreviation. Comment on what scenarios. Try to combine and invert boolean expression.
        // I forget why I wrote the code.
        // What does the loop do?
        // hard to know why certain thing calculation is there, like incrementation. Have to read the whole thing and picture the difference.
        // if do something, else do another thing. Skip, shift, and copy.
        // while is boundary. Condition, seperate different scope and do different things.


        int posA = 0;
        int posB = 0;
        while (posB < arrB.length) { // General constraits.

            while (posA < arrA.length) {
//                int posB = last2 - len2;// The last will change and thus make it wrong for the posB. Debug: correlated variables. Calculation ---> condition.
//                int posA = last1 - len1;


                boolean posAGreatherThanLengthAAndPosBLessThanLengthB = posA >= lenA && posA <= arrA.length && posB <= lenB;
                if (arrB[posB] > arrA[posA] && !posAGreatherThanLengthAAndPosBLessThanLengthB) { // This one can be inverted to reduce the complexities.
                    posA++;
                    continue;
                } else if (arrB[posB] < arrA[posA] && arrA[posA] != 0) { // Why do I need the last expression? 0 means that it is the default value.
                    lenA++;
                    for (int i = lenA-1; i > posA; i--) {// Watch out the last Index, should minus 1.
                        arrA[i] = arrA[i - 1];
                    }
                    arrA[posA] = arrB[posB];
                    arrB[posB] = 0;// This one is not neccesarry.
                    posA++;
                    posB++;
                    break;// Why will I have 2 different solutions?
                } else {
                    if (posAGreatherThanLengthAAndPosBLessThanLengthB) {
                        arrA[posA] = arrB[posB];
                        arrB[posB] = 0;
//                        len2--;// Confusing, how to change the variable len1 and len2?
//                        len1--;
                        lenA++;
                        posA++;
                        posB++;
                        break;
                    } // How to represent the condition?
                    posA++;
                }
            }



        }


    }

}
