package week3.day2;

public class Elements extends Button {

	public void named() {
		System.out.println("Named elements are added");
	}

	public static void main(String[] args) {
		Elements elementOptions = new Elements();
		elementOptions.submit();
		elementOptions.named();
		elementOptions.click();
		elementOptions.setText("Welcome");
		
	}

}
