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
import org.openqa.selenium.Alert;
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
import com.crm.ObjectRepository.CampaignproductandDeleteValidPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

public class CreateCampaignWithProductAndDeleteProduct extends BaseClass
{

	@Test(groups= {"smokeTest", "regressionTest"})
	//public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	public void createcampaignwithproductanddelete() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		//FileUtility plib = new FileUtility();
		JavaUtility jlib = new JavaUtility();
		WebDriverUtility wlib = new WebDriverUtility();
		ExcelUtility elib = new ExcelUtility();

		//String Url = plib.getPropertyKeyValue("url");
		//String UserName = plib.getPropertyKeyValue("un");
		//String Password = plib.getPropertyKeyValue("pw");


		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		wlib.waitForPageLoad(driver);

		//driver.get(Url);
		Thread.sleep(2000);
		// using pom class

		//LoginPage loginpage = new LoginPage(driver);
		//loginpage.login(UserName, Password);

		//driver.findElement(By.name("user_name")).sendKeys(UserName);
		//driver.findElement(By.name("user_password")).sendKeys(Password);
		//driver.findElement(By.id("submitButton")).click();

		Thread.sleep(2000);

		//WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
		HomePage homepage = new HomePage(driver);
		homepage.Morebutton(driver);

		//mouseOverOnElement(driver, element);

		//driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		homepage.Campaignpage();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		CampaignPage campaignpage = new CampaignPage(driver);
		campaignpage.createcampaign();

		int random = jlib.getRandomNum();

		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet2", 3, 1)+random;


		System.out.println(value);

		//driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(value);
		CampaignInformation campaigninformation = new CampaignInformation(driver);
		campaigninformation.Campaignname1(value);

		String pw = driver.getWindowHandle();
		//driver.findElement(By.xpath("//img[@alt='Select']")).click();
		campaigninformation.selectbutton();
		wlib.switchToWindow(driver);

		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("amritsar873");
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//input[@name='search']")).click();
		CampaignProductSearch productsearch = new CampaignProductSearch(driver);
		productsearch.searchbutton();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//a[text()='amritsar873']")).click();
		productsearch.searchedproduct();
		Thread.sleep(2000);

		driver.switchTo().window(pw);

		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).cl96ick();
		CampaignInformation campaignoformation = new CampaignInformation(driver);
		campaignoformation.savebuttonp();
		
		CampaignproductandDeleteValidPage campdeleteinformation = new CampaignproductandDeleteValidPage(driver);
		String deletepage = campdeleteinformation.validpagecampaignwithproductdelete();
		Assert.assertEquals(deletepage.contains(value), true);

		//String value2 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		//if(value2.contains(value))
		//{
		//	System.out.println("pass");
		//}

		//else
		//{
		//	System.out.println("fail");
		//}

		driver.findElement(By.xpath("//input[@name='Delete']")).click();
		wlib.switchToAlertAndAccept(driver);

		WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//wlib.mouseOverOnElement(driver, element1);
		homepage.Adminbutton(driver);

		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		homepage.home();

		driver.close();	

	}

}
