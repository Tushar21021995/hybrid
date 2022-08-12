package com.crm.Sdet.Campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.CampaignInformation;
import com.crm.ObjectRepository.CampaignPage;
import com.crm.ObjectRepository.CampaignProductSearch;
import com.crm.ObjectRepository.CampaignwithproductValidPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ProductInformation;

public class CreateCampaignWithProduct extends BaseClass
{

	@Test(groups= {"smokeTest", "regressionTest"})
	//public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
	public void createcampaignwithproduct() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		//FileUtility plib = new FileUtility();

		JavaUtility jlib = new JavaUtility();

		ExcelUtility elib = new ExcelUtility();



		//String Url = plib.getPropertyKeyValue("url");
		//String UserName = plib.getPropertyKeyValue("un");
		//String Password = plib.getPropertyKeyValue("pw");

		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverUtility wlib1 = new WebDriverUtility();
		wlib1.waitForPageLoad(driver);

		//driver.get(Url);
		Thread.sleep(2000);
		//LoginPage loginpage = new LoginPage(driver);
		//loginpage.login(UserName, Password);
		//driver.findElement(By.name("user_name")).sendKeys(UserName);
		//driver.findElement(By.name("user_password")).sendKeys(Password);
		//driver.findElement(By.id("submitButton")).click();

		int random = jlib.getRandomNum();

		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet2", 3, 1)+random;
		System.out.println(value);
		Thread.sleep(2000);
		HomePage homepage = new HomePage(driver);
		homepage.Morebutton(driver);

		//WebElement element = driver.findElement(By.xpath("//a[.='More']"));

		WebDriverUtility wlib2 = new WebDriverUtility();
		//wlib2.mouseOverOnElement(driver, element);

		homepage.Campaignpage();

		//driver.findElement(By.xpath("//a[.='Campaigns' and @id='more']")).click();

		CampaignPage camppage = new CampaignPage(driver);
		camppage.createcampaign();

		//driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();

		CampaignInformation campaigninformation = new CampaignInformation(driver);

		//driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(value);
		campaigninformation.Campaignname1(value);



		//driver.findElement(By.xpath("//img[@alt='Select']")).click();
		campaigninformation.selectbutton();


		String parentwindow = driver.getWindowHandle();
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.switchToWindow(driver);

		Thread.sleep(2000);
		CampaignProductSearch productsearch = new CampaignProductSearch(driver);


		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("amritsar752");


		//driver.findElement(By.xpath("//input[@name='search']")).click();
		productsearch.searchbutton();
		//driver.findElement(By.xpath("//a[@id='1']")).click();
		productsearch.searchedproduct();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);


		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		ProductInformation productinformation = new ProductInformation(driver);
		productinformation.Savebutton();
		CampaignwithproductValidPage withproductvalidpage = new CampaignwithproductValidPage(driver);
		String validproductinformation = withproductvalidpage.validpagecampaignwithproduct();
		Assert.assertEquals(validproductinformation.contains(value), true);

		//String value2 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		//if(value2.contains(value))
		//{
		//		System.out.println("pass");
		//	}

		//else
		//{
		//	System.out.println("fail");
		//	}


		WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		//WebDriverUtility wlib3 = new WebDriverUtility();
		//wlib3.mouseOverOnElement(driver, element1);
		homepage.Adminbutton(driver);

		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		homepage.home();

		driver.close();	


	}


}
