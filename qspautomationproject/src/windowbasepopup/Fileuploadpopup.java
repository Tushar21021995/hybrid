package windowbasepopup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://laptop-fv1112lb/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.linkText("Settings")).click();
		 driver.findElement(By.partialLinkText("Logo")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("uploadNewLogoOption")).click();
		 Thread.sleep(1000);
		 
		 
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		
		Runtime.getRuntime().exec("C:/Users/Tushar/Desktop/fu2.exe");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:/Users/Tushar/Desktop/fu2.exe");
		
		 
		
	
	}

}
