package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {

	//1. Open a browser of your choice say Mozilla Firefox using Gecko Driver
	//2. Navigate to Gmail (https://www.gmail.com)
	//	3. Login to your Gmail with correct credentials.
	//4. Verify that by default “Primary” section is selected.
	//5. If not click on the Primary tab.
	//6. Get the count of the total number of emails in the Primary tab.
	//7. Get the name of the sender and subject of Nth Email of your inbox.
	//8. Write a method to get the name of the sender and subject of email of your inbox.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.gmail.com");

		driver.findElement(By.name("username")).sendKeys("tusharbedkute07@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Tushar-21");
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
