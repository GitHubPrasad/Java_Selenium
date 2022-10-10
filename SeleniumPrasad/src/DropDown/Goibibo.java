package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goibibo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//a[text()='Trains']")).click();
		//WebElement text = driver.findElement(By.xpath("//input[@class='textInput width100 ellipsis']"));
		driver.findElement(By.xpath("//input[@class='textInput width100 ellipsis']")).sendKeys("Delhi");
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='fb black']"));
		System.out.println(list.size());
		
		
		for(int i=0;i<=list.size();i++)
		{
			
			if(list.get(2).getText().equalsIgnoreCase(null))
			{
				((WebElement) list).click();
				break;
			}
		}
		

	
		/*Actions act = new Actions(driver);
	    act.click(text).perform();
	    act.sendKeys(text, "Bengaluru").perform();
	    act.pause(2000).perform();
	    act.sendKeys(text, Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
