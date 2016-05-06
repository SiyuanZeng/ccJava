package Question11_6;
import CtCILibrary.*;

public class QuestionB {
    // Proble
    //
    // m, can not see the connection of different methods. Print out and read on paper.
    // Every dialog and conversation related to a topic is useful.
	public static Coordinate partitionAndSearch(int[][] matrix, Coordinate origin, Coordinate dest, Coordinate pivot, int elem) {
        // Which positions are these? Only in 2 positions.
		Coordinate lowerLeftOrigin = new Coordinate(pivot.row, origin.column);
		Coordinate lowerLeftDest = new Coordinate(dest.row, pivot.column - 1);

		// Will the origin always be zero? Will change, like previous 2 lines.
		Coordinate upperRightOrigin = new Coordinate(origin.row, pivot.column);
		Coordinate upperRightDest = new Coordinate(pivot.row - 1, dest.column);
		
		Coordinate lowerLeft = findElement(matrix, lowerLeftOrigin, lowerLeftDest, elem); // Recursive
		if (lowerLeft == null) {
			return findElement(matrix, upperRightOrigin, upperRightDest, elem);
		}
		return lowerLeft;
	}


    //Naming rules, source, intention, condition,structure,
    //This method is called from different places.What does it mean to you?
	public static Coordinate findElement(int[][] matrix, Coordinate origin, Coordinate dest, int target) {
        // Initial check,
        // Understand all the what if question, delete something questions.
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5, next check will fail.
        // How and where, whenever there is a change, there must be a bound to make sure everything works fine. Or there will be IndexOutOfBoundsException
        if (!origin.inbounds(matrix) || !dest.inbounds(matrix)) {//How come this happen?//Where is the origin and destination get changed?
            return null;//One hard question to read others' code is why is this stuff here? Why not other places?
        }
        // Question, is this the best place to put the check?
        //Debugging skills
        if (matrix[origin.row][origin.column] == target) {//IndexOutofBoundException
            return origin;
        } else if (!origin.isBefore(dest)) {// Why? Will this one ever happen? int rowDif will be negative = dest.row - origin.row; won't try to find the pivot and will keep search the same, because there is not stop sign. It won't try to find the pivot and thus the pivot is always == start point.
            return null;
		}
        // Problem, spend too much time to understand the whole algorithm.
        // Set up, a parameter's life and everything connect to everything, every changes.
        // Problem, it is very hard to tell where these lines are there because it is very hard to track how does the problem happen, it is executed multiple times, hard to pinpoint, when and where did something weird happen.
        // Expertise, pinPoint the issue.
        // Without the last one, will have stack overflow.
        // Print out sth and use specific exception point.
        // Because next few lines, we need to subtract origin by dest.

		/* Set start to start of diagonal and end to the end of the diagonal. Since
         * the grid may not be square, the end of the diagonal may not equal dest.
		 */
        // Will the origin be different every time?
        Coordinate pivotStart = (Coordinate) origin.clone();// Why clone? This origin can also be 1, 0, keep what is passed in.
        // why? The diagonal movement will have the same distance.
        int rowDif = dest.row - origin.row;
        int colDif = dest.column - origin.column;
        int diagDest = Math.min(rowDif, colDif);//Why ?This one is shown again? I remember there is another one on the top.
        Coordinate end = new Coordinate(pivotStart.row + diagDest, pivotStart.column + diagDest);//why? Problem, some connection and changes are not so obvious and hard to detect. Every element has its own life.
        Coordinate pivotMiddle = new Coordinate(0, 0);//Why? Every time? Why? If there is a question I don't get the answer, then next time I will still make mistakes.
		//Problem, where to put the initial check?
		/* Do binary search on the diagonal, looking for the first element greater than target */
        System.out.println("end " + end);
        findPivot(matrix, target, pivotStart, end, pivotMiddle);

		/* Split the grid into quadrants. Search the bottom left and the top right. */
        System.out.println("pivot "+pivotStart);
        return partitionAndSearch(matrix, origin, dest, pivotStart, target);// start is a point.Why do this one again?
    }
    //What is the transform like? There is a chain of actions here. What are the conditions here? Control, boundary, possibility,symptom, core, iteration to a point, compare/check to get the condition, this method is not obvious. It doesn't tell me the result, but it tell me the condition to do it. Is and Is-Not are different aspects.
    // Boundary shrinks, everything changes, such as middle point and other configurations.
    // How is the pivot determined?
    // Original state, changes, result.
    // Problem, tab is very hard to locate everything.
    // Move until find the element where the target is within.
    private static void findPivot(int[][] matrix, int target, Coordinate pivotStart, Coordinate end, Coordinate pivotMiddle) { // Different context, will become different role and have different name.
        // Why pivot start? I may have the wrong mental model, that is why when there is something wrong and I could not figure it out myself. I didn't understand the role of pivotStart.
        while (pivotStart.isBefore(end)) {//Why this check? Because it will increase, whenever there is an increase, then there will be a bound to constraint the increase. action - control. Condition is control.
            // Problem: How does this happen? What kind of changes behind these 2 parameters? End will shrink, pivot will increase, one increment, another decrement,
            pivotMiddle.setToAverage(pivotStart, end);//For the code, hard to see the changes.
            if (target > matrix[pivotMiddle.row][pivotMiddle.column]) {//start from origin until find the first element greater than target.There is not equal.
                pivotStart.row = pivotMiddle.row + 1;//Pivot point is only changed here.
                pivotStart.column = pivotMiddle.column + 1;
            } else {// Why this end?
                end.row = pivotMiddle.row - 1;// This is not the end, it is the coordinate origin, at first I have the wrong assumption, I thought that they are changes on different changes.
                end.column = pivotMiddle.column - 1;
            }
        }
    }
    //Problem, what are the relationship between different parameters? Have to understand the role each one play. Parameter is not just variables and values, it is also changes, positions, and movements.
    //It is not easy to understand the relationship and changes between parameters.
    //Beginning, changes, last. The pivot is not in the pivotStart or end, these 2 are only intermediary points to confine the scope to find the pivots.

    public static Coordinate findElement(int[][] matrix, int target) {
		Coordinate origin = new Coordinate(0, 0); // Why to get this node?

        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        Coordinate dest = new Coordinate(row, col);// see the usage of the local variable, the calculation process is not the focus right now.

        return findElement(matrix, origin, dest, target);
	}

    //The writing sequence and reading sequence should be different, once you know how to write it then you know how to read it correctly without any problem.
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
				System.out.println(i + ": (" + c.row + ", " + c.column + ")");
				count++;
			}
		}
		System.out.println("Found " + count + " unique elements.");
	}
// It is not easy to understand everything in a program, only when you can visulize and memorize it, then you can truely understand everything.
}
//Problem, it takes so much time to understand every thing, especially the findPivot, I may have the wrong first impression of the model, because I didn't understand it properly.
//I really should.
//
