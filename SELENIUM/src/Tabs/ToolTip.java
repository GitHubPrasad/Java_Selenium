package Tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip //Done!
{

	//Capture tooltip of the web element
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
		
		String tooltip = inputbox.getAttribute("title");
		
		System.out.println("Tooltip is: "+tooltip);
	
		Thread.sleep(2000);
	
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
