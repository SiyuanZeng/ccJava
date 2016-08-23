package Array;

/**
 * Created by SiyuanZeng's on 5/24/2016.
 */
public class MergeKArray {

    public static void merger(int[][] A, int m, int n) {
        int t = 0;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (A[i][j] > A[x][y]) {
                            t = A[x][y];
                            A[x][y] = A[i][j];
                            A[i][j] = t;
                        }
                    }
                }
            }
        }

            /* Printing the sorted 2D Array */

        System.out.println("The Sorted Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
        }
    }
}
