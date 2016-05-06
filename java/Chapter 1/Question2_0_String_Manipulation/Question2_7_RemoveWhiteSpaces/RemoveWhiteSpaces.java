package Question2_0_String_Manipulation.Question2_7_RemoveWhiteSpaces;

class RemoveWhiteSpaces {
	public static String remove(String str) {
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		return str.replaceAll("\\s", "");
	}

	public static String removeDuplicateSpaces(String str) {
		String origin = new String(str);
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		return str.replaceAll(" +", " ");
	}

	public static String stringBufferRemove(String str) {
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		// \n is new line
		// \t is a tab or 6 spaces (not sure of the number)

		for (int i = 0; i < strArray.length; i++) {
			if( (strArray[i] != ' ') && (strArray[i] != '\t') )	{
				sb.append(strArray[i]);
			}
		}
		return new String(sb);
	}
}