package Question2_0_String_Manipulation.Question2_18_Palindrom;

public class Palindrom {
	public static boolean istPalindrom(char[] word){
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
}