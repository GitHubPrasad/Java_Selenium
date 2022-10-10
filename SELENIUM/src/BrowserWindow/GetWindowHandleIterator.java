package BrowserWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleIterator
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		
		//getWindowHandle
		String windowID = driver.getWindowHandle();	//returns ID of the single browser window
		System.out.println(windowID);	

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	
		//getWindowHandleS
		
		Set<String> windowIDS = driver.getWindowHandles();   //return IDs of the multiple browser windows
	
		//First Method : ITERATOR
		
		Iterator<String> it = windowIDS.iterator();
		
		String parentwindowId = it.next();
		String childwindowId = it.next();
		
		System.out.println("Parent window ID: "+parentwindowId);
		System.out.println("------------------------------------");
		System.out.println("Child window ID: "+childwindowId);
	
		//How to use Window IDs for Switching
		driver.switchTo().window(parentwindowId);
	
	}

}
