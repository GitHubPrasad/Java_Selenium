package com.Framework.NopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassNC 
{
	public static WebDriver getDriver()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		return driver;
	}
	
	
	
	
}
