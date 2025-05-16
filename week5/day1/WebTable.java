package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {

		// Launch the browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("https://erail.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter "MAS" as the "From" station
		WebElement stationFrom = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		stationFrom.clear();
		stationFrom.sendKeys("MAS", Keys.ENTER);

		// Enter "MDU" as the "To" station
		WebElement stationTo = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		stationTo.clear();
		stationTo.sendKeys("MDU", Keys.ENTER);

		// Uncheck the "Sort on Date" checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

		// Locate the table
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));

		// Retrieve the train names from the web table
		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		List<String> trainNames = new ArrayList<>();
		System.out.println("List of train names is: ");
		for (WebElement name : trainList) {
			String trainText = name.getText();
			trainNames.add(trainText);
			System.out.println(trainText);
		}

		// Verify if there are any duplicate train names
		Set<String> duplicateTrain = new HashSet<String>(trainNames);
		if (trainNames.size() == duplicateTrain.size()) {
			System.out.println("No duplicate train name is present");
		} else {
			System.out.println("Duplicate train name is present");

		}

	}

}
