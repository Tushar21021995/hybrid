package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1forinstalocator {

	public static void main(String[] args)
	{
		// XPATH USING UNIQUE ATTRIBUTE

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tushar");
		//  driver.findElement(By.xpath("")).clear();


	}

}
