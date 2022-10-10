package com.TestNG.FirstFramework.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement newAccount;
	
	@FindBy(xpath = "//div[@id='reg_pages_msg']//a[text()='Create a Page']")
	private WebElement pageCreate;

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}

	public WebElement getForgotPassword()
	{
		return forgotPassword;
	}

	public WebElement getNewAccount() 
	{
		return newAccount;
	}

	public WebElement getPageCreate() 
	{
		return pageCreate;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
