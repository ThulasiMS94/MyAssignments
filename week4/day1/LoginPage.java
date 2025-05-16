package week4.day1;

public class LoginPage extends BasePage {

	public void performCommonTasks() {
		System.out.println("Tasks are performed");
		super.performCommonTasks();
	}

	public static void main(String[] args) {
		LoginPage loginDetails = new LoginPage();
		loginDetails.performCommonTasks();
	}
}
