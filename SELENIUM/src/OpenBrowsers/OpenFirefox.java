package OpenBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class OpenFirefox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.close();
		

	}

}
