package SDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");

		// Fill out the signup form
		driver.findElement(By.name("firstname")).sendKeys("Shubham");
		driver.findElement(By.name("lastname")).sendKeys("Darkunde");
		driver.findElement(By.name("reg_email__")).sendKeys("darkunde@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("darkunde@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password123");
		driver.findElement(By.name("birthday_day")).sendKeys("15");
		driver.findElement(By.name("birthday_month")).sendKeys("Jul");
		driver.findElement(By.name("birthday_year")).sendKeys("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click(); // Male
		driver.findElement(By.name("websubmit")).click();

		driver.quit();

	}

}
