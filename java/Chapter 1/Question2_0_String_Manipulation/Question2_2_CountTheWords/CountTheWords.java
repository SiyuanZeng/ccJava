package Question2_0_String_Manipulation.Question2_2_CountTheWords;

class CountTheWords
{
	public static int countTheWords(String str)
	{
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		String[] words = str.trim().split(" ");

		return words.length;
	}
}