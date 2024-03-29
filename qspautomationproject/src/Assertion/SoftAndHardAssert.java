package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {
	WebDriver driver;
	@BeforeTest
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	}

	@BeforeMethod
	
	// 1- LANUCH THE BROWSER
	public void LaunchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");  // LAUNCH THE WEB APP BY ENTERING URL
	}
	
	@Test
	public void testCase() throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();   // USE SOFT ASSERT
		String actualLoginPageTitle = driver.getTitle();  // VERIFY LOGIN PAGE TITLE
		softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();


		WebElement dashBoard = driver.findElement(By.xpath("//b[text()='Dashboard']"));
		boolean statusOfDashBoard = dashBoard.isDisplayed();
		Assert.assertEquals(statusOfDashBoard, true);  // USE HARD ASSERT
		Thread.sleep(4000);


		String actualHomePageTitle = driver.getTitle();
		softAssert.assertEquals(actualHomePageTitle, "OrangeHRMHomePage");
		Reporter.log("create user",true);
		Reporter.log("create contact",true);

		softAssert.assertAll();












	}
}
