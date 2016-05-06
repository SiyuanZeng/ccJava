package Question2_0_String_Manipulation.Question2_17_MergeTwoArrays;

public class ProveStringsAreImmutable {
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		System.out.println(s1 == s2);         //Output : true
		s1 = s1 + "J2EE";
		System.out.println(s1 == s2);         //Output : false
	}

	public static void main2(String[] args) {
		String s1 = new String("JAVA");
		System.out.println(s1);         //Output : JAVA
		s1.concat("J2EE");
		System.out.println(s1);         //Output : JAVA
	}
}