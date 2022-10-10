package Tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLsInTwoTabs //Done!
{

	//driver.switchTo().newWindow(WindowType.TAB);
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
		driver.quit();
		
		/*If you want to open the second URL in another browser 
		then instead of .TAB use .WINDOW
		driver.switchTo().newWindow(WindowType.WINDOW);
		Two Chrome browsers will open.*/
	
	
	
	}

}
