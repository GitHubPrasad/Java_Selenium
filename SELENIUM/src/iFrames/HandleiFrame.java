package iFrames;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleiFrame //Done!
{
	//name, id, webelement, index
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		//First iFrame
		driver.switchTo().frame("packageListFrame");  //Name of the frame.
		driver.findElement(By.xpath("(//a[normalize-space()='org.openqa.selenium'])[1]")).click();
		driver.switchTo().defaultContent();  //switch to the main frame
	
		//Second iFrame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		
		//Third iFrame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
	
	
	
	
	
	
	
	
	}

}
