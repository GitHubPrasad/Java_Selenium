package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int brokenlinks = 0;
		
		for(WebElement element:links )
		{
			String url = element.getAttribute("href");
			
			if(url == null || url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
		
			URL link = new URL("url");
			
			try 
			{
				HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
				httpcon.connect();
				if(httpcon.getResponseCode()>=400)
				{
					System.out.println(httpcon.getResponseCode()+ " is broken link");
					brokenlinks++;
				}
				else 
				{
					System.out.println(httpcon.getResponseCode()+ " is Valid link");
				}
			}
			catch(MalformedURLException e)
			{
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
		}

			
	
	
	
	
	
	
	
	
	
	
	
	}

}
