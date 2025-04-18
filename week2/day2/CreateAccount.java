package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Welcome1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement sourceElement = driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByIndex(3);
		WebElement sourceElement1 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(sourceElement1);
		dropdown1.selectByVisibleText("S-Corporation");
		WebElement sourceElement2 = driver.findElement(By.id("dataSourceId"));
		Select dropdown2 = new Select(sourceElement2);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		WebElement sourceElement3 = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown3 = new Select(sourceElement3);
		dropdown3.selectByIndex(6);
		WebElement sourceElement4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown4 = new Select(sourceElement4);
		dropdown4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
