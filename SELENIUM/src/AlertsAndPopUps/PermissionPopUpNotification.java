package AlertsAndPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUpNotification //Done!
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hdfcbank.com/");
		
		
	}

}
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		//Prasad