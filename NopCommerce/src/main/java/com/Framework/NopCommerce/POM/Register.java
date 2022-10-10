package com.Framework.NopCommerce.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register 
{
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleRadio ;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private WebElement femaleRadio ;	
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstName ;
	
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastName;

	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	private WebElement year;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Company']")
	private WebElement company;

	@FindBy(xpath = "//input[@id='Newsletter']")
	private WebElement newsLetterRadio ;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirmPass;

	@FindBy(xpath = "//button[@id='register-button']")
	private WebElement register;

	public WebElement getMaleRadio() 
	{
		return maleRadio;
	}

	public WebElement getFemaleRadio() 
	{
		return femaleRadio;
	}

	public WebElement getFirstName() 
	{
		return firstName;
	}

	public WebElement getLastName() 
	{
		return lastName;
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

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getCompany() 
	{
		return company;
	}

	public WebElement getNewsLetterRadio() 
	{
		return newsLetterRadio;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getConfirmPass() 
	{
		return confirmPass;
	}

	public WebElement getRegister() 
	{
		return register;
	}
}
