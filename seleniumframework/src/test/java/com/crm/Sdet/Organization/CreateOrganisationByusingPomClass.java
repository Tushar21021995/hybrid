package com.crm.Sdet.Organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.OrganisationInformation;
import com.crm.ObjectRepository.OrganisationPage;
import com.crm.ObjectRepository.OrganisationValidationPage;

public class CreateOrganisationByusingPomClass extends BaseClass {

	
	@Test(groups= {"smokeTest", "regressionTest"})
	public void createogrganisation() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
	{
		
		driver.manage().window().maximize();
		WebDriverUtility wlib = new WebDriverUtility();

		JavaUtility jlib = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();

		wlib.waitForPageLoad(driver);
	
		Thread.sleep(2000);

		HomePage homepage = new HomePage(driver);
		homepage.Organisationpage();
		
		
		OrganisationPage orgnisationpage = new OrganisationPage(driver);
		orgnisationpage.creatorganisation();
		
		int random = jlib.getRandomNum();
		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet1", 1, 1)+random;
		
		System.out.println(value);

		OrganisationInformation orginformation = new OrganisationInformation(driver);
		orginformation.orgtextfield(value);
		orginformation.create();
		
		OrganisationValidationPage validorginformation = new OrganisationValidationPage(driver);
		String validpage = validorginformation.validpageorg();
		Assert.assertEquals(validpage.contains(value), false);
		//String value2 = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		Thread.sleep(2000);

		//if(value2.contains(value))
		//{
		//	System.out.println("pass");
		//}
		//else
		//{
		//	System.out.println("fail");
		//}

		WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		WebDriverUtility wlib3 = new WebDriverUtility();
		wlib3.mouseOverOnElement(driver, element1);

		homepage.home();

	}

}
