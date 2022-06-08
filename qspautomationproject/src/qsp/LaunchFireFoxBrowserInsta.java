package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowserInsta {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");// TODO Auto-generated method stub
        FirefoxDriver driver =new FirefoxDriver();
        driver.manage().window();      
        driver.get("https://www.facebook.com");
        Thread.sleep(10000);
        driver.close();
        
           
	}

}

