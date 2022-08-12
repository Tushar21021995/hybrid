package package1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.ApportunitesPage;
import com.crm.ObjectRepository.Apportunitiespageinfo;
import com.crm.ObjectRepository.Apportunitiessearchpage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

public class CreateApportunitiesWithOrg extends BaseClass
{
	@Test
	public void createApportunities() throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		JavaUtility jlib = new JavaUtility();
		WebDriverUtility wlib = new WebDriverUtility();
		ExcelUtility elib = new ExcelUtility();

		driver.manage().window().maximize();
		wlib.waitForPageLoad(driver);
		Thread.sleep(2000);

		HomePage homepage = new HomePage(driver);
		homepage.Apportunitiespage();

		ApportunitesPage apppage = new ApportunitesPage(driver);
		apppage.createapportunities();
		
		int random = jlib.getRandomNum();
		
		String value = elib.ReadExcelData("/data/ReadData.xlsx", "Sheet2", 3, 1)+random;
		System.out.println(value);
		
		
		Apportunitiespageinfo apportunityinformation = new Apportunitiespageinfo(driver);
		apportunityinformation.apportunityname(value);
		
		String pw = driver.getWindowHandle();
		apportunityinformation.selectbutton();
		wlib.switchToWindow(driver);
		
		driver.findElement(By.name("search_text")).sendKeys("TestYantra7");
		Thread.sleep(1000);
		
		Apportunitiessearchpage searchedinformation = new Apportunitiessearchpage(driver);
		searchedinformation.searchingbutton();
		searchedinformation.searchedbutton();
		driver.switchTo().window(pw);
		
		apportunityinformation.savebuttonofapportunity();
		
		String value2 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		if(value2.contains(value))
		{
			System.out.println("pass");
		}

		else
		{
			System.out.println("fail");
		}
		WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		homepage.Adminbutton(driver);
		
		homepage.home();

		driver.close();	
		

	}

}
