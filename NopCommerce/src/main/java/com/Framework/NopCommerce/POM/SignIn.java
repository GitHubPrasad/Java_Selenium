package com.Framework.NopCommerce.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn 
{
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@class='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='RememberMe']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement forgetPass;	
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement login;	
	
	@FindBy(xpath = "//button[@class='button-1 register-button']")
	private WebElement register;

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getCheckbox() 
	{
		return checkbox;
	}

	public WebElement getForgetPass() 
	{
		return forgetPass;
	}

	public WebElement getLogin() 
	{
		return login;
	}

	public WebElement getRegister() 
	{
		return register;
	}

}
