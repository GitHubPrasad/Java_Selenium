package DropDowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SortedDropDown 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//a[@text()='Live Posting']")).click();
		
		WebElement ele = driver.findElement(By.name("category_id"));
		Select se = new Select(ele);
		List<WebElement> allop = se.getOptions();
		
		ArrayList originalList = new ArrayList<>();
		ArrayList tempList = new ArrayList<>();
	
		for(WebElement op:allop)
		{
			originalList.add(op.getText()); //added elements to original list
			tempList.add(op.getText());     //added elements to temp list
		}
	
		System.out.println("Original List: "+originalList);
		System.out.println("Original List: "+tempList);
	
		Collections.sort(tempList);   //Sorting
	
		System.out.println("Original List: "+originalList);
		System.out.println("Original List: "+tempList);
	
		if(originalList.equals(tempList))
		{
			System.out.println("DropDown is Sorted...");
		}
		else
		{
			System.out.println("DropDown is Not Sorted...");
		}
	
		driver.quit();
	}

}
