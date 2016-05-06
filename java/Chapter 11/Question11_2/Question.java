package Question11_2;

import java.util.Arrays;

import CtCILibrary.AssortedMethods;

public class Question {
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		System.out.println(AssortedMethods.stringArrayToString(array));
		Arrays.sort(array, new AnagramComparator());//Comparator will keep everything as it is, it won't reflect the comparason behind the scene.
		System.out.println(AssortedMethods.stringArrayToString(array));
	}
}
