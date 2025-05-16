package week3.day2;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("Radio button is selected");
	}

	public static void main(String[] args) {
		RadioButton radioOptions = new RadioButton();
		radioOptions.submit();
		radioOptions.selectRadioButton();
		radioOptions.click();
		radioOptions.setText("Radio Button");
	}
}
