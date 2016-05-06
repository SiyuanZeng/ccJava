package Question1_3;

public class Question {	
	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t) throws NullPointerException{
        if (null == s) throw new NullPointerException("S is null");
		return sort(s).equals(sort(t));
	}
	
	public static boolean anagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] letters = new int[256];
		int uniqueCharsCount = 0;
		int uniqueCharsCount_complete = 0;
		char[] str1_array = str1.toCharArray();
		for (char c : str1_array) { // count number of each char in str1.
			if (letters[c] == 0) {
				++uniqueCharsCount;
			}
			++letters[c];
		}
		for (int i = 0; i < str2.length(); ++i) { // I can just check the count, whether it is negative.
			int c = (int) str2.charAt(i);
			if (letters[c] == 0) { // Found more of char c in t than in str1.
				return false;
			} else {
				--letters[c];
			}

			if (letters[c] == 0) {
				++uniqueCharsCount_complete;
				if (uniqueCharsCount_complete == uniqueCharsCount) {
					// it�str1 a match if t has been processed completely
					return true;
					//return i == t.length() - 1;
				}
			}
		}
		return false;
	}	
	
	public static void main(String[] args) {
		String[][] pairs = {{"carrot", "tarroc"}};
		try {
            for (String[] pair : pairs) {
                String word1 = pair[0];
                String word2 = pair[1];
                boolean anagram = permutation(word1, word2);
                System.out.println(word1 + ", " + word2 + ": " + anagram);
                System.out.println("anagram:" + anagram(word1, word2));
            }
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
	}
}
