package com.Framework.InstagramFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Instagram.POM.LoginPage;

public class LoginTestPage 
{
	WebDriver driver;
	Utility ui = new Utility();
	
	@BeforeSuite
	public void setup()
	{
		driver = BaseClass.getDriver();
	}
		
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		LoginPage ilp = new LoginPage(driver);   //choose POM file
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		String pass1 = (String) ui.getPropertyFile().get("username");
		ilp.getUsername().sendKeys(pass1);
		Thread.sleep(1500);
		
		String pass2 = (String) ui.getPropertyFile().get("password");
		ilp.getPassword().sendKeys(pass2);
		Thread.sleep(1500);
		
		ilp.getShow().click();
		Thread.sleep(1500);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("D:\\Tutorials\\AC.png"));
		
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
