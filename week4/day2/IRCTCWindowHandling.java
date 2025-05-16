package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class IRCTCWindowHandling {

	public static void main(String[] args) {

		// Launch the browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("https://www.irctc.co.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To close popup
		// driver.findElement(By.xpath("//button[text()='Allow']")).click();

		// Click on the flights link
		driver.findElement(By.linkText("FLIGHTS")).click();

		// getWindowHandles
		Set<String> allWindows = driver.getWindowHandles();

		// Convert set into list
		List<String> allAddress = new ArrayList<String>(allWindows);
		System.out.println("The list is: " + allAddress);

		// To get title of parent window
		String titleOfParent = driver.getTitle();
		System.out.println("Title of parent window before switching: " + titleOfParent);

		// Transfer the driver focus
		driver.switchTo().window(allAddress.get(1));

		// Capture the title of new(child) window
		String titleOfChild = driver.getTitle();
		System.out.println("Title of child window: " + titleOfChild);

		// Transfer driver focus to parent window
		driver.switchTo().window(allAddress.get(0));

		// Close the parent tab
		driver.close();

		// To close all opened windows
		driver.quit();

	}

}
