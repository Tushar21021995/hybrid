package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	static WebDriver driver;
	public void setUp() throws EncryptedDocumentException, IOException
	{
		Flib flib = new Flib();
		String url = flib.readPropertyFile("./Data/config.properties", "url");
		String browserValue = flib.readPropertyFile("./Data/config.properties", "browser");


		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		}


		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		}

		else
		{
			System.out.println("enter the correct choice");
		}


	}


	public void tearDown()
	{
		driver.quit();
	}





}
