package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        Thread.sleep(10000);
        driver.close();
	}

}

