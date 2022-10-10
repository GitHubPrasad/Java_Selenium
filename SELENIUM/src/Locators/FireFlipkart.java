package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFlipkart 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("prasad");
		
		driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Grocery")).click();
		
		
        
        //driver.findElement(By.linkText("Grocery")).click();		
		//driver.findElement(By.name("q")).sendKeys("camera");
		

	}

}
