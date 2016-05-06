package Question2_0_String_Manipulation.Question2_15_characterPercentage;

import java.text.DecimalFormat;

public class CharacterPercentage {
	static String characterPercentage(String inputString) {

		if(null == inputString ) {
			throw new IllegalArgumentException("The input can't be null");
		}

		if (inputString.trim() == "") {
			throw new IllegalArgumentException("Name has no content.");
		}


		/*Getting total no of characters in the given string*/
		int totalChars = inputString.length();
		/*Initializing upperCase	Letters, lowerCaseLetters, digits and others with 0*/
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		int digits = 0;
		int others = 0;
		/*Iterating through each character of inputString*/
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (Character.isUpperCase(ch)) {///*If ch is in uppercase, then incrementing upperCaseLetters*/
				upperCaseLetters++;
			} else if (Character.isLowerCase(ch)) {/*If ch is in lowercase, then incrementing lowerCaseLetters*/
				lowerCaseLetters++;
			} else if (Character.isDigit(ch)) {/*If ch is a digit, then incrementing digits*/
				digits++;
			} else {//If ch is a special character then incrementing others
				others++;
			}
		}
		/*Calculating percentage of uppercase letters, lowercase letters, digits and other characters*/
		double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;
		double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
		double digitsPercentage = (digits * 100.0) / totalChars;
		double otherCharPercentage = (others * 100.0) / totalChars;

		/*Printing percentage of uppercase letters, lowercase letters, digits and other characters*/
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("In '" + inputString + "' : ");

		DecimalFormat formatter = new DecimalFormat("##.##");
		stringBuffer.append("Uppercase letters are " + formatter.format(upperCaseLetterPercentage) + "% ");
		stringBuffer.append("Lowercase letters are " + formatter.format(lowerCaseLetterPercentage) + "%");
		stringBuffer.append("Digits Are " + formatter.format(digitsPercentage) + "%");
		stringBuffer.append("Other Characters Are " + formatter.format(otherCharPercentage) + "%");
		stringBuffer.append("-----------------------------");
		return stringBuffer.toString();
	}

}