package week3.day2;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("Text is added");
	}
	
	public static void main(String[] args) {
		TextField textOptions=new TextField();
		textOptions.click();
		textOptions.setText("Hi");
		textOptions.getText();
		
	}

}
