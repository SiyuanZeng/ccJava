package Question2_0_String_Manipulation.Question2_10_StringRotation;

public class StringRotation
{
	public static boolean isRotation(String s1, String s2 ) {
		if(null == s1 || null == s2 ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (s1.trim() == ""|| s2.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		if(s1.length() != s2.length()) {
			return false;
		} else	{
			String s3 = s1 + s1;
			if(s3.contains(s2))	{
				return true;
			} else {
				return false;
			}
		}
	}
}