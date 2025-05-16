package week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("Username has been entered");
	}

	public void enterPassword() {
		System.out.println("Password has been entered");
	}

	public static void main(String[] args) {
		LoginTestData loginOptions = new LoginTestData();
		loginOptions.enterCredentials();
		loginOptions.navigateToHomePage();
		loginOptions.enterUsername();
		loginOptions.enterPassword();
	}
}
