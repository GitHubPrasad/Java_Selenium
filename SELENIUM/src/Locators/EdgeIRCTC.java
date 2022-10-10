package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeIRCTC 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Files\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.google.com");
		
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("OK")).click();
		//driver.switchTo().alert().accept();
		//WebElement ok = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		//ok.click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("NAGPUR_NGP");
				
		//driver.quit();
		
		//Done!
	
	
	
	
	
	
	}

}
