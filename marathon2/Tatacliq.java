package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();
		Actions mouseHover=new Actions(driver);
		WebElement mouseBrand = driver.findElement(By.xpath("//div[text()='Brands']"));
		mouseHover.moveToElement(mouseBrand).perform();
		Actions mouseHover1=new Actions(driver);
		WebElement mouseBrand1 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		mouseHover1.moveToElement(mouseBrand1).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select dropDown=new Select(element);
		dropDown.deselectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		
		
		
		
	}

}
