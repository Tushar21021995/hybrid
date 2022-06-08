package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case2forfacebooklocator {

	public static void main(String[] args)
	{

		// XPATH USING TEST() FUNCTION

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");

		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		// driver.findElement(By.xpath("//input[@type='password']]")).sendKeys("tushar");

		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();


	}

}
