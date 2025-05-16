package week3.day2;

public class TestData {

	public void enterCredentials() {
		System.out.println("Credentials has been entered");
	}

	public void navigateToHomePage() {
		System.out.println("Navigated to home page");
	}

	public static void main(String[] args) {
		TestData testOptions = new TestData();
		testOptions.enterCredentials();
		testOptions.navigateToHomePage();
	}
}
