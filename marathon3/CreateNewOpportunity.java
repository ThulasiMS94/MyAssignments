package marathon3;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BaseClass {

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		String[][] readData = ReadExcelSales.readData();
		return readData;
	}

	@Test(dataProvider = "fetchData")
	public void createOpportunity(String Opportunity, String Amount) throws InterruptedException {

// Enter Opportunity name & Store it
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]"));
		oppName.sendKeys(Opportunity);
		Thread.sleep(4000);
		WebElement amount = driver.findElement(By.xpath("//input[@name='Amount']"));
		amount.sendKeys(Amount);

// Choose close date as Today
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[3]/td[7]")).click();
		// driver.findElement(By.xpath("//label[text()='Close
		// Date']/following::input[1]")).sendKeys("{{today}}");
// Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("//label[text()='Stage']/following::input")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();

// click Save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

// VerifyOppurtunity Name		
		String verifymsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");

		if (verifymsg.contains("Thulasi")) {
			System.out.println("New Oppurtunity Created");
		} else {
			System.out.println("Oppurtunity not Created");

			}
	}
}
