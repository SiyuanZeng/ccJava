package Question2_0_String_Manipulation.Question2_3_CountTheWords;

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

		int count = 1;
		for (int i = 0; i < str.length()-1; i++)
		{
			if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
			{
				count++;
			}
		}

		return count;
	}
}