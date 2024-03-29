package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class seleniumdevass1 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(5000);
		
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_C);
		 robot.keyRelease(KeyEvent.VK_C);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder']"));
		 
		 Thread.sleep(40000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 
		
		
		
		
		

	}

}
