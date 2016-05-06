package Question11_6.MatrixPractice02;

/**
 * Created by SiyuanZeng's on 10/20/2014.
 */
public class Coordinate implements Cloneable{
    private int row;
    private int col;

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
        return 0 <= row &&
                0 <= col &&
                row <= matrix.length - 1 &&
                col <= matrix[0].length -1;//What else needed to be addressed?
    }

    public boolean isBefore(Coordinate another) {
        return row <= another.getRow() && col <= another.getCol();

    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }

    @Override
    public Object clone() {
        return new Coordinate(row, col);
    }

    public void setAverage(Coordinate start, Coordinate end) {
        row = (end.getRow() + start.getRow()) / 2;
        col = (end.getCol() + start.getCol()) / 2;
    }
}
