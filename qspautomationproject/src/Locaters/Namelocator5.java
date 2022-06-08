
   
package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pantydeal.com/account/login");
		
		//login operation
		
		driver.findElement(By.name("text")).sendKeys("Admin");//type username
		driver.findElement(By.name("password")).sendKeys("admin123");//type password
		driver.findElement(By.id("submit")).click();//click on login button
		
		
		
	}
}