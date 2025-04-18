package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Straive");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thulasi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shankar");
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(sourceElement);
		// dropdown.selectByIndex(2);
		// dropdown.selectByValue("LEAD_EMPLOYEE");
		dropdown.selectByVisibleText("Public Relations");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Create Lead");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.close();

	}

}
