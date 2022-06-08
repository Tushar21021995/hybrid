package screenshotofwebpage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot1 {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		// way 1
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./screenshots/selenium.png");
		Files.copy(src, dest);
		

	}

}
