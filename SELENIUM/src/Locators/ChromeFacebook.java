package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebook 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("prasadpatil.parijat@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Facebook");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		try {
			Thread.sleep(7000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
