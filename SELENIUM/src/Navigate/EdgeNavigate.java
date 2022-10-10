package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeNavigate 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Files\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
	
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
