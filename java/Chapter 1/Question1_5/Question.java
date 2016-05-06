package Question1_5;

public class Question {

	public static int setChar(char[] array, char c, int index, int count) {
		array[index] = c;
		index++;
		char[] cnt = String.valueOf(count).toCharArray();
		for (char x : cnt) {
			array[index] = x;
			index++;
		}
		return index;
	}
	
	public static int countCompression(String str) {
		if (str == null || str.isEmpty()) return 0;

		char last = str.charAt(0);
		int size = 0, count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				size += 1 + String.valueOf(count).length();
				last = str.charAt(i);
				count = 1;
			} 
		}

		size += 1 + String.valueOf(count).length();
		return size;
	}

	public static String compressBad(String str) {

		if (countCompression(str) >= str.length()) {
			return str;
		}

		String mystr = "";
		char last = str.charAt(0);
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}

		return mystr + last + count;
	}
	
	public static String compressBetter(String str) {
		if (countCompression(str) >= str.length()) {
			return str;
		}

		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}	
	
	public static String compressAlternate(String str) {
		try {

			if (str == null || str == "") {
				throw new IllegalArgumentException("param cannot be null.");
			}

			if (countCompression(str) >= str.length()) {
				return str;
			}

			char[] array = new char[countCompression(str)];
			int index = 0;
			char last = str.charAt(0);
			int count = 1;

			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == last) {
					count++;
				} else {
					index = setChar(array, last, index, count);
					last = str.charAt(i);
					count = 1;
				}
			}
			index = setChar(array, last, index, count);
			return String.valueOf(array);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		String str = "abbccccccde";
		int c = countCompression(str);
		String str2 = compressAlternate(str);
		String t = compressBetter("");
		System.out.println("Compression: " + t);
		System.out.println("Old String (len = " + str.length() + "): " + str);
		System.out.println("New String (len = " + str2.length() + "): " + str2);
		System.out.println("Potential Compression: " + c);


		String str3 = "abc";
		int c2 = countCompression(str3 );
		String str4 = compressAlternate(str3 );
		String t2 = compressBetter(str3);
		System.out.println("Compression: " + t);
		System.out.println("Old String (len = " + str3.length() + "): " + str3 );
		System.out.println("New String (len = " + t2.length() + "): " + t2);
		System.out.println("Potential Compression: " + c);

/*		String str5 = null;
		int c3 = countCompression(str5);
		String str6 = compressAlternate(str5);
		String t3 = compressBetter("");
		System.out.println("Compression: " + t);
		System.out.println("Old String (len = " + str5.length() + "): " + str5 );
		System.out.println("New String (len = " + str6.length() + "): " + str6);
		System.out.println("Potential Compression: " + c);*/
	}
}
