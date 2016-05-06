package Question11_6.MatrixPractice;


/**
 * Created by SiyuanZeng's on 10/19/2014.
 */
public class Coordinate {
    private int row = 0;
    private int col = 0;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }


    public boolean isWithin(int[][] matrix) {
        return getRow()>= 0 && getRow()<= matrix.length && getCol() >= 0 && getCol() <= matrix[0].length;
    }

    public boolean isBefore(Coordinate dest) {
        return row <= dest.getRow() && col <= dest.getCol();
    }

    public Coordinate clone() {
        return new Coordinate(row, col);
    }

    public void setAverage( Coordinate origin, Coordinate end) {
        col = (origin.getCol() + end.getCol())/2;
        row  = (origin.getRow() + end.getRow()) / 2;
    }

}
