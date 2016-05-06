package Question2_0_String_Manipulation.Question2_13_ReverseEachWord;

public class ReverseEachWord {
	static String reverseEachWordOfString(String inputString) {
		if(null == inputString ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length()-1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + "";
		}
		return reverseString;
	}

	static String recursiveReverse(String inputString) {
		if(null == inputString ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		String result = "";
		if (inputString.length() >= 1) {
			result = inputString.charAt(inputString.length() - 1) + recursiveReverse(inputString.substring(0, inputString.length() - 1));
		}

		return result;
	}
}