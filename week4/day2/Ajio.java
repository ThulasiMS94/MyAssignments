package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		List<WebElement> allBrands = driver.findElements(By.xpath("//span[text()='brands']"));
		int numberOfBrands = allBrands.size();
		System.out.println("Number of brands is " + numberOfBrands);
		List<String> brandList = new ArrayList<String>();
		for (int i = 0; i < numberOfBrands; i++) {
			String brand = allBrands.get(i).getText();
			brandList.add(brand);
			System.out.println("List of brands are " + brandList);
			List<WebElement> allBags = driver.findElements(By.xpath("//div[@class='nameCls']"));
			int numberOfBags = allBags.size();
			System.out.println("Number of bags is " + numberOfBags);
			List<String> bagsList = new ArrayList<String>();
			for (int j = 0; j < numberOfBags; j++) {
				String bags = allBags.get(j).getText();
				bagsList.add(bags);
				System.out.println("List of bags are " + bagsList);

			}

		}
	}
}
