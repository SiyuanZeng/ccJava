package Question11_3;

/**
 * Created by SiyuanZeng's on 10/19/2014.
 */
public class Practice02 {

    public static int findElement(int target, int[] array, int start, int end) {

        if (start < 0 && end >= array.length) {    // Can not remmeber the exact code, have to use reference. How to improve reference?
            return -1;    // Wrong return
        }

        if (start > end) {
            return -1;
        }

        int middle = (end - start) / 2 + start;
        if (target == array[middle]) {
            return middle;
        }


        if (array[start] <= array[middle]) {    // Should not use 0, because this is a iterative method
            if (array[start] <= target && target <= array[middle]) {    // How about equal sign?
                return findElement(target, array, start, middle - 1);
            } else {
                return findElement(target, array, middle + 1, end);
            }
        } else if (array[start] >= array[middle]) {
            if (array[middle] <= target && target <= array[end]) {
                return findElement(target, array, middle + 1, end);
            } else {
                return findElement(target, array, start, middle - 1);
            }
        } else {
            if (array[middle] == array[end]) {    // What is the scenario here? Can' t remember the processes.
                return findElement(target, array, start, middle - 1);
            } else {
                return findElement(target, array, middle + 1, end);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 8, 0, 1, 2, 2, 2, 2};

        System.out.println(findElement(2, a, 0, a.length - 1));
        System.out.println(findElement(3, a, 0, a.length - 1));
        System.out.println(findElement(4, a, 0, a.length - 1));
        System.out.println(findElement(1, a, 0, a.length - 1));
        System.out.println(findElement(8, a, 0, a.length - 1));
    }


}
