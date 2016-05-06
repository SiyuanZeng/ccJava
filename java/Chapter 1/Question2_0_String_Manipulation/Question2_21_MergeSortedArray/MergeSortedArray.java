package Question2_0_String_Manipulation.Question2_21_MergeSortedArray;

import java.util.Arrays;

/**
 * Created by SiyuanZeng's on 4/27/2016.
 */
public class MergeSortedArray {

    public static int[] mergerSort(int [] arr1, int[] arr2) {
        int[] result = new int[arr1.length+arr2.length];
        int[] arr1Sorted = sortArray(arr1);
        int[] arr2Sorted = sortArray(arr2);

        int index = 0;
        int i = 0;
        int j = 0;
        while (i<arr1Sorted.length || j < arr2Sorted.length){
            if(i >= arr1Sorted.length ) {
                result[index] = arr2Sorted[j];
                j++;
            } else if(j >= arr2Sorted.length ) {
                result[index] = arr1Sorted[i];
                i++;
            } else if(arr1Sorted[i] > arr2Sorted[j]) {
                result[index] = arr2Sorted[j];
                j++;
            } else {
                result[index] = arr1Sorted[i];
                i++;
            }
            index++;
        }
        return result;
    }

    public static int[] mergerSortBetter(int [] arr1, int[] arr2) {
        int arr1Length = arr1.length-1;
        arr1 = sortArray(arr1);
        arr1 = Arrays.copyOf(arr1, arr1.length+arr2.length);
        int[] arr2Sorted = sortArray(arr2);

        int index = arr1.length-1;
        int i = arr1Length;
        int j = arr2.length-1;

        while (i>=0 || j >=0){
            if(i<0 || j < 0){
                break;
            } else if (arr1[i] > arr2Sorted[j]) {
                arr1[index] = arr1[i];
                i--;
            } else {
                arr1[index] = arr2Sorted[j];
                j--;
            }
            index--;
        }

        while (i>=0 ){
            arr1[index]=arr1[i];
            i--;
            index--;
        }

        while (j>=0 ){
            arr1[index]=arr2[j];
            j--;
            index--;
        }
        return arr1;
    }

    private static int[] sortArray(int[] arr1) {
        int [] arr1Sorted = new int[arr1.length];
        for (int i=0; i<arr1.length; i++){
            int min = Integer.MAX_VALUE;
            int minIndex=0;
            for (int j=0; j<arr1.length; j++) {
                if (min > arr1[j] && arr1[j]>=0) {//missing =
                    min = arr1[j];
                    minIndex = j;
                }
            }
            arr1Sorted[i]=min;
            arr1[minIndex]=-1;
        }
        return arr1Sorted;
    }

    private static int[] quickSort(int[] arr, int start, int end){
        int originStart = start;
        int originEnd = end;

        if (start > end){
            return null;
        }

        int pivot = arr[start + (end-start)/2];

        while (start <= end){

            while (arr[start]< pivot){
                start++;
            }

            while(arr[end]>pivot){
                end--;
            }

            if (start<=end){
                exchange(arr, start, end);
                start++;
                end--;
            }
        }

        if (start<originEnd){
            quickSort(arr, start, originEnd);
        }
        if (end>originStart){
            quickSort(arr, originStart, end);
        }

        return arr;
    }


    private static void exchange(int arr[], int start, int end){
        int tem = arr[start];
        arr[start]=arr[end];
        arr[end] = tem;
    }




}
