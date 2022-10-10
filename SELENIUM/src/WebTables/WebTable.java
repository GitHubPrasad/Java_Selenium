package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	//parameterize the Xpath  ["+i+"]
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		//How many rows in a table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr"));
		System.out.println("No. of rows in a table: "+rows.size());
	
		//How many columns in a table
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr//th"));
		System.out.println("No. of rows in a table: "+columns.size());
	
		//Retrieve the specific row or column data
		WebElement data = driver.findElement(By.xpath(""));
		System.out.println("Specific data: "+data.getText());
	
		//Retrieve All the Data from the table
		int ro = rows.size();
		int co = columns.size();
		System.out.println("Data from the Table");
		for(int r=1; r<=ro; r++)
		{
			for(int c=1; c<=co; c++)
			{
				String content = driver.findElement(By.xpath("//table[@class='ws-table-all']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print("  "+content);
			}
			System.out.println();
		}
	
	
	
	}

}
