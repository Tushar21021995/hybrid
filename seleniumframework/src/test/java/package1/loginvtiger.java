package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginvtiger {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
		Properties prob = new Properties();
		prob.load(fis);
		
		String Url = prob.getProperty("url");
		String UserName = prob.getProperty("un");
		String Password = prob.getProperty("pw");
		
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();
	
		

	}

}
