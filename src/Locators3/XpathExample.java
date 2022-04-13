package Locators3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XpathExample {
	@Test

	public void IdDemo() {
		
		System.setProperty("webdriver.gecko.driver","D:\\DXC Selenium Class\\Locators In Selenium3\\SeleniumFirefoxJars5\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		
		

}
}