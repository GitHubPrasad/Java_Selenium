package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
		System.out.println("Number of Elements in DD List: "+list.size());
	
		Thread.sleep(3000);
		
		for(WebElement listitem:list)
		{
			if(listitem.getText().equals("selenium webdriver"))
			{
				listitem.click();
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
