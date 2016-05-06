package Question11_3;

// Good logic, I didn't even think of this one. Complicated.
public class Question {

    public static int search(int arr[], int leftBound, int rightBound, int target) {
        if (rightBound < leftBound) { // How come this is possible? Check error? Check all the assumption?
            return -1;
        }

        int middle = (leftBound + rightBound) / 2;

        if (target == arr[middle]) { // Found element, it is better to put in the beginning.
            return middle;
        }

		/* While there may be an inflection point due to the rotation, either the leftBound or
		 * rightBound half must be normally ordered.  We can look at the normally ordered half
		 * to make a determination as to which half we should search. 
		 */
        if (arr[leftBound] < arr[middle]) {
            // Left is normally ordered. What does it mean normally ordered? Normally the right will be smaller than the left.  4567123    87654  It may be ...876...
            if (target >= arr[leftBound] && target <= arr[middle]) {
                return search(arr, leftBound, middle - 1, target);
                //Not include middle
            } else {
                return search(arr, middle + 1, rightBound, target);
                // Right half
            }
        } else if (arr[leftBound] > arr[middle]) {
            // Right is normally ordered. Because normally the number on the right should be larger than the left one, if small, then means, it is in right order.
            if (arr[middle] <= target && target <= arr[rightBound]) {
                return search(arr, middle + 1, rightBound, target);
            } else {
                return search(arr, leftBound, middle - 1, target);
            }

            /*if (arr[middle] <= target && target <= arr[leftBound] ) { // left is not in order. Can not search on left. 456789123. For example target = 2. Should search right.
                return search(arr, leftBound, middle - 1, target);//Not include middle
            } else {
                return search(arr, middle + 1, rightBound, target);// Right half
            }*/

        } else if (arr[leftBound] == arr[middle]) {
            // Left is either all repeats OR loops around (with the rightBound half being all dups). I didn't think the duplicate scenarios.
            if (arr[middle] != arr[rightBound]) {
                // If rightBound half is different, search there, why?  Means Left is repeated
                return search(arr, middle + 1, rightBound, target);
            } else { // Else, we have to search both halves. Why? {2, 3, 2, 2, 2, 2, 2, 2,2 } // Means the left is loop around and the right part is loop.
                int result = search(arr, leftBound, middle - 1, target); //{2, 2, 2, 2, 2, 2, 2,3}  3, big, and 2 small on the rightBound, then it must be max and min.
                if (result == -1) {
                    return search(arr, middle + 1, rightBound, target);
                } else {
                    return result;
                }
            }
            //}
        }
            return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 8, 0, 1, 2, 2, 2, 2};

        System.out.println(search(a, 0, a.length - 1, 2));
        System.out.println(search(a, 0, a.length - 1, 3));
        System.out.println(search(a, 0, a.length - 1, 4));
        System.out.println(search(a, 0, a.length - 1, 1));
        System.out.println(search(a, 0, a.length - 1, 8));
    }

    /*
        There can only be a bump in the array
        start < middle
        start > middle
        start == middle
        middle != right // left part is same
        middle == right // both may be true
    */

}
