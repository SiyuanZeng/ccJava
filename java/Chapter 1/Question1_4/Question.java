package Question1_4;

public class Question {
	// Assume string has sufficient free space at the end
	public static String replaceSpaces(String str) {
		char[] strArr = str.toCharArray();
		int length = str.length();
		int spaceCount = 0, index;

		for (int i = 0; i < length; i++) {
			if (strArr[i] == ' ') {
				spaceCount++;
			}
		}

		index = length + spaceCount * 2;
		char[] arr = new char[index];


		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		//What is this index for?
		//str[index] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (arr[i] == ' ') {
				arr[index - 1] = '0';
				arr[index - 2] = '2';
				arr[index - 3] = '%';
				index = index - 3;
			} else {
				arr[index - 1] = arr[i];
				index--;
			}
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		String str = "abc d e f ";

		String str2 = replaceSpaces(str);
		System.out.println(str2);

		str = " abc d e f ";
		str2 = replaceSpaces(str);
		System.out.println(str2);

		str = "  abc  d e f ";
		str2 = replaceSpaces(str);
		System.out.println(str2);
	}
}
