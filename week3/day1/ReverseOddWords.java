package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] splitText = text.split(" ");
		for (int i = 0; i < splitText.length; i++) {
			if (i % 2 != 0) {
				char[] charText = splitText[i].toCharArray();
				for (int j = charText.length - 1; j >= 0; j--) {
					System.out.println(charText[j]);
				}
			} else {
				System.out.println(splitText[i]);
			}
			System.out.println(" ");

		}

	}
}
