package Interview0_1;

public class PartionNegativeAndPositive {

	public static int[] sort(int[] arr) {
		int[] res = new int[arr.length];//int[arr.length]
		int index = 0;
		for (int i = 0; i< arr.length; i++) {
			if ( arr[i] < 0 ) {
				res[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i< arr.length; i++) {
			if ( arr[i] == 0 ) {
				res[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i< arr.length; i++) {
			if ( arr[i] > 0 ) {
				res[index] = arr[i];
				index++;
			}
		}

		return res;
	}
}
