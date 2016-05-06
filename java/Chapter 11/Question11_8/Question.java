package Question11_8;

import java.util.ArrayList;
import java.util.Collections;

import CtCILibrary.AssortedMethods;

public class Question {
	private static RankNode root = null;
	
	public static void track(int number) {
		if (root == null) {
			root = new RankNode(number);
		} else {
			root.insert(number);
		}
	}
	
	public static int getRankOfNumber(int number) {
		return root.getRank(number);
	}
	
	public static void main(String[] args) {
		int size = 100;
		int[] list = AssortedMethods.randomArray(size, -100, 100);
		for (int i = 0; i < list.length; i++) {
			track(list[i]);
		}
		
		int[] tracker = new int[size]; //  Use another array to track the rank with the index.
		for (int i = 0; i < list.length; i++) {
			int v = list[i];
			int rank1 = root.getRank(list[i]);
			tracker[rank1] = v;		// Same value will be the same rank and cause some slots to be 0.
		}
		
		for (int i = 0; i < tracker.length - 1; i++) {
			if (tracker[i] != 0 && tracker[i + 1] != 0) {
				if (tracker[i] > tracker[i + 1]) {
					System.out.println("ERROR at " + i);
				}
			}
		}

		System.out.println("Array: " + AssortedMethods.arrayToString(list));
		System.out.println("Ranks: " + AssortedMethods.arrayToString(tracker)); // Same value will be the same rank.
        // There is 0, means they are the same.
	}

}
