package BrowserPositionandSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setthepositionofbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// set position of the browser
		Point targetPosition=new Point(100,250);
		driver.manage().window().setPosition(targetPosition);
		
	}

}
