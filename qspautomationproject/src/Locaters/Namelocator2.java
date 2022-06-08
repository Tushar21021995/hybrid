   
package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://actitime.summant.com/login.jsp");
		
		//login operation
		
		driver.findElement(By.name("username")).sendKeys("Admin");//type username
		driver.findElement(By.name("password")).sendKeys("Admin");//type password
		driver.findElement(By.id("btnLogin")).click();//click on login button
		
		
		
	}
}