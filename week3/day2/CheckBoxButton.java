package week3.day2;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		System.out.println("Check button is clicked");
	}

	public static void main(String[] args) {
		CheckBoxButton checkOptions = new CheckBoxButton();
		checkOptions.submit();
		checkOptions.clickCheckButton();
		checkOptions.click();
		checkOptions.setText("Check Box");
	}
}
