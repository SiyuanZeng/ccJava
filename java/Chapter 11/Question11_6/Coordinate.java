package Question11_6;

public class Coordinate implements Cloneable {
	public int row;
	public int column;
	public Coordinate(int r, int c) {
		row = r;
		column = c;
	}
    // Relation to another object, add relationship check.
	public boolean inbounds(int[][] matrix) {
		return 	row >= 0 &&
				column >= 0 &&
				row < matrix.length &&
				column < matrix[0].length;
	}
    // Compare with another check.
	public boolean isBefore(Coordinate p) {
		return row <= p.row && column <= p.column;
	}
	
	public Object clone() { 
		return new Coordinate(row, column);
	}
	
	public void moveDownRight() {
		row++;
		column++;
	}
	
	public void setToAverage(Coordinate min, Coordinate max) {
		row = (min.row + max.row) / 2;
		column = (min.column + max.column) / 2;
	}

    @Override
    public String toString() {
        return "Coordinate{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
