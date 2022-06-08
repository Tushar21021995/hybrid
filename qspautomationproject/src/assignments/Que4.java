package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {

	// how to close only child browser ?? 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(4000);


		String parentHandle = driver.getWindowHandle();
		Set<String> allHandle = driver.getWindowHandles();

		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close(); 
			}
			else
			{

			}
		}

	}

}
