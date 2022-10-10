package Doubts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.bing.com/");
		driver.manage().window().fullscreen();

	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
