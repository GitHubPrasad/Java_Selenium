package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboFlights 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		WebElement ww = driver.findElement(By.xpath("(//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'])[1]"));
		ww.click();
		WebElement ww1 = driver.findElement(By.xpath("//input[@type='text']"));
		ww1.sendKeys("Mumbai");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='sc-jObWnj dmPlWU']"));
		System.out.println(list.size());
	
		for(WebElement listitem:list)
		{
			if(listitem.getText().equals("Mumbai, India"))
			{
				listitem.click();
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
