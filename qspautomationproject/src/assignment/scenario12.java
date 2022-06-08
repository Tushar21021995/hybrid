package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.Bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Offers ']")).click();
		WebElement target = driver.findElement(By.xpath("//section[@id='Offers-form']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[text()=' 20% Making Charge Off ']")).click();
	    List<WebElement> list = driver.findElements(By.xpath("//span[text()=' 20% off on making charge ']"));
	    
	    for(int i=0;i<list.size();i++)
	    {
	    	WebElement obj = list.get(i);
	    	boolean obj2 = obj.isDisplayed();
	    	System.out.println(obj2);
	    }
		
	}

}
