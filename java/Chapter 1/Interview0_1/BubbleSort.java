package Interview0_1;

public class BubbleSort {
	public static void main(String[] args) {
		int [] strArray = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

		for (int i = 0 ; i < strArray.length; i++) {
			for (int j = 0 ; j < strArray.length; j++) {
				int min = Integer.MAX_VALUE;
				if (min > strArray[j]) {
					min = strArray[j];
					int temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
		System.out.print(strArray);
	}
}
