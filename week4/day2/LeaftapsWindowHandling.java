package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LeaftapsWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on contacts button
		driver.findElement(By.linkText("Contacts")).click();

		// Click on merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Click on the widget of "From Contact"
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();

		// getWindowHandles
		Set<String> allWindows = driver.getWindowHandles();

		// Convert set into list
		List<String> fromHandle = new ArrayList<String>(allWindows);
		System.out.println("The list is: " + fromHandle);

		// Transfer the driver focus
		driver.switchTo().window(fromHandle.get(1));

		// Click on the first resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// Transfer driver focus to parent window
		driver.switchTo().window(fromHandle.get(0));

		// Click on the widget of "To Contact"
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();

		// getWindowHandles
		Set<String> allWindows1 = driver.getWindowHandles();

		// Convert set into list
		List<String> toHandle = new ArrayList<String>(allWindows1);
		System.out.println("The list is: " + toHandle);

		// Transfer the driver focus
		driver.switchTo().window(toHandle.get(1));

		// Click on the second resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();

		// Transfer driver focus to parent window
		driver.switchTo().window(toHandle.get(0));

		// Click on the Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Transfer the driver focus from webpage to alert box
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();

		// Get title of the page
		String titleOfPage = driver.getTitle();
		System.out.println("Title of the page is: " + titleOfPage);

		// Verify the title of the page
		if (titleOfPage.contains("View Contact")) {
			System.out.println("Contacts has been merged successfully");
		} else {
			System.out.println("Contacts has not been merged");
		}

		// To close the browser
		driver.close();
	}
}
