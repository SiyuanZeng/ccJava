public class ShellSort {
	private long[] arr;

	private int len;

	public ShellSort(int max) {
		arr = new long[max];
		len = 0;
	}

	public void insert(long value) {
		arr[len] = value;
		len++;
	}

	public void display() {
		System.out.print("Data:");
		for (int j = 0; j < len; j++)
			System.out.print(arr[j] + " ");
		System.out.println("");
	}

	public void shellSort() {
        int inPos, outPos;
        long temp;
        // find initial value of h
        int itvl = 1;
        int times = len / 4;
        while (times > itvl) {
            // 3
            // why interval is 1?
            itvl = itvl * 4 + 1; // (1, 4, 13, 40, 121, ...)
            //what h is determined like this?
            System.out.println("initial value of h:" + itvl);
        }


        while (itvl > 0) {
            // decreasing h, until h=1
            // h-sort the file
            for (outPos = itvl; outPos < len; outPos++) {
                inPos = outPos;
                // WHY?
                // one subpass (eg 0, 4, 8)
                temp = arr[outPos];
                // name the variable specific instead of generic name.
                int nxInPos = inPos - itvl;// 0
                while (inPos > itvl - 1 && arr[nxInPos] >= temp) { // the inPos is > 0 &&&&  if innter is bigger than smaller.
                    // make sure the itvl - 1 is more than 0.
                    // satisfy both at the same time.
                    // What does  inPos > h - 1 mean?  jump backword. what if it is equal?
                    arr[inPos] = arr[nxInPos]; // swap, what if I have multiple inPos?
                    // how does itvl change?
                }
                arr[inPos] = temp;
                // WHAT IS THIS?
                // if there is no lower position value, then just keep the tempFor Inner in the inner index
                // arr[inPos] is the lowest one.
            }
            itvl = (itvl - 1) / 4;
            // decrease h, 9, 2, 1
        }
    }

	public static void main(String[] args) {
		int maxSize = 10;
		ShellSort arr = new ShellSort(maxSize);

		for (int j = 0; j < maxSize; j++) {
			long n = (int) (java.lang.Math.random() * 99);
			arr.insert(n);
		}
		arr.display();
		arr.shellSort();
        System.out.println("result");
        arr.display();
	}
}