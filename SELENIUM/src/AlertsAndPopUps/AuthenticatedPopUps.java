package AlertsAndPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUps //Done!
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
//		Syntax
//		https://username:password@the-internet.herokuapp.com/basic_auth

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
