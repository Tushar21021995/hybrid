package webelementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// login operation


		WebElement untextbox = driver.findElement(By.name("txtUsername"));
		WebElement passtextbox = driver.findElement(By.name("txtPassword"));

		untextbox.sendKeys("Tushar");
		passtextbox.sendKeys("Tushar-21");
        Thread.sleep(4000);
        
        untextbox.clear();
        passtextbox.clear();
        

	}

}
