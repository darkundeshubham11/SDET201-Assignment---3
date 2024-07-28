package SDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		Actions actions = new Actions(driver);

		// Mouse hover over "Electronics"
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		actions.moveToElement(electronics).perform();

		// Mouse hover over "Fashion"
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		actions.moveToElement(fashion).perform();

		// Mouse hover over "Refurbished"
		WebElement refurbished = driver.findElement(By.linkText("Refurbished"));
		actions.moveToElement(refurbished).perform();

		driver.quit();
	}

}
