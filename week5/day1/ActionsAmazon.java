package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Launch the browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("https://www.amazon.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Search for "oneplus 9 pro"
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// Get the price of the first product
		String textPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the first product is: " + textPrice);

		// Print the number of customer ratings for the first displayed product
		String textRating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Customer rating for the first displayed product: " + textRating);

		// Click the first text link of the first image
		// Create Object for Actions Class
		Actions mouseHover = new Actions(driver);

		// Find the element to mousehover
		WebElement firstElement = driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));

		// Use the method - moveToElement
		mouseHover.moveToElement(firstElement).click().perform();

		// getWindowHandles
		Set<String> allWindows = driver.getWindowHandles();

		// Convert set into list
		List<String> allAddress = new ArrayList<String>(allWindows);
		System.out.println("The list is: " + allAddress);

		// Transfer the driver focus
		driver.switchTo().window(allAddress.get(1));

		// Find element to take screen shot
		WebElement firstProduct = driver.findElement(By.xpath("//div[@id='centerCol']"));

		// Take screen shot from source
		File source = firstProduct.getScreenshotAs(OutputType.FILE);

		// Set destination for screenshot
		File destination = new File("./Snap/oneplus.png");

		// Copy the source and paste it in the destination
		FileUtils.copyFile(source, destination);

		// Click the 'Add to Cart' button
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();

		// Click on the add to cart button
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();

		// Get the cart subtotal and verify if it is correct
		String subTotal = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
		System.out.println("Subtotal of the product is: " + subTotal);

		// Transfer driver focus to parent window
		driver.switchTo().window(allAddress.get(0));

		// To close all opened windows
		driver.quit();

	}

}
