package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown //Done!
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement dropDate = driver.findElement(By.name("DateOfBirthDay"));
		Select date = new Select(dropDate);
		date.selectByValue("11");
		
		WebElement dropMonth = driver.findElement(By.name("DateOfBirthMonth"));
		Select month = new Select(dropMonth);
		month.selectByVisibleText("March");
	
		//WebElement dropYeer = driver.findElement(By.name("DateOfBirthYear"));
		WebElement dropYear= driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		Select year = new Select(dropYear);
		year.selectByVisibleText("1996");
	
		Thread.sleep(3000);
		driver.navigate().refresh();
	
		//Select options from dropdown without using methods
		WebElement dropMonthq = driver.findElement(By.name("DateOfBirthMonth"));
		Select monthq = new Select(dropMonthq);
		List<WebElement> alloptions = monthq.getOptions();
		
		Thread.sleep(3000);
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("March"))
			{
				option.click();
				break;
			}
		}
		
	
		//END
	
	
	
	
	
	
	
	
	
	
	}

}
