package Question2_0_String_Manipulation.Question2_12_ReverseStringWithSpacesPosition;

public class ReverseStringWithSpacesPosition {
	static String reverseString(String inputString) {
		if(null == inputString ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		char[] inputStringArray = inputString.toCharArray();
		char[] resultArray = new char[inputStringArray.length];
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] == ' ')	{
				resultArray[i] = ' ';
			}
		}
		int j = resultArray.length-1;
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] != ' ') {
				while (j >= 0 && resultArray[j] == ' ') {
					j--;//What if that the j is also empty?
				}
				if (j >= 0) {
					resultArray[j] = inputStringArray[i];
					j--;
				}
			}
		}
		return String.valueOf(resultArray);
	}
}