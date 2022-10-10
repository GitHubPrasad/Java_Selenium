package ScrollingWebPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling //Done!
{
	//JavascriptExecutor is an Interface
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Files\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scrolling by using pixel
		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Scrolling page till we find element
		WebElement flag = driver.findElement(By.xpath("//td[text()='Spain']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		driver.quit();
				
	}

}
