package com.crm.Sdet.Campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
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
import com.crm.ObjectRepository.CampaignValidationPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

public class CreateCampaignTest extends BaseClass
{

	@Test(groups= {"smokeTest", "regressionTest"})
	//public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	public void createcampaign() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
		//Properties prob = new Properties();
		//prob.load(fis);
		//FileUtility plib = new FileUtility();
		JavaUtility jlib = new JavaUtility();
		WebDriverUtility wlib = new WebDriverUtility();
		ExcelUtility elib = new ExcelUtility();

		//String Url = plib.getPropertyKeyValue("url");
		//String Username = plib.getPropertyKeyValue("un");
		//String Password = plib.getPropertyKeyValue("pw");


		//String Url = prob.getProperty("url");
		//String UserName = prob.getProperty("un");
		//String Password = prob.getProperty("pw");

		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		wlib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.get(Url);
		Thread.sleep(2000);
		LoginPage loginpage = new LoginPage(driver);
		//loginpage.login(Username, Password);
		//driver.findElement(By.name("user_name")).sendKeys(UserName);
		//driver.findElement(By.name("user_password")).sendKeys(Password);
		//driver.findElement(By.id("submitButton")).click();


		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
		wlib.mouseOverOnElement(driver, element);
		
		//Actions act = new Actions(driver);
		//act.moveToElement(element).perform();
		HomePage homepage = new HomePage(driver);
		homepage.Campaignpage();


		//driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		CampaignPage campiagnpage = new CampaignPage(driver);
		campiagnpage.createcampaign();

		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		int random = jlib.getRandomNum();

		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet1", 2, 1)+random;
		//FileInputStream fis1 = new FileInputStream("./data/ReadData.xlsx");
		//Workbook wb = WorkbookFactory.create(fis1);
		//Sheet sh = wb.getSheet("Sheet1");
		//Row row = sh.getRow(2);
		//Cell cell = row.getCell(1);
		//Random r = new Random();
		//int random = r.nextInt(1000);



		//String value = cell.getStringCellValue()+random;

		System.out.println(value);
		CampaignInformation campinfo = new CampaignInformation(driver);
		campinfo.Campaignname1(value);

		//driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(value);


		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		campinfo.savebuttonofcampaign();
		CampaignValidationPage validcampinformation = new CampaignValidationPage(driver);
		String validpage = validcampinformation.validpagecampaign();
		Assert.assertEquals(validpage.contains(value), true);
		//String value2 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();


		//if(value2.contains(value))
		//{
		//	System.out.println("pass");
		//}

		//else
		//{
		//	System.out.println("fail");

		//}
		WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(2000);
		wlib.mouseOverOnElement(driver, element1);
		// Actions act1 = new Actions(driver);
		//act.moveToElement(element1).perform();
		homepage.home();
		//driver.findElement(By.xpath("//a[text()='Sign Out']"));
		Thread.sleep(2000);
		driver.close();



	}

}
