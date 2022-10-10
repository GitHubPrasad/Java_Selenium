package com.Instagram.POM;

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

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username ;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password ;
	
	@FindBy(xpath = "//button[@class='sqdOP yWX7d     _8A5w5    ']")
	private WebElement show;

	@FindBy(xpath = "//button[@class='sqdOP  L3NKy   y3zKF     ']//div[text()='Log In']")
	private WebElement LoginButton;

	@FindBy(xpath = "//span[text()='Log in with Facebook']")
	private WebElement FBLink ;

	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement ForgotPass ;

	@FindBy(xpath = "//span[text()='Sign up']")
	private WebElement SignUp ;

	@FindBy(xpath = "(//img[@class='Rt8TI '])[1]")
	private WebElement IStore ;

	@FindBy(xpath = "(//img[@class='Rt8TI '])[2]")
	private WebElement PlayStore;

	public WebElement getUsername() 
	{
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() 
	{
		return LoginButton;
	}

	public WebElement getFBLink() 
	{
		return FBLink;
	}

	public WebElement getForgotPass() 
	{
		return ForgotPass;
	}

	public WebElement getSignUp() 
	{
		return SignUp;
	}

	public WebElement getIStore() 
	{
		return IStore;
	}

	public WebElement getPlayStore() 
	{
		return PlayStore;
	}

	public WebElement getShow() 
	{
		return show;
	}

	













}
