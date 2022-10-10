package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		search.sendKeys("kgf");
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='sbqs_c']//b"));
	
		System.out.println("Size of Auto Suggestion: "+list.size());
	
		for(WebElement item:list)
		{
			if(item.getText().contains("chapter 2"))
			{
				item.click();
				break;
			}
		}
	
		Thread.sleep(5000);
	
		driver.close();
	
	
	
	}

}
