package Question11_6;

import CtCILibrary.AssortedMethods;

/**
 * Created by SiyuanZeng's on 10/13/2014.
 */
public class Practice01 {


    public static void main(String[] args) {
        int M = 10;
        int N = 5;
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 10 * i + j;
            }
        }

        AssortedMethods.printMatrix(matrix);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                int v = 10 * i + j;
                System.out.println(v + ": " + searchMatrix(matrix, 10 - 1, 5 - 1, v));
            }
        }

    }

    public static Position searchMatrix(int[][] matrix, int x, int y, int num) {
        Position pos = new Position();
        int k = y/x;

        int xMid = x/2;
        int yMid = y/2;


        if (matrix[xMid][yMid] == num) {
            pos.setX(xMid);
            pos.setY(yMid);
            return pos;
        }



        if (matrix[xMid][yMid] > num) {
            for (int i = xMid; i >= 0 ; i--) {
                for (int j = yMid; j >= 0; j--) {
                    if (matrix[i][j] == num) {
                        pos.setX(i);
                        pos.setY(j);
                        return pos;
                    }
                }
            }
        } else if (matrix[xMid][yMid] < num){
            for (int i = xMid; i <= x; i++) {
                for (int j = yMid; j <= y; j++) {
                    if (matrix[i][j] == num) {
                        pos.setX(i);
                        pos.setY(j);
                        return pos;
                    }
                }
            }
        }
        return pos;
    }


}
