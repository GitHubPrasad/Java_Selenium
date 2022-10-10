package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies //Done!
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		//Capture cookies from the browser
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
	
		//Print cookies from the browser
		for(Cookie cuki:cookies)
		{
			System.out.println(cuki.getName()+" : "+cuki.getValue());
		}
	
		//Add cookie to the browser
		Cookie cukiobj = new Cookie("Prasad", "7020");
		driver.manage().addCookie(cukiobj);
	
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after adding: "+cookies.size());
	
		//Delete Specific cookie
		//driver.manage().deleteCookieNamed(cukiobj);
		driver.manage().deleteCookieNamed("Prasad");
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after deletion: "+cookies.size());
	
		//How to delete all the cookies
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after delete All: "+cookies.size());
	}
}
