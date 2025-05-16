package challenges;

public class JavaProgram1 {

	public static void main(String[] args) {
		String a = "Hello World";
		String[] name = a.split(" ");
		int lengthOfString = name.length;
		System.out.println("Last word is: " + name[lengthOfString - 1]);
		String lastWord = name[lengthOfString - 1];
		char[] charArray = lastWord.toCharArray();
		int lengthOfWord = charArray.length;
		System.out.println("Lenth of the lastword is: " + lengthOfWord);

	}

}