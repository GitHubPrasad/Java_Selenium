package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfSection 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		WebElement section = driver.findElement(By.xpath("//div[@class='page-body']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\Documents\\ss.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
