package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromefacebuk 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("prasadpatil.parijat@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Facebook");
		driver.findElement(By.name("login")).click();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.navigate().back();
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Prasad");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.name("reg_email__")).sendKeys("prasadpatil.parijat@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		
		driver.navigate().back();
		
		try {
			Thread.sleep(20000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

}
