package Tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab  //Done!

{
	//.sendKeys(Keys.CONTROL, Keys.RETURN);
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).sendKeys(Keys.CONTROL, Keys.RETURN);
	}

}
