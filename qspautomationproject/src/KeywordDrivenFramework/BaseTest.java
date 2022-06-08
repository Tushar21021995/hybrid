
package KeywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;
	//method to open the browsers
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		//read the data from property file (browser)12334
		String browserValue = flib.readPropertyFile("./Data/config.properties","browser");
		
		//read the data from property file (url)
		String url = flib.readPropertyFile("./Data/config.properties", "url");
		
		//use the value of browser
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://laptop-fv1112lb/login.do");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://laptop-fv1112lb/login.do");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		}

		else
		{
			System.out.println("enter the correct choice");
		}


	}

	//method to close the browsers
	public void closeBrowser()
	{
		driver.quit();
	}

}


