package Question3_6;

		import java.util.Stack;

public class Question {
	static int c = 0;
	public static Stack<Integer> mergesort(Stack<Integer> inStack) {
		if (inStack.size() <= 1) {
			return inStack;
		}

		Stack<Integer> left = new Stack<Integer>();
		Stack<Integer> right = new Stack<Integer>();

		int count = 0;
		while (inStack.size() != 0) {
			count++;
			c++;
			if (count % 2 == 0) {
				left.push(inStack.pop());
			} else {
				right.push(inStack.pop());
			}
		}


		left = mergesort(left);
		right = mergesort(right);

		while (left.size() > 0 || right.size() > 0) {
			if (left.size() == 0) {
				inStack.push(right.pop());
			} else if (right.size() == 0) {
				inStack.push(left.pop());
			} else if (right.peek().compareTo(left.peek()) <= 0) {
				inStack.push(left.pop());
			} else {
				inStack.push(right.pop());
			}
		}

		// The reverseStack is the comment, the name is used as comment
		// Name is the topic and theme.
		Stack<Integer> reverseStack = new Stack<Integer>();
		while (inStack.size() > 0)
		{
			c++;
			reverseStack.push(inStack.pop());
		}

		return reverseStack;
	}

	// Unexpected result
	// Problem
	// Love --> Solution
	public static Stack<Integer> sort(Stack<Integer> ascending) {
		//Ascending 2, 1
		//Reversed 1, 2
		Stack<Integer> reversed = new Stack<Integer>();

		while(!ascending.isEmpty()) {
			int tmp = ascending.pop();

			// r > s' temp, move r to s.
			while(!reversed.isEmpty() && reversed.peek() > tmp) {
				ascending.push(reversed.pop());
			}

			//s'temp > r, move s' temp into r.
			reversed.push(tmp);
		}
		return reversed;
	}

	public static void main(String [] args) {

	}
}
