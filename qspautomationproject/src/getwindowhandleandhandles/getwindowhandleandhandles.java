package getwindowhandleandhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandleandhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		// get window handle
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		//getwindow handles
		
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			System.out.println(wh);
		}
		
		
	}

}
