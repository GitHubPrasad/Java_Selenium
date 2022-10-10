package Screenshots;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShortMethod 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://getintopc.com/");
		driver.manage().window().maximize();

		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(ss, new File("D:\\Documents\\dsdd.jpg"));

	}

}
