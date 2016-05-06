package Question11_3;

/**
 * Created by SiyuanZeng's on 10/12/2014.
 */
public class Practice01 {
    public static int findElement(int[] arr, int start, int end, int element) {
        int middle = start + (end - start)/2;
        int index = -1;
        if (element > arr[middle]) {
            index = findElement(arr, middle, end, element); // How to make sure the middle is included?
        } else if (element < arr[middle]) {
            index = findElement(arr, start, middle, element);
        } else {
            index = middle;
        }
        return index;
    }
}

// It has been some time that I forget what are the different scenarios.
