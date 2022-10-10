package iFrames;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InneriFrames  //Done! 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement outeriframe = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])[1]"));
		driver.switchTo().frame(outeriframe);  //here we are passing iframe as a web element.
		
		WebElement inneriframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inneriframe);  //here we are passing iframe as a web element.
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Welcome");
		
	}

}
