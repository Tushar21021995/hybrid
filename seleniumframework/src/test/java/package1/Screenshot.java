package package1;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.LoginPage;

public class Screenshot {

	public static void main(String[] args) 
	{
		WebDriverUtility wlib = new WebDriverUtility();
		FileUtility plib = new FileUtility();

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		wlib.waitForPageLoad(driver);
		LoginPage loginpage = new LoginPage(driver);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshots/screenshots.png");
	
	}
	

}
