package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int lengthOfString = text1.length();
		int lengthOfString1 = text2.length();
		if (lengthOfString == lengthOfString1) {
			char[] charArray = text1.toCharArray();
			char[] charArray1 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			boolean result = Arrays.equals(charArray, charArray1);
			System.out.println("The given strings are Anagram");
		} else {
			System.out.println("The given strings are not an Anagram");
		}
	}
}
