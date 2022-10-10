package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeNavigate 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    driver.get("https://uidai.gov.in/");
	    
	    driver.navigate().to("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.manage().window().maximize();
	    //driver.close();
	    
	    String source = driver.getPageSource();
	    System.out.println(source);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.quit();
	   	
	
	
	
	}

}
