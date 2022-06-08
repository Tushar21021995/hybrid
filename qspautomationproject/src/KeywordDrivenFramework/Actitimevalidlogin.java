package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class Actitimevalidlogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		
		String username = flib.readPropertyFile("./Data/config.properties", "username");
		String password = flib.readPropertyFile("./Data/config.properties", "password");
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		// close 
		
		bt.closeBrowser();
		
	}

}
