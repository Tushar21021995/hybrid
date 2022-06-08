package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 
		 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");//type username
		 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");//type password
		 driver.findElement(By.xpath("//input[@type='submit']")).click();//click on login button
			

	}

}
