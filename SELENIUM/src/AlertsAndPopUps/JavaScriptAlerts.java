package AlertsAndPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts //Done!
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.manage().window().maximize();

		//Alert window with OK Button
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Alert window with OK and CANCEL button
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();  //OK
		driver.switchTo().alert().dismiss(); //Cancel
	
		//Alert window with input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
	
		Alert alertwindow = driver.switchTo().alert();
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
