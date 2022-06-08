package assignments;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonetab
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.Bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Diamond Rings");
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The Ellie Charm Ring']")).click();
		Thread.sleep(2000);
		
	    String parentHandle = driver.getWindowHandle();
	    Set<String> allHandle = driver.getWindowHandles();
	    
	    for(String wh :allHandle)
	    {
	    	if(!parentHandle.equals(wh))
	    	{
	    		driver.switchTo().window(wh);
	    	}
	    	
	    	else
	    	{
	    		
	    	}
	    }
		
		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.id("getNearestStore")).clear();
	    driver.findElement(By.id("getNearestStore")).sendKeys("410501");
	    driver.findElement(By.xpath("//div[text()='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		
	}

}


