package com.TestNG.FirstFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver chromeDriver()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		return driver;
	}
	
	public static WebDriver firefoxDriver()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.facebook.com/");
		return driver;
	}
	
	public static WebDriver edgeDriver()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//driver.get("https://www.facebook.com/");
		return driver;
	}
}
