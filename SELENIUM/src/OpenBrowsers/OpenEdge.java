package OpenBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Files\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

	}

}
