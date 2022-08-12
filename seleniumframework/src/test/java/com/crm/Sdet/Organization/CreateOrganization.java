package com.crm.Sdet.Organization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganization {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();


		driver.findElement(By.linkText("Organizations")).click();

		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TestYantra12");

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		String value = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).getText();
		Thread.sleep(3000);
		String value2 = "TestYantra12";

		if(value2.contains(value))
		{
			System.out.println("pass");
		}

		else
		{
			System.out.println("fail");
		}

		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		driver.close();
		


	}

}
