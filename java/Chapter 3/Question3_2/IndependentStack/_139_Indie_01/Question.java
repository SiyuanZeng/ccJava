package Question3_2.IndependentStack._139_Indie_01;

import CtCILibrary.AssortedMethods;
import Question3_2.NodeWithMin._138_NodeWithMin.StackWithMin138;

public class Question {
	public static void main(String[] args) {
		StackWithMin138 stack = new StackWithMin138();
		IndieStack stack2 = new IndieStack();
		for (int i = 0; i < 15; i++) {
			int value = AssortedMethods.randomIntInRange(0, 100);
			stack.push(value);
			stack2.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < 15; i++) {
			System.out.println("Popped " + stack.pop().value + ", " + stack2.pop());
			System.out.println("New min is " + stack.min() + ", " + stack2.min());
		}
	}

}
