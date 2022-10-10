package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");

		driver.navigate().to("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("sc-fHeRUh jHgPBA")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Hotels")).click();
		//driver.findElement(By.name("CountryType")).click();
		driver.findElement(By.xpath("(//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-9 SearchBlockUIstyles__RadioText-sc-fity7j-5 bjZxoj gcGwhT'])[2]")).click();
		driver.findElement(By.id("downshift-1-input")).sendKeys("Mumbai");
		driver.findElement(By.linkText("Search Hotels")).click();
	
	
	
	
	}

}
