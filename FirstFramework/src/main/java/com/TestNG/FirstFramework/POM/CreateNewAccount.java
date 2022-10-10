package com.TestNG.FirstFramework.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount 
{
	public CreateNewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement newPassword;
	
	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month;	
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement year;	
	
	@FindBy(xpath = "(//label[@class='_58mt'])[1]")
	private WebElement female;
	
	@FindBy(xpath = "(//input[@class='_8esa'])[1]")
	private WebElement femaleRadio;
	
	@FindBy(xpath = "(//label[@class='_58mt'])[2]")
	private WebElement male;
	
	@FindBy(xpath = "(//input[@class='_8esa'])[2]")
	private WebElement maleRadio;
	
	@FindBy(xpath = "(//label[@class='_58mt'])[3]")
	private WebElement custom;
	
	@FindBy(xpath = "(//input[@class='_8esa'])[3]")
	private WebElement customRadio;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement signUp;
	
	@FindBy(xpath = "//img[@class='_8idr img']")
	private WebElement cross;

	public WebElement getFirstName() 
	{
		return firstName;
	}

	public WebElement getLastName() 
	{
		return lastName;
	}

	public WebElement getMobileNumber() 
	{
		return mobileNumber;
	}

	public WebElement getNewPassword() 
	{
		return newPassword;
	}

	public WebElement getDay() 
	{
		return day;
	}

	public WebElement getMonth() 
	{
		return month;
	}

	public WebElement getYear() 
	{
		return year;
	}

	public WebElement getFemale() 
	{
		return female;
	}

	public WebElement getFemaleRadio()
	{
		return femaleRadio;
	}

	public WebElement getMale() 
	{
		return male;
	}

	public WebElement getMaleRadio() 
	{
		return maleRadio;
	}

	public WebElement getCustom() 
	{
		return custom;
	}

	public WebElement getCustomRadio() 
	{
		return customRadio;
	}

	public WebElement getSignUp() 
	{
		return signUp;
	}

	public WebElement getCross() 
	{
		return cross;
	}

	
	
}
