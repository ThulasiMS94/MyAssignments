package week6.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class CreateLead extends BaseClass {

	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String[][] data = new String[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "Vineeth";
		data[0][2] = "Rajendran";

		data[1][0] = "Qeagle";
		data[1][1] = "Hari";
		data[1][2] = "R";
		return data;
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String companyName, String firstName, String lastName) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}
}
