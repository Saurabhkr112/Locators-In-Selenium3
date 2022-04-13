package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IDExample3 {
	@Test

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\DXC Selenium Class\\Locators In Selenium3\\SeleniumFirefoxJars5\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("Admin");
		driver.findElement(By.id("input-password")).sendKeys("admin123");
			

	}

}
