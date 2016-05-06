package Question11_2;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

import CtCILibrary.AssortedMethods;

public class QuestionB {
	public static String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static void sort(String[] array) {
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		
		/* Group words by anagram */
		// Sort every string as key, then try to find out whether exist, if yes, add to it. Otherwise, add a new one.
		// The idea is that all the anagrams will have same key, to sort them, put them together. The key connects all the elements, it is a connection point.
		for (String s : array) {
			String key = sortChars(s); //use sorted String as key and put everything together.
			if (!hash.containsKey(key)) {
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);// How to ensure order?
			anagrams.push(s);
		}
		
		/* Convert hash table to array */
		/* How to iterate ? */
		// Use the key to get the list, then iterate the list.
		int index = 0;
		for (String key : hash.keySet()) {
			LinkedList<String> list = hash.get(key);
			for (String t : list) {
				array[index] = t;
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		sort(array);
		System.out.println(AssortedMethods.stringArrayToString(array));
	}
}
