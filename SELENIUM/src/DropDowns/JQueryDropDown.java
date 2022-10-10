package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown //Done!
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		
		//1//SelectChoiceValues(driver, "choice1");
		//2//SelectChoiceValues(driver, "choice1", "choice 2", "choice 1 2");
		//3//SelectChoiceValues(driver, "all");
	}
	
	//(String...value) by this we can pass single, multiple and all values.
	public static void SelectChoiceValues(WebElement driver, String... value)
	{
		List <WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choicelist)
			{
				String text = item.getText();
				
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}
			}
		}
		else
		{
			for(WebElement item:choicelist)
			{
				item.click();
			}
		}
			
	
	
	
	
	
	
	
	
	
	
	}





















}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
