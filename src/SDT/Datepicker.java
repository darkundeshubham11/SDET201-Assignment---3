package SDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		// Click on the date picker input field
		WebElement datePicker = driver.findElement(By.id("datepicker1"));
		datePicker.click();

		// Select the date (e.g., 15th of the current month)
		WebElement date = driver.findElement(By.xpath("//a[contains(@class, 'ui-state-default') and text()='15']"));
		date.click();

		driver.quit();
	}

}
