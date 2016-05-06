package Question2_0_String_Manipulation.Question2_14_StringToInteger;

public class StringToInteger {
	public static int stringToIntViaIntegerParseInt(String inputString) {
		if(null == inputString ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		return Integer.parseInt(inputString);
	}

	public static int stringToIntViaIntegerValueOf(String inputString) {
		if(null == inputString ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}
		return Integer.valueOf(inputString);
	}

	public static String intToStringViaIntegerToString(int inputString) {
		return Integer.toString(inputString);
	}

	public static String intToStringViaStringValueOf(int inputString) {
		return String.valueOf(inputString);
	}
}