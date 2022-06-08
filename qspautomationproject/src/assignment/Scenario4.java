package assignment;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String obj = sc.nextLine();
		if(obj.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("apple watches");
			driver.findElement(By.xpath("//option[.='Jewelry & Watches']")).click();
			driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
			String text = driver.findElement(By.xpath("(//h3[@class='s-item__title'])[11]/ancestor::div[@class='s-item__info clearfix']/descendant::span[@class='s-item__price']")).getText();
			System.out.println(text);
			List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
			
			
			for (int i=0;i<elements.size();i++)
			{
				WebElement list = elements.get(i);
				String getlist = list.getText();
				System.out.println(getlist);
				Point loc = list.getLocation();
				int xaxis = loc.getX();
				int yaxis = loc.getY();
				JavascriptExecutor je=(JavascriptExecutor)driver;
				Thread.sleep(3000);
				je.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
						
				
			}
			
			
		}
		else
		{
			System.out.println("invalid name is entered 1");
		}
		
		if(obj.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		
		
		
		

	}

}