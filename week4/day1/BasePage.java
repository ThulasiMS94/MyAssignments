package week4.day1;

public class BasePage {

	public void findElement() {
		System.out.println("Element has been added");
	}

	public void clickElement() {
		System.out.println("Element has been clicked");
	}

	public void enterText() {
		System.out.println("Text has been entered");
	}

	public void performCommonTasks() {
		System.out.println("Common tasks are performed");
	}

	public static void main(String[] args) {
		BasePage pageDetails = new BasePage();
		pageDetails.findElement();
		pageDetails.clickElement();
		pageDetails.enterText();
		pageDetails.performCommonTasks();
	}

}
