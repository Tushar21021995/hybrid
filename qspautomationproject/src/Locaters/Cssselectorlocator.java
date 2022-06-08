package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectorlocator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://instagram.com");
	    
	    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
	    driver.findElement(By.cssSelector("input[name=''password]")).sendKeys("manager");
	    driver.findElement(By.cssSelector("input[type=''submit]")).click();
	    
	    
	    		
	    		

	}

}
