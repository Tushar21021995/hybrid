package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromebrowserInsta {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
         driver.manage().window();  //  the browser
         driver.get("https://www.instagram.com"); //launch the web application
         Thread.sleep(10000); // provid the delay time
         driver.close(); // close the browser
	}

}

