package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider //Done!
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/home-improvement/pr?sid=h1m&offer=nb%3Amp%3A03689a9f19&hpid=HcTXisBx4-eA4waG4OrVM6p7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJVcCB0byA2MCUgT2ZmIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiTERCR1lONkZVS1BLRkdHQiIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkhvbWUgSW1wcm92ZW1lbnQgUmFuZ2UiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19&fm=neo%2Fmerchandising&iid=M_2b164fb5-5a2c-4d68-afa3-9dfd487516bf_3.L9ND4EYLLPKZ&ssid=j9n68ccshs0000001651214257785&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_4_3.dealCard.OMU_L9ND4EYLLPKZ_3&otracker1=hp_omu_SECTIONED_manualRanking_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_dealCard_cc_4_NA_view-all_3&cid=L9ND4EYLLPKZ&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax");
		driver.manage().window().maximize();

		//MIN Slider
		WebElement min = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		System.out.println("Location of min slider: "+min.getLocation());
		System.out.println("Dimension of min slider: "+min.getSize());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min, 100, 0).perform();
		
		System.out.println("Location of min slider: "+min.getLocation());
		System.out.println("Dimension of min slider: "+min.getSize());
		
		Thread.sleep(3000);
		
		//MAX Slider
		WebElement max = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		System.out.println("Location of max slider: "+max.getLocation());
		System.out.println("Dimension of max slider: "+max.getSize());
		
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(max, -28, 0).perform();
		
		System.out.println("Location of max slider: "+max.getLocation());
		System.out.println("Dimension of max slider: "+max.getSize());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
