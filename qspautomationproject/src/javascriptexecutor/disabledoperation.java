package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class disabledoperation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		RemoteWebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Tushar/Desktop/HTML/disabledtextbox.html");



		WebElement user = driver.findElement(By.id("i1"));
				WebElement pass = driver.findElement(By.id("i2"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		if(user.isEnabled())
		{
			user.sendKeys("tushar");
		}
		else
		{
			jse.executeScript("document.getElementById(\"i1\").value='tushar'");
		}

		if(pass.isEnabled())
		{
			pass.sendKeys("tushar123");
		}
		else
		{
			jse.executeScript("document.getElementById(\"i2\").value='tushar123'");
		}


	}

}


