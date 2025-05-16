package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAndAlertInteractions {

	public static void main(String[] args) {

		// Launch the browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Transfer the driver focus to frame by Name/ID
		driver.switchTo().frame("iframeResult");

		// Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Click OK/Cancel in the alert that appears
		Alert frameAlert = driver.switchTo().alert();
		frameAlert.accept();

		// Confirm the action is performed correctly by verifying
		String frameText = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		if (frameText.equals("You pressed OK!")) {
			System.out.println("The action is performed successfully");
		} else {
			System.out.println("The action is not performed");
		}
	}

}
