package Question1_6;

import CtCILibrary.AssortedMethods;

public class Question {

	public static void rotate(int[][] matrix ) {
		int rowOrColumnNum = matrix[1].length;
        // very complicate, because of multiple conditions
        // we have 2 layers in this situation
        // odd or even doesn't matter, because rowColumnNum / 2 will round up
		for (int layer = 0; layer < rowOrColumnNum / 2; ++layer) {
//			int first = layer;
            // last Adjusted by layer is an advanced thinking that fits into the algorithm.
			int lastPosAdjustedByLayer = rowOrColumnNum - 1 - layer; // it starts from 0.

			for(int pos = layer; pos < lastPosAdjustedByLayer; ++pos) {
				int offset = pos - layer;
                //What does it mean offset? It is how many steps it moves.
				// What is this offset for? this is correlated with the position, if it is the second, the the left one will be lastAdjustedByLayer - offset.
                // if it is layer 1.
                // what is 1 - first?, pos is horizontal position
                // lastAdjustedByLayer - offset, because it is vertical position.
				int top = matrix[layer][pos]; // save top
				// left -> top
                // the second index will always be first.
                // lastAdjustedByLayer = pos + offset.
                int movingPointer = lastPosAdjustedByLayer - offset;
                matrix[layer][pos] = matrix[movingPointer][layer];
				// bottom -> left
                matrix[movingPointer][layer] = matrix[lastPosAdjustedByLayer][movingPointer];
				// right -> bottom
				matrix[lastPosAdjustedByLayer][movingPointer] = matrix[pos][lastPosAdjustedByLayer];
				// top -> right
				matrix[pos][lastPosAdjustedByLayer] = top; // right <- saved top
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);


		matrix = AssortedMethods.randomMatrix(5, 5, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);

	}

}
