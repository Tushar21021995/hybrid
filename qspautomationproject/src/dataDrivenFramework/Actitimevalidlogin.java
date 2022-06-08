package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimevalidlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-fv1112lb/login.do");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Thread.sleep(4000);

		FileInputStream fis = new FileInputStream("./Data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("validcreds");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(1); 
		String username = cell.getStringCellValue();  


		FileInputStream fis2 = new FileInputStream("./Data/ActitimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sh2 = wb2.getSheet("validcreds");
		Row row2 = sh2.getRow(1);
		Cell cell2 = row2.getCell(1); 
		String password = cell2.getStringCellValue();  

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
	}


