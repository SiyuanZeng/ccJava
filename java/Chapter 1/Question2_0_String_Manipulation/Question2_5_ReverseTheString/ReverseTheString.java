package Question2_0_String_Manipulation.Question2_5_ReverseTheString;

class ReverseTheString
{
	public static String stringBufferReverse(String str){
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}
		StringBuffer sbf = new StringBuffer(str);
		return sbf.reverse().toString();    //Output : avaJyM
	}

	public static String iterativeReverse(String str){
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		char[] strArray = str.toCharArray();
		String reversedStr = "";
		for (int i = strArray.length - 1; i >= 0; i--)	{
			reversedStr +=Character.toString(strArray[i]);     //Output : avaJyM
		}
		return reversedStr;
	}

	public static String recursiveReverse(String str) {
		if(null == str) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (str.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveReverse(str.substring(1)) + str.charAt(0);
	}

	public static String swapRecursive(String string){
		char[] charArray = string.toCharArray();
		int start = 0 ;
		int end = charArray.length-1 ;
		String str = "";

		while(end > start ){

			char ch = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = ch ;

			start++;
			end--;

		}

		return new String(charArray).intern();
	}
}