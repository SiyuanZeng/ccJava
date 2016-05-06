package Question2_0_String_Manipulation.Question2_6_EachCharCountInString;

import java.util.LinkedHashMap;
import java.util.TreeMap;

class EachCharCountInString {
	static LinkedHashMap<Character, Integer> characterCountWithoutSort(String inputString)	{
		//Creating a HashMap containing char as a key and occurrences as  a value
		LinkedHashMap <Character, Integer> map = new LinkedHashMap <Character, Integer>();
		//Converting given string to char array
		char[] strArray = inputString.toCharArray();
		//checking each char of strArray

		for (char c : strArray)	{
			if(map.containsKey(c))	{
				//If char is present in map, incrementing it's count by 1
				map.put(c, map.get(c) + 1);
			} else {
				//If char is not present in map,
				//putting this char to map with 1 as it's value
				map.put(c, 1);
			}
		}

		return map;
	}

	static TreeMap<Character, Integer> characterCountSorted(String inputString)	{
		//Creating a HashMap containing char as a key and occurrences as  a value
		TreeMap<Character, Integer> charCountMap = new  TreeMap<Character, Integer>();
		//Converting given string to char array
		char[] strArray = inputString.toCharArray();
		//checking each char of strArray

		for (char c : strArray)	{
			if(charCountMap.containsKey(c))	{
				//If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				//If char is not present in charCountMap,
				//putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		return charCountMap;
	}


	static TreeMap<Character, Integer> characterCountSortedAndIgnoreCases(String inputString)	{
		//Creating a HashMap containing char as a key and occurrences as  a value
		TreeMap<Character, Integer> charCountMap = new  TreeMap<Character, Integer>();
		//Converting given string to char array
		char[] strArray = inputString.toLowerCase().toCharArray();
		//checking each char of strArray

		for (char c : strArray)	{
			if(charCountMap.containsKey(c))	{
				//If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				//If char is not present in charCountMap,
				//putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		return charCountMap;
	}

}