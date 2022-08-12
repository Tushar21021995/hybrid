package com.crm.GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.crm.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass
{
	public WebDriver driver=null;
	//public static WebDriver sDriver;

	FileUtility plib = new FileUtility();
	
	@BeforeSuite(groups= {"smokeTest", "regressionTest"})
	public void BS()
	{
		System.out.println("databas connection");
	}
	
	@BeforeTest(groups= {"smokeTest", "regressionTest"})
	public void BT()
	{
		System.out.println("Execute script in Parallel mode");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest", "regressionTest"})
	public void BC() throws Throwable
	{
		
		String BROWSER = plib.getPropertyKeyValue("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();	
		}
		
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
		else
		{
			 driver = new ChromeDriver();
		}
		
		//driver= sDriver;
		System.out.println("Launching the browser");
		
		
	}
	
	@BeforeMethod(groups= {"smokeTest", "regressionTest"})
	public void BM() throws Throwable
	{
		String Url = plib.getPropertyKeyValue("url");
		String Username = plib.getPropertyKeyValue("un");
		String Password = plib.getPropertyKeyValue("pw");
		driver.get(Url);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(Username, Password);
		
		System.out.println("Login to Application");
	}
	
	@AfterMethod(groups= {"smokeTest", "regressionTest"})
	public void AM()
	{
		System.out.println("logout from application");
	}
	
	@AfterClass(groups= {"smokeTest", "regressionTest"})
	public void AC()
	{
		System.out.println("Closing the browser");
	}
	
	@AfterTest(groups= {"smokeTest", "regressionTest"})
	public void AT()
	{
		System.out.println("Parallel execution is done");
	}
	
	@AfterSuite(groups= {"smokeTest", "regressionTest"})
	public void AS()
	{
		System.out.println("Data base connection is close");
	}
	
}
