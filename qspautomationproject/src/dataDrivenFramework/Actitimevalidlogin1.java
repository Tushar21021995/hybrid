package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimevalidlogin1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-fv1112lb/login.do");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Thread.sleep(4000);
		
		// Accessing the generic NSM by creating object.
		Flib flib = new Flib();

		// read the username
     	String username = flib.readData("./Data/ActitimeTestData.xlsx", "validcreds", 1, 0);
     	
		// read the password
		String password = flib.readData("./Data/ActitimeTestData.xlsx", "validcreds", 1, 1);


		//login operation
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();


	}

}
