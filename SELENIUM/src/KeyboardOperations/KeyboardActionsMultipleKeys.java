package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsMultipleKeys 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	
		input1.sendKeys("Prasad Vijay Patil");
		
		Actions act = new Actions(driver);
		
		//ctrl + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl + C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB shift to input2 box
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//ctrl + v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	
		//Compare text 
		if(input1.getText().equals(input2.getText()))
			System.out.println("Text is copied");
		else
			System.out.println("Text not copied");
	
	
	
	
	
	
	}

}
