package com.TestNG.FirstFramework.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassword 
{
	public ForgottenPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='identify_email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@name='did_submit']")
	private WebElement search ;
	
	@FindBy(xpath = "//a[@class='_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy']")
	private WebElement cancel ;

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getSearch() 
	{
		return search;
	}

	public WebElement getCancel() 
	{
		return cancel;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
