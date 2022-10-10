package com.TestNG.FirstFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TestNG.FirstFramework.POM.LoginPage;
import com.beust.jcommander.Parameter;

public class ParallelBrowsing 
{
	WebDriver driver;
	
	
	/*public void chrome()
	{
		driver = BaseClass.chromeDriver();
		LoginPage lp = new LoginPage(driver);
		driver.get("https://www.facebook.com/");
	}
		
	public void firefox()	
	{
		driver = BaseClass.firefoxDriver();
		LoginPage lp = new LoginPage(driver);
		driver.get("https://www.facebook.com/");
	}
	
	public void edge()
	{
		driver = BaseClass.edgeDriver();
		LoginPage lp = new LoginPage(driver);
		driver.get("https://www.facebook.com/");
	}*/
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("Browser name is: "+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = BaseClass.chromeDriver();
		}
	    
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = BaseClass.firefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = BaseClass.edgeDriver();
		}
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
		
	public void teardown()
	{
		System.out.println("Test completed successfully.");
	}
	
}
