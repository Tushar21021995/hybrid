package practiceofDATADRIVENFRAMEWORK;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class AmazonValidLogIn {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Thread.sleep(1000);

		Flib flib = new Flib();

		String mobile = flib.readData("./Data/AmazonTestData.xlsx", "validamazoncreds", 1, 0);

		String password = flib.readData("./Data/AmazonTestData.xlsx", "validamazoncreds", 1, 1);


		//login credential

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();


	}

}
