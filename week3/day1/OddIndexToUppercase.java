package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String name = "changeme";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			if (i % 2 != 0) {
				char charAtIndex = name.charAt(i);
				char upperCase = Character.toUpperCase(charAtIndex);
				System.out.println(upperCase);
			}
		}

	}

}
