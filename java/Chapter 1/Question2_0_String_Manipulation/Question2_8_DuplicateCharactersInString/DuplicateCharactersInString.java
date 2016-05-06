package Question2_0_String_Manipulation.Question2_8_DuplicateCharactersInString;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

class DuplicateCharactersInString {
	static LinkedHashSet<Character> duplicateChars(String inputString){
		if(null == inputString) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray)	{
			if(charCountMap.containsKey(c))	{
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		Set<Character> charsInString = charCountMap.keySet();
		LinkedHashSet<Character> duplicateChars= new LinkedHashSet<Character>();
		for (Character ch : charsInString) {
			if(charCountMap.get(ch) > 1) {
				duplicateChars.add(ch);
			}
		}
		return  duplicateChars;
	}

	static LinkedHashMap<Character, Integer> duplicateCharsWithCount(String inputString){
		if(null == inputString) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray)	{
			if(charCountMap.containsKey(c))	{
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		return  charCountMap;
	}

}