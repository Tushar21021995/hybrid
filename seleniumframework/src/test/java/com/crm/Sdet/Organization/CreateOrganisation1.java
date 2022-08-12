package com.crm.Sdet.Organization;

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
import org.testng.annotations.Test;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;

public class CreateOrganisation1 
{

	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 

	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
		//Properties prob = new Properties();
		//prob.load(fis);

		FileUtility plib = new FileUtility();

		JavaUtility jlib = new JavaUtility();

		ExcelUtility elib = new ExcelUtility();

		String Url = plib.getPropertyKeyValue("url");
		String UserName = plib.getPropertyKeyValue("un");
		String Password = plib.getPropertyKeyValue("pw");


		//String Url = prob.getProperty("url");
		//	String UserName = prob.getProperty("un");
		//	String Password = prob.getProperty("pw");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(Url);
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();


		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet1", 1, 1);


		//FileInputStream fis1 = new  FileInputStream("./data/ReadData.xlsx");
		//Workbook wb = WorkbookFactory.create(fis1);
		//Sheet sh = wb.getSheet("Sheet1");
		//Row row = sh.getRow(1);
		//Cell cell = row.getCell(1);

		//Random r = new Random();
		//int random = r.nextInt(1000);


		int random = jlib.getRandomNum();

		//String value = cell.getStringCellValue()+random;
		System.out.println(value);

		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();



		String value2 = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		Thread.sleep(2000);

		if(value2.contains(value))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign Out']"));
		Thread.sleep(2000);
		driver.close();



	}


}
