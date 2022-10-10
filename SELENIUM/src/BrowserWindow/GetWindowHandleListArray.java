package BrowserWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleListArray //Done!
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
		
		Set<String> windowIDS = driver.getWindowHandles();   //returns IDs of the multiple browser windows

		//using ARRAYLIST
		
		List<String> windowIDList = new ArrayList<>(windowIDS);
		
		String parentwindowId = windowIDList.get(0);
		String childwindowId = windowIDList.get(1);
		
		System.out.println("Parent window ID: "+parentwindowId);
		System.out.println("------------------------------------");
		System.out.println("Child window ID: "+childwindowId);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
