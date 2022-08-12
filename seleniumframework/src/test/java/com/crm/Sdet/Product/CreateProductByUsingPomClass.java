package com.crm.Sdet.Product;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ProductInformation;
import com.crm.ObjectRepository.ProductPage;
import com.crm.ObjectRepository.ProductValidation;
//@Listeners(com.crm.GenericUtility.ListnerImplementationClass.class)
public class CreateProductByUsingPomClass extends BaseClass
{

	@Test(groups= {"smokeTest", "regressionTest"})
	//public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	public void createproduct() throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//BaseClass baseclass = new BaseClass();
		driver.manage().window().maximize();

		WebDriverUtility wlib = new WebDriverUtility();
		//FileUtility plib = new FileUtility();
		JavaUtility jlib = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();

		wlib.waitForPageLoad(driver);
		//String Url = plib.getPropertyKeyValue("url");
		//String Username = plib.getPropertyKeyValue("un");
		//String Password = plib.getPropertyKeyValue("pw");

		//driver.get(Url);
		//Thread.sleep(2000);

		// by using pom class
		//LoginPage loginpage = new LoginPage(driver);
		//loginpage.login(Username, Password);


		HomePage homepage = new HomePage(driver);
		homepage.Productpage();

		ProductPage productpage = new ProductPage(driver);
		//Assert.assertEquals(true, false);
		productpage.createproduct();



		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet1", 1, 1);
		int random = jlib.getRandomNum();
		System.out.println(value);

		ProductInformation productinformation = new ProductInformation(driver);
		productinformation.createproduct(value);
		productinformation.Savebutton();

		ProductValidation validinformation = new ProductValidation(driver);
		String page = validinformation.validpage();
		//Assert.assertEquals(page.contains(value), true);

		//	String value2 = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		Thread.sleep(2000);

		//if(value2.contains(value))
		//{
		//System.out.println("pass");
		//}
		//else
		//{
		//System.out.println("fail");
		//}

		WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		WebDriverUtility wlib3 = new WebDriverUtility();
		wlib3.mouseOverOnElement(driver, element1);


		homepage.home();



	}

}
