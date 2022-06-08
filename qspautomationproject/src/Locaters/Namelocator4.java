   
package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?ef_id=9903c26ffb26188722c4a00f1001d824:G:s&s_kwcid=AL!739!10!76210034971535!76210045930707&semcmpid=sem_F1167BY7_Brand_adcenter");
		
		//login operation
		
		driver.findElement(By.name("text")).sendKeys("Tush22");//type username
		driver.findElement(By.name("password")).sendKeys("bedkute123");//type password
		driver.findElement(By.id("submit")).click();//click on login button
		
		
		
	}
}