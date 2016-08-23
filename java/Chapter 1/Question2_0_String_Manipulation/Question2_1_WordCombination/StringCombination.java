package Question2_0_String_Manipulation.Question2_1_WordCombination;

class StringCombination
{
	public static void countTheWords(String str) {
		if (null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}




		for (int i = 0; i < str.length(); i++) {
			char[] wordsCopy= str.toCharArray();
			char temp = wordsCopy[0];
			wordsCopy[0] = wordsCopy[i];
			wordsCopy[i] = temp;
			for (int j = 1; j < wordsCopy.length; j++) {
					char temp2 = wordsCopy[1];
				wordsCopy[1] = wordsCopy[j];
				wordsCopy[j] = temp2;
					System.out.println(new String(wordsCopy));
			}
		}
	}
}