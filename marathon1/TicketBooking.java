package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='sc-bdfCDU gCCOIc']")).click();
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//li//span[text()='Tomorrow']")).click();
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		driver.findElement(By.xpath("//li//span[text()='GOOD BAD UGLY']")).click();
		//driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		driver.findElement(By.xpath("//span[text()='12:25 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.id("SL.SILVER|F:12")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		}

}
