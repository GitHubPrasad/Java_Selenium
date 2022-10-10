package com.TestNG.FirstFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.TestNG.FirstFramework.POM.CreateNewAccount;
import com.TestNG.FirstFramework.POM.ForgottenPassword;

public class CreateNewAccountTest 
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
	public void CreateAccountTest() throws IOException, InterruptedException 
	{
		CreateNewAccount cna = new CreateNewAccount(driver);
		driver.get("https://www.facebook.com/r.php?r=101");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Excel Sheet
		fiso = ui.getFile();
		Sheet sh = WorkbookFactory.create(fiso).getSheet("sheet1");
		cna.getFirstName().sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
						
		//Config File
		String lname = (String)ui.getPropertyFile().get("last");
		cna.getLastName().sendKeys(lname);
		//Thread.sleep(2000);
		
		String mobile = (String)ui.getPropertyFile().get("mobile");
		cna.getMobileNumber().sendKeys(mobile);
		//Thread.sleep(1000);
		
		String newpass = (String)ui.getPropertyFile().get("pass");
		cna.getNewPassword().sendKeys(newpass);
		//Thread.sleep(1000);
		
		//Remember This
		WebElement day = cna.getDay();
		Select d = new Select(day);
		d.selectByValue("11");
		
		String month = (String)ui.getPropertyFile().get("month");
		cna.getMonth().sendKeys(month);
		//Thread.sleep(1000);
		
		String year = (String)ui.getPropertyFile().get("year");
		cna.getYear().sendKeys(year);
		//Thread.sleep(1000);
		
		cna.getFemaleRadio().click();
		//Thread.sleep(1000);

		cna.getMale().click();
		//Thread.sleep(1000);
		
		//File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(ss, new File("D:\\Tutorials\\img.jpg"));
		
		cna.getSignUp().click();
									
	}
	
	@AfterSuite
	public void teardown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
