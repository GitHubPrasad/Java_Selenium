package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nopcommerce 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//System.out.println(driver.findElements(By.tagName("div")).size());

	    List<WebElement> elements = driver.findElements(By.tagName("div"));
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++)
	    {
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("id"));
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
