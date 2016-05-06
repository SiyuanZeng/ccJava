package Question11_6.MatrixPractice02;

import CtCILibrary.AssortedMethods;


/**
 * Created by SiyuanZeng's on 10/20/2014.
 */
 public class Practice02 {
     public static void main(String[] args) {
        int[][] matrix = {{15, 30,  50,  70,  73},
                          {35, 40, 100, 102, 120},
                          {36, 42, 105, 110, 125},
                          {46, 51, 106, 111, 130},
                          {48, 55, 109, 140, 150}};

        AssortedMethods.printMatrix(matrix);
        int m = matrix.length;
        int n = matrix[0].length;

        int count = 0;
        int littleOverTheMax = matrix[m - 1][n - 1] + 10;//What is this? upper bound for search.
        for (int i = 0; i < littleOverTheMax; i++) {// For each element
            Coordinate c = findElement(matrix, i);
            if (c != null) {
                System.out.println(i + ": (" + c.getRow()+ ", " + c.getCol()+ ")");
                count++;
            }
        }
        System.out.println("Found " + count + " unique elements.");
    }

    private static Coordinate findElement(int[][] matrix, int i) {

        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        Coordinate end = new Coordinate(row, col);
        Coordinate start = new Coordinate(0, 0);
        // Prepare end and start point so that we can always reuse findElement(). For reuse.

        return findElement(matrix, start, end, i);
    }

    private static Coordinate findElement(int[][] matrix, Coordinate start, Coordinate end, int target) {
        if (!end.isWithin(matrix) || !start.isWithin(matrix)) {
            return null;
        }

        int startRow = start.getRow();
        int startCol = start.getCol();

        if (!start.isBefore(end)) { //This one has to be here? or it can only find 19 elements. dependency on the first if condition.This corner case is so weird.
            return null;
        }
        // Debugging is so important, it really helps to understand the program. Because there is something you don't know, by debugging, I can understand the role of the missing code.
        // If there is something wrong about the program, it is so hard to capture it.

        /*Find the diagonal line.*/
        Coordinate pivotStart = (Coordinate) start.clone();
        int rowDif = end.getRow() - start.getRow();
        int colDif = end.getCol() - start.getCol();
        int diaDif = Math.min(colDif, rowDif);

        // It seems that the coordinate should not be 0.
        Coordinate pivotMiddle = new Coordinate(0, 0);//  I felt that pivotMiddle should start from start instead of origin.The error should happen here, but I don't know why.
        Coordinate dest = new Coordinate(pivotStart.getRow() + diaDif, pivotStart.getCol() + diaDif);// Is this one the same as end? Here should use pivot instead of start.


        findPivot(matrix, pivotStart, pivotMiddle, dest, target);// The parameters here are confusing.
        // The pivot will actually go out of bound and still legal.

        if (pivotStart.isWithin(matrix) && target == matrix[pivotStart.getRow()][pivotStart.getCol()]) {
            return new Coordinate(startRow, startCol);
        }
            return partitionAndSearch(matrix, pivotStart, start, end, target);
    }

    private static Coordinate partitionAndSearch(int[][] matrix, Coordinate pivot, Coordinate start, Coordinate end, int target) {
        Coordinate leftLowerStart = new Coordinate(pivot.getRow(), start.getCol());
        Coordinate leftLowerEnd = new Coordinate(end.getRow(), pivot.getCol() - 1);
        Coordinate rightUpperStart = new Coordinate(start.getRow(), pivot.getCol());
        Coordinate rightUpperEnd = new Coordinate(pivot.getRow() - 1, end.getCol());
        // pivot can be > end, thus causing rightUpperStart > rightUpperEnd
        Coordinate result = findElement(matrix, leftLowerStart, leftLowerEnd, target);
        if (null == result) {
            return findElement(matrix, rightUpperStart, rightUpperEnd, target);
        }
        return result;
    }
    // I can only find 19, I don't know why, but it is wrong, I check everything, but it is still wrong. totally no idea how does it happen.
    // What should I do?
    // What should be careful when developing software?
    private static void findPivot(int[][] matrix, Coordinate pivot, Coordinate pivotMiddle, Coordinate end, int target) {// confusing
        while (pivot.isBefore(end)) {// Why do we need this one?
            pivotMiddle.setAverage(pivot, end);// The parameter pivot here seems to be wrong before when it was pivotMiddle.
             if (target  >= matrix[pivotMiddle.getRow()][pivotMiddle.getCol()]) {// Do I need to get it equal? Do I need to code it?
                 pivot.setRow(pivotMiddle.getRow() + 1);
                 pivot.setCol(pivotMiddle.getCol() + 1);
            } else {
                end.setRow(pivotMiddle.getRow() - 1);
                end.setCol(pivotMiddle.getCol() - 1);
            }
        }
    }


}
