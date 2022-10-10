package com.TestNG.FirstFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.TestNG.FirstFramework.POM.ForgottenPassword;
import com.TestNG.FirstFramework.POM.LoginPage;

public class ForgottenPasswordTest 
{
	WebDriver driver;
	Utility ui = new Utility();		//Default Constructor
	//FileInputStream fiso;
		
	
	@BeforeSuite
	public void setup()
	{
		 driver = BaseClass.edgeDriver();
		 
	}
	
	@Test
	public void ForgottenPasswordTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ForgottenPassword fp = new ForgottenPassword(driver);
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(2000);
		
		//Config File
		String pass = (String)ui.getPropertyFile().get("username");
		fp.getEmail().sendKeys(pass);
		Thread.sleep(2000);
		
		//fp.getSearch().click();
					
	}
	
	@AfterSuite
	public void teardown()
	{
		//driver.quit();
	}
	
	
}
