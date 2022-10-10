package com.Framework.NopCommerce;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Framework.NopCommerce.POM.SignIn;

@Listeners(com.Framework.NopCommerce.Listener.Listener.class)
public class SignInTest 
{
	WebDriver driver;
	UtilityNC ui = new UtilityNC();
	
	@BeforeSuite
	public void setup()
	{
		driver = BaseClassNC.getDriver();
	}
	
	@Test(invocationCount = 2)
	public void signIn() throws IOException, InterruptedException
	{
		SignIn sp = new SignIn(driver);
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		String pass1 = (String) ui.getPropertyFile().get("email");
		sp.getEmail().sendKeys(pass1);
		Thread.sleep(1500);
		
		String pass2 = (String) ui.getPropertyFile().get("password");
		sp.getPassword().sendKeys(pass2);
		Thread.sleep(1500);
		
		sp.getCheckbox().click();
		Thread.sleep(1500);
		
		/*sp.getForgetPass().click();
		Thread.sleep(1500);
		
		driver.navigate().back();*/
		
		sp.getLogin().click();
		Thread.sleep(1500);
		
		//File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(ss, new File("D:\\Tutorials\\Nop.jpg"));
		
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
