package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Kitchen")).click();
	
		driver.navigate().to("https://www.amazon.in/");
		//Capture all links present on web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. of links "+links.size());
	
		for(WebElement each:links )
		{
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));
		}
	
		/*for(int i = 0; i<= links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}*/
	
	
	
	
	
	
	
	
	
	}

}
