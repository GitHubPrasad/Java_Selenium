package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap //Done!
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//Removing popups
		driver.findElement(By.xpath("//div[@id='nvpush_cross']")).click();
		driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
		//Product Type
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> protype = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of Product Type Options "+protype.size());
	
		for(WebElement prt:protype)
		{
			if(prt.getText().equals("Accounts"))
			{
				prt.click();
				break;
			}
		}
	
		//Products
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> prod = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Number of Product Options "+prod.size());
			
		for(WebElement pd:prod)
			{
				if(pd.getText().equals("Salary Accounts"))
				{
					pd.click();
					break;
				}
			}
			
		//END
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
