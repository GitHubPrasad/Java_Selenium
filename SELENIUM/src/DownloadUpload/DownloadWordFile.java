package DownloadUpload;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadWordFile 
{

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir")+"\\Download\\";
		
		HashMap preferences = new HashMap<>();
		preferences.put("download.default_directory", projectPath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
					
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Select file size & download'])[1]")).click();

	}

}
