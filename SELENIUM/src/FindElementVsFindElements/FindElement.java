package FindElementVsFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement 
{

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		//1
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("camera");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
		driver.navigate().back();
		
		//2
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
				
		//3
		driver.findElement(By.xpath("//button[normalize-space()='login']"));
		//Here it will throw NoSuchElementException
	
		}

}
