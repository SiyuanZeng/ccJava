package Question11_7;

import java.util.ArrayList;
import java.util.*;

public class Question {

	// Returns longer sequence
	private static ArrayList<HeightWeight> iterateToGetLongestSequenceForCurrentElement(ArrayList<HeightWeight> seq1, ArrayList<HeightWeight> seq2) {
		if (seq1 == null) { // Check null for both
			return seq2;
		} else if (seq2 == null) {
			return seq1;
		}
		return seq1.size() > seq2.size() ? seq1 : seq2;
	}
	//Recursive method.
	private static void recurseToGetAllSequences(ArrayList<HeightWeight> array, ArrayList<HeightWeight>[] solutions, int currentIndex) {
		if (currentIndex >= array.size() || currentIndex < 0) {
			return;
		}
		HeightWeight currentElement = array.get(currentIndex);
		
		// Find longest sequence that we can append current_element to
		ArrayList<HeightWeight> bestSequence = null;
		for (int i = 0; i < currentIndex; i++) {
            // Question: what does the if doing here? To get the best previously solution.For every element, there is a solution corresponding with it.
			if (array.get(i).isBefore(currentElement)) { // If current_element is bigger than list tail
				bestSequence = iterateToGetLongestSequenceForCurrentElement(bestSequence, solutions[i]); // Set best_sequence to our new max
			}
		}

		// Append current_element
		ArrayList<HeightWeight> newSolutionList = new ArrayList<HeightWeight>();
        // If it is null, it means current element is smaller than the tails.
		if (bestSequence != null) {
			//Why do we need this? Because we don't want to override the previous one. Keep it intact.But I think it is fine, since we only want the longest. The problem is that the previous one may be used for next different elements.
			newSolutionList.addAll(bestSequence);
		}
        //It is either start a new list or append to the tail.
		newSolutionList.add(currentElement);
		
		// Add to list and recurse
		solutions[currentIndex] = newSolutionList;
		recurseToGetAllSequences(array, solutions, currentIndex + 1);
	}

    // It is hard to understand the logic in the class.
	private static ArrayList<HeightWeight> findLongestSubsequence(ArrayList<HeightWeight> array) {
        //Question: what if the solution is empty? Pass by ref.
		ArrayList<HeightWeight>[] solutions = new ArrayList[array.size()];
        recurseToGetAllSequences(array, solutions, 0);
		
		ArrayList<HeightWeight> bestSequence = null;
		for (int i = 0; i < array.size(); i++) {//Loop for the best_sequence.
			bestSequence = iterateToGetLongestSequenceForCurrentElement(bestSequence, solutions[i]);// recursive, compare with self and others, assign to itself.
		}

		return bestSequence;
	}	
	
	public static ArrayList<HeightWeight> initialize() {
		ArrayList<HeightWeight> items = new ArrayList<HeightWeight>();
		
		HeightWeight item = new HeightWeight(65, 60);
		items.add(item);
		
		item = new HeightWeight(70, 150);
		items.add(item);
		
		item = new HeightWeight(56, 90);
		items.add(item);
		
		item = new HeightWeight(75, 190);
		items.add(item);
		
		item = new HeightWeight(60, 95);
		items.add(item);
		
		item = new HeightWeight(68, 110);
		items.add(item);
		
		item = new HeightWeight(35, 65);
		items.add(item);
		
		item = new HeightWeight(40, 60);
		items.add(item);
		
		item = new HeightWeight(45, 63);
		items.add(item);
		
		return items;
	}
	
	public static void printList(ArrayList<HeightWeight> list) {
		for (HeightWeight item : list) {
			System.out.println(item.toString() + " ");
		}
	}
	
	public static ArrayList<HeightWeight>getIncreasingSequence(ArrayList<HeightWeight> items) {
		Collections.sort(items);
		return findLongestSubsequence(items);
	}

	/*array[i]  ----------- solutions[i]  -------------  current index i ------------------- best sequence*/
	public static void main(String[] args) {
		ArrayList<HeightWeight> items = initialize();
		ArrayList<HeightWeight> solution = getIncreasingSequence(items);
		printList(solution);
	}

}
