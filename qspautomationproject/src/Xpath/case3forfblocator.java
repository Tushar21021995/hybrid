package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case3forfblocator {

	public static void main(String[] args) 
	{

		// XPATH USING CONTAINS
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://amazon.com/");
	    
	    driver.findElement(By.xpath("//a[contains(@id,'AccountSubmit')]")).click();
	    
	

	}

}
