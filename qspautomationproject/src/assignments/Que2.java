package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {

	// how to close all the browser without quit method?


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(4000);

		Set<String> allHandles = driver.getWindowHandles();

		for(String wh:allHandles)
		{
			driver.switchTo().window(wh).close();
		}

	}
}
