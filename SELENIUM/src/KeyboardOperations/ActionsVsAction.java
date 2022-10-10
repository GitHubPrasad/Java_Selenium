package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction //enter web
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();

		WebElement features = driver.findElement(By.xpath(""));
		
		Actions act = new Actions(driver);
		act.moveToElement(features).perform();
	
		Thread.sleep(3000);
	
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
