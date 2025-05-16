package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SalesforceTestng extends ProjectSpecificMethod {
	
	@Test
	public void runSalesforce() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[10]")).click();
		driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")).click();
		driver.findElement(By.xpath("//span[@class='slds-media__body']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		}
	
	

}
