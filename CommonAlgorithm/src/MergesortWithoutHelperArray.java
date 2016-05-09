
public class MergesortWithoutHelperArray {

	public static void main(String[] args) {
		MergesortWithoutHelperArray qs = new MergesortWithoutHelperArray();
		qs.sort(qs.arr);
		for (int i = 0; i < qs.arr.length; i++) {
			System.out.print(qs.arr[i] + ",");
		}
	}

	private int[] arr = { 23, 8, 9, 3, 0, 24, 5, 7, 9, 123 };
	private int[] helpArr;

	private int arrLength;

	public void sort(int[] arr) {
		this.arr = arr; // use the specific plus generic term.
		arrLength = arr.length;
		this.helpArr = new int[arrLength];
		mergeSort(0, arrLength - 1);
	}

	private void mergeSort(int lo, int hi) {
		// check if lo is smaller then hi, if not then the array is sorted
		// SPLIT TO ONLY 1 ELEMENT
        // How come this become lower than hi value ?
		if (lo < hi) {
			// Get the index of the element which is in the mid, why is this ?
			int mid = lo + (hi - lo) / 2;
			// Sort the left side of the array
            // how does the recurrsive happen?
			mergeSort(lo, mid);
			// Sort the right side of the array
			mergeSort(mid + 1, hi);
			// Combine them both
			merge(lo, mid, hi);
		}
	}

	private void merge(int lo, int mid, int hi) {

		int helpLo = lo;
		int helpMid = mid + 1;
		int oriLo = lo; // beloning,specific, and generic.
		// Copy the smallest values from either the left or the right side back
		// to the original array
		
		
		//COMPARE AND SWITCH
        // can use while to simulate 2 variable loop.
        // how to decide the boundary value.

        while (helpLo <= mid && helpMid <= hi) {
            if (arr[helpLo] <= arr[helpMid]) {
                // copy back to original array.
                int temp = arr[oriLo];
                arr[oriLo] = arr[helpLo];
                arr[helpLo] = temp;
                // how to increment this one? copied, then put in original array.
				helpLo++;
			} else {
                int temp = arr[oriLo];
				arr[oriLo] = arr[helpMid];
                arr[helpMid] = temp;
                // copied, then put in the original array and increment the number.
				helpMid++;
			}
			oriLo++;
		}
		//COPY LFET.

        while (helpLo <= mid) {
            int temp = arr[oriLo];
			arr[oriLo] = arr[helpLo];
            arr[helpMid] = temp;
			oriLo++;
			helpLo++;
		}
		// Copy the rest of the left side of the array into the target array
		
		//
		// senario 1:  9,8,7,4,3,2,1  ,  1,2,3,4, then stop, still need to copy left side
		// senario 2:  1,2,3,9,5,6,0. All right is move, but one left is still pending.
		
		


	}
}