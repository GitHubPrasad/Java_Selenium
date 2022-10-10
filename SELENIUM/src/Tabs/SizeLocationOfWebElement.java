package Tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeLocationOfWebElement   //Done!
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

		//Location - Method 1
		System.out.println(logo.getLocation());
		System.out.println(logo.getLocation().getX());
		System.out.println(logo.getLocation().getY());
	
		//Location - Method 2
		System.out.println(logo.getLocation());
		System.out.println(logo.getRect().getX());
		System.out.println(logo.getRect().getY());
	
		//Location - Method 1
		System.out.println(logo.getSize());
		System.out.println(logo.getSize().getWidth());
		System.out.println(logo.getSize().getHeight());
	
		//Location - Method 2
		System.out.println(logo.getLocation());
		System.out.println(logo.getRect().getDimension().getWidth());
		System.out.println(logo.getRect().getDimension().getHeight());
	
	
	
	
	
	
	
	}

}
