package Question2_0_String_Manipulation.Question2_11_Anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
	static boolean isAnagram(String s1, String s2)	{
		if(null == s1 || null == s2 ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (s1.trim() == ""|| s2.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}

		//Removing all white spaces from s1 and s2
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		//Initially setting status as true
		boolean status = true;
		if(copyOfs1.length() != copyOfs2.length()){
			//Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
			status = false;
		} else {
			//Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
			char[] s2Array = copyOfs2.toLowerCase().toCharArray();
			//Sorting both s1Array and s2Array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			//Checking whether s1Array and s2Array are equal
			status = Arrays.equals(s1Array, s2Array);
		}//Output

		return status;
	}

	static ArrayList<String> isAnagramWithMultipleStrings(ArrayList<String> listOfStrings)	{
		if(null == listOfStrings) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (listOfStrings.size() == 0) {
			throw new IllegalArgumentException("Name has no content.");
		}


		//Removing all white spaces from s1 and s2
		ArrayList<String> listOfStringsBkp = (ArrayList<String>) listOfStrings.clone();
		ArrayList<String> listOfAnagram = new ArrayList<String>();
		for (int i = 0; i <= listOfStrings.size() -1 ; i++) {
			String s1 = listOfStrings.get(i);
			boolean status = false;
			for (int j = 0; j <= listOfStrings.size() - 1; j++) {
				String s2 = listOfStrings.get(j);
				if (i !=j){
					status = isAnagram(s1, s2);
				}
				if (status) {
					break;
				}
			}
			if (!status) {
				listOfAnagram.add(listOfStrings.get(i));
			}
			listOfStrings = (ArrayList<String>) listOfStringsBkp.clone();
		}
		return listOfAnagram;
	}
}