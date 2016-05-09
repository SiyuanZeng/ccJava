package Question2_1_DuplicateWordsInString;

import java.util.*;

public class duplicateWordsInString {
    static Map<String, Integer> duplicateWords(String inputString) { //Splitting inputString into words
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] words = inputString.split(" "); //Creating one HashMap with words as key and their count as value
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>(); //Checking each word
        for (String word : words) { //whether it is present in wordCount
            if (wordCount.containsKey(word.toLowerCase())) {
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1); //If it is present, incrementing it's count by 1
            } else { //If it is not present, put that word into wordCount with 1 as it's value
                wordCount.put(word.toLowerCase(), 1);
            }
        } //Extracting all keys of wordCount
        Set<String> wordsInString = wordCount.keySet(); //Iterating through all words in wordCount
        for (String word : wordsInString) { //if word count is greater than 1
            if (wordCount.get(word) > 1) { //Printing that word and it's count
                map.put(word, wordCount.get(word));
            }
        }

        Map<String, Integer> treeMap = new TreeMap<String, Integer>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }

                });
        treeMap.putAll(map);
        return map;
    }
}