package com.Framework.NopCommerce;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Framework.NopCommerce.POM.Register;

public class RegisterTest 
{
	WebDriver driver;
	UtilityNC ui = new UtilityNC();
	
	@BeforeSuite
	public void setup()
	{
		driver = BaseClassNC.getDriver();
	}
	
	@Test
	public void register() throws IOException, InterruptedException
	{
		Register rg = new Register(driver);
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		rg.getMaleRadio().click();
		Thread.sleep(1500);
		
		rg.getFemaleRadio().click();
		Thread.sleep(1500);
			
		String pass1 = (String) ui.getPropertyFile().get("fname");
		rg.getFirstName().sendKeys(pass1);
		Thread.sleep(1500);
		
		String pass2 = (String) ui.getPropertyFile().get("lname");
		rg.getLastName().sendKeys(pass2);
		Thread.sleep(1500);
		
		WebElement d = rg.getDay();
		Select s1 = new Select(d);
		s1.selectByIndex(11);
		Thread.sleep(1500);
		
		WebElement m = rg.getMonth();
		Select s2 = new Select(m);
		s2.selectByIndex(3);
		Thread.sleep(1500);
		
		WebElement y = rg.getYear();
		Select s3 = new Select(y);
		s3.selectByIndex(85);
		Thread.sleep(1500);
		
		String mail = (String) ui.getPropertyFile().get("email");
		rg.getEmail().sendKeys(mail);
		Thread.sleep(1500);
		
		String com = (String) ui.getPropertyFile().get("company");
		rg.getCompany().sendKeys(com);
		Thread.sleep(1500);
		
		rg.getNewsLetterRadio().click();
		Thread.sleep(1500);
		
		String psw = (String) ui.getPropertyFile().get("password");
		rg.getPassword().sendKeys(psw);
		Thread.sleep(1500);
		
		String cpsw = (String) ui.getPropertyFile().get("password");
		rg.getConfirmPass().sendKeys(cpsw);
		Thread.sleep(1500);
		
		//rg.getRegister().click();
		//Thread.sleep(1500);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("D:\\Tutorials\\regnp.jpg"));
				
	}
	
	@AfterSuite
	public void teardown() 
	{
		driver.quit();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

