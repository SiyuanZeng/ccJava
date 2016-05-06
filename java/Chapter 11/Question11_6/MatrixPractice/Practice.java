package Question11_6.MatrixPractice;

import CtCILibrary.AssortedMethods;

public class Practice {
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
        int littleOverTheMax = matrix[m - 1][n - 1] + 10;//What is this?
        for (int i = 0; i < littleOverTheMax; i++) {// For each element
            Coordinate c = findElement(matrix, i);
            if (c != null) {
                System.out.println(i + ": (" + c.getRow() + ", " + c.getCol() + ")");
                count++;
            }
        }
        System.out.println("Found " + count + " unique elements.");
    }

    public static Coordinate findElement(int matrix[][], int target) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        Coordinate orig = new Coordinate(0, 0);
        Coordinate dest = new Coordinate(row, col);

        return findElement(matrix, orig, dest, target);

    }

    private static Coordinate findElement(int[][] matrix, Coordinate origin, Coordinate dest, int target) {
        if (!origin.isWithin(matrix) || !dest.isWithin(matrix)) {
            return null;
        }
        // Whenever you write to the method call, then write the method for the method control.
        if (matrix[origin.getRow()][origin.getCol()] == target) { // What is the parameter in the [][]?	// Not sure
            return origin;
        } else if (!origin.isBefore(dest)) {
            return null;
        }

        Coordinate pivot = origin.clone();
        int colDif = dest.getCol() - origin.getCol();
        int rowDif = dest.getRow() - origin.getRow();
        int diagnoalDif = Math.min(colDif, rowDif);
        Coordinate end = new Coordinate(pivot.getRow() + diagnoalDif, pivot.getCol() + diagnoalDif);

        findPivot(matrix, origin, end, pivot, target);

        return partitionAndSearch(matrix, origin, end, pivot, target);


    }


    public static Coordinate partitionAndSearch (int matrix[][], Coordinate origin, Coordinate end, Coordinate pivot, int target) {

        Coordinate leftLowerOrigin = new Coordinate (pivot.getRow(), origin.getCol());
        Coordinate leftLowerDest = new Coordinate (end.getRow(), pivot.getCol() - 1);
        Coordinate rightUpperOrigin = new Coordinate (origin.getRow(), pivot.getCol() + 1);
        Coordinate rightUpperDest = new Coordinate (pivot.getRow() - 1, end.getCol());

        Coordinate result = findElement(matrix, leftLowerOrigin, leftLowerDest, target);
        if ( result == null) {
            result = findElement(matrix, rightUpperOrigin, rightUpperDest, target);
        }
        return result;
    }

    private static void findPivot(int[][] matrix, Coordinate origin, Coordinate end, Coordinate pivot, int target) {
        while(origin.isBefore(end)) {
            origin.setAverage(origin, end);
            if (target > matrix[origin.getRow()][origin.getCol()]) {
//                pivot = new Coordinate(origin.getRow() + 1, origin.getCol() + 1);
                origin = new Coordinate(origin.getRow() + 1, origin.getCol() + 1);	// Not sure here. Hard to tell which parameter is used?
            } else {
                end =   new Coordinate(origin.getRow() - 1, origin.getCol() - 1);
//                pivot =   new Coordinate(origin.getRow() - 1, origin.getCol() - 1);
            }



        }
    }



}
