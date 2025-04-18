package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Thulasi");
		driver.findElement(By.name("lastname")).sendKeys("Shankar");
		WebElement sourceElement = driver.findElement(By.id("day"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByValue("14");
		WebElement sourceElement1 = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(sourceElement1);
		dropdown1.selectByVisibleText("Aug");
		WebElement sourceElement2 = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(sourceElement2);
		dropdown2.selectByValue("1994");
		driver.findElement(By.id("sex")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("welcome321@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Welcome@123");
		driver.findElement(By.name("websubmit")).click();
	}

}
