package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.Bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(5000);
		
		WebElement target = driver.findElement(By.xpath("//a[.='Coins ']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//span[text()='10 gram' and @class='prcs-d' and @data-p='l-gold-coins-weight-10gms,m']")).click();
		WebElement coin = driver.findElement(By.xpath("//h1[text()='10 gram 24 KT Lakshmi Gold Coin']"));
		boolean iscoin = coin.isDisplayed();
		System.out.println(iscoin);
		//span[@data-p='l-gold-coins-weight-2gms,m']
		
		
	    }
		
	}


