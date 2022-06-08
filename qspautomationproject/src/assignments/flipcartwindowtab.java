package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartwindowtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("SamsungF12");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		Thread.sleep(1000);

		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();

		for(String wh : allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			else
			{

			}
		}

		driver.findElement(By.id("swatch-1-storage")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pincodeInputId")).clear();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();

	}

}
