package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Drawing Border
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawBorder(logo, driver);
		
		driver.navigate().refresh();
		
		//Get Title of the page
		String title = JavaScriptUtil.getTitlebyJS(driver);
		System.out.println(title);
		
		driver.navigate().refresh();
		
		//Click Action
		WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtil.clickElementByJS(register, driver);
		
		driver.navigate().back();
		
		//Generate Alert
		JavaScriptUtil.generateAlert(driver, "This is my alert");
		
		//Refresh Page
		JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Scroll Down Page
		JavaScriptUtil.scrollPageDown(driver);
		
		//Scroll Page UP
		JavaScriptUtil.scrollPageUp(driver);
		
		
		
		
		

	}

}
