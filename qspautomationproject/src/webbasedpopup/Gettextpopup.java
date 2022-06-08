package webbasedpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Tushar/Desktop/HTML/alert.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		//al.accept(); if u print here only program execute bt not print stmnt.
		
		
		String text = al.getText();
		System.out.println(text);
		al.accept();    // if you put this line here then in op bar printing stmnt will show.



	}

}
