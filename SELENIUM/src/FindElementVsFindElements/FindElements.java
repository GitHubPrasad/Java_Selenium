package FindElementVsFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	
		//1
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("No. of elements "+links.size()); //22
		
		for(WebElement each:links )
		{
			System.out.println(each.getText());
		}
	
		//2
		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size()); //1
	
		//3 Exception
		List<WebElement> zero =driver.findElements(By.xpath("//button[normalize-space()='login']"));
		System.out.println(zero.size());
	
			
	}

}
