package package1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class CreateContactWithOrganisation 
{
	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		JavaUtility jlib = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();
		FileUtility plib = new FileUtility();
		WebDriverUtility wlib = new WebDriverUtility();

		wlib.waitForPageLoad(driver);
		String Url = plib.getPropertyKeyValue("url");
		String UserName = plib.getPropertyKeyValue("un");
		String Password = plib.getPropertyKeyValue("pw");

		driver.get(Url);
		Thread.sleep(2000);

		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();

		// click on contact button

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// click on create(+) contact

		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();


		// send the value in first name textfield

		String value = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet3", 0, 1);

		int random = jlib.getRandomNum();
		System.out.println(value);

		driver.findElement(By.name("lastname")).sendKeys(value);

		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		wlib.switchToWindow(driver);

		String value3 = elib.ReadExcelData("./data/ReadData.xlsx", "Sheet3", 2, 1);
		driver.findElement(By.name("search_text")).sendKeys(value3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='1']")).click();
		Thread.sleep(1000);
		driver.switchTo().window(parentwindow);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		String value2 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		if(value2.contains(value))
		{
			System.out.println("pass");
		}

		else
		{
			System.out.println("fail");
		}


		driver.findElement(By.xpath("//input[@name='Delete' and @title='Delete [Alt+D]']")).click();
		wlib.switchToAlertAndDismiss(driver);


		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wlib.mouseOverOnElement(driver, element);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		driver.close();



	}

}
