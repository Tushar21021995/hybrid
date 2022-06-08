package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.className("password")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		

	}

}
