package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1locator {

	public static void main(String[] args)
	{ 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://instagram.com/");
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
	    driver.findElement(By.xpath("//input[@type='password']]")).sendKeys("tushar");
	    driver.findElement(By.xpath("//button[@id='loginbutton']")).clear();
	    
		

	}

}
