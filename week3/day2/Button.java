package week3.day2;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Submit button is added");
	}

	public static void main(String[] args) {
		Button buttonOptions = new Button();
		buttonOptions.click();
		buttonOptions.setText("Hello");
		buttonOptions.submit();
		
	}

}
