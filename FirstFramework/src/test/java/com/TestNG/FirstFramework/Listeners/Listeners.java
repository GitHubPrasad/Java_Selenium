package com.TestNG.FirstFramework.Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestNG.FirstFramework.BaseClass;

public class Listeners implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		System.out.println("onTestStart...");
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("onTestSuccess...");
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("onTestFailure...");
		
		String projectpath = System.getProperty("user.dir");
		WebDriver driver = BaseClass.chromeDriver();
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, new File(projectpath+"//Screenshot//"+result.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped...");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("onTestFailedButWithinSuccessPercentage...");
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{

	}

	public void onStart(ITestContext context) 
	{

	}

	public void onFinish(ITestContext context) 
	{

	}
}
