package com.TestNG.FirstFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestNG.FirstFramework.POM.LoginPage;

@Listeners(com.TestNG.FirstFramework.Listeners.Listeners.class) //
public class LoginTest 
{
	WebDriver driver;
	Utility ui = new Utility();		//Default Constructor
	FileInputStream fiso;
		
	
	@BeforeSuite
	public void setup()
	{
		 driver = BaseClass.chromeDriver();
	}
	
	@Test
	public void LoginTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		driver.get("https://www.facebook.com/");
		
		//Excel File
		fiso = ui.getFile();
		Sheet sh = WorkbookFactory.create(fiso).getSheet("sheet1");
		lp.getEmail().sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//Config File
		String pass = (String)ui.getPropertyFile().get("password");
		lp.getPassword().sendKeys(pass);
		Thread.sleep(2000);
		
		lp.getLoginButton().click();
		
		Thread.sleep(3000);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("D:\\Documents\\ds.jpg"));
					
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
		
}
