package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipcart {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
		
		Properties prob = new Properties();
		
		prob.load(fis);
		
		String Url = prob.getProperty("url2");
		//String UserName = prob.getProperty("un1");
		//String Password = prob.getProperty("pw1");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(Url);
		Thread.sleep(3000);
		//driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		//driver.findElement(By.name("username")).sendKeys(UserName);
		//driver.findElement(By.name("pwd")).sendKeys(Password);
		//driver.findElement(By.id("loginButton")).click();
		
		
		
		

	}

}
