public class Quicksort {
	public static void main(String[] args) {

		Quicksort qs = new Quicksort();
		qs.sort(qs.oriArray);
		for (int i = 0; i < qs.oriArray.length; i++) {
			System.out.print(qs.oriArray[i] + ",");
		}
	}

	private int[] oriArray = { 23, 8, 9, 3, 1, 24, 5, 7, 9, 123 };
	private int arrLength;

	public void sort(int[] values) {
		// check for empty or null array
		if (values == null || values.length == 0) { // check both is important
			return;
		}
		this.oriArray = values;
		arrLength = values.length;
		quicksort(0, arrLength - 1);
	}

	private void quicksort(int zero, int last) {
		int lo = zero, hi = last;
		// Get the pivot element from the middle of the list
		int pivot = oriArray[zero + (last - zero) / 2];


		// Divide into two lists
		while (lo <= hi) { // this makes sure that it won't go beyond each other.
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (oriArray[lo] < pivot) {
				lo++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			// if it is equal, stop too. if(arrLength[j]<= pivot).
			while (oriArray[hi] > pivot) {
				hi--;
			}
			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (lo <= hi) {
				exchange(lo, hi);
				lo++;
				hi--;
			}// the before will just keep moving, until them meet each other.
		}// Recursion



        // DIVIDE
		if (zero < hi) { // this is smaller array
			quicksort(zero, hi); // can I use I here? I think so.they will just pass each, then stop. or to the end. 
		}
		if (lo < last) {// this is larger array
			quicksort(lo, last);
		}

        // what is the use of condition?
	}

	private void exchange(int i, int j) {
		int temp = oriArray[i];
		oriArray[i] = oriArray[j];
		oriArray[j] = temp;
	}
}
