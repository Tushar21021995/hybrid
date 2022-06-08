package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case4locator {

	public static void main(String[] args) throws InterruptedException 
	{
		// XPATH USING MUILTIPLE ATTRIBUTES

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.puma.com/");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[contains(@placeholder,'puma') and contains(@class,'validated')]")).sendKeys("shoes");
	    
	
	}

}
