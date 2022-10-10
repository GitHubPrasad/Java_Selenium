package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxNavigate 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		driver.quit();
	}

}
