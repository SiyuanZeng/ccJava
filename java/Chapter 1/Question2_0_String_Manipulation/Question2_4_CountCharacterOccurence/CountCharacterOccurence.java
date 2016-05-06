package Question2_0_String_Manipulation.Question2_4_CountCharacterOccurence;

import java.util.TreeMap;

class CountCharacterOccurence {
		public static int count(String str, char c)	{
			int count = str.length() - str.replace("a", "").length();

			return count;
		}

		public static TreeMap<Character, Integer> countAll(String str)	{
			if(null == str) {
				throw new IllegalArgumentException("The input can't be null");
			}

			if (str.trim() == "") {
				throw new IllegalArgumentException("Name has no content.");
			}
			TreeMap<Character, Integer> map = new  TreeMap<Character, Integer>();
			str = str.toLowerCase();
			while(!str.isEmpty()){
				char c = str.charAt(0);
				int count = str.length() - str.replace(Character.toString(c), "").length();
				map.put(c, count);
				str = str.replace(Character.toString(c), "");
			}


			return map;
		}
	}