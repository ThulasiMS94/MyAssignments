package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println(browserName+" "+"Browser launched successfully");
		return browserName;
	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser browserOptions = new Browser();
		browserOptions.launchBrowser("Chrome");
		browserOptions.loadUrl();
	}
}
