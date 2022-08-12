package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class Makemytrip {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.waitForPageLoad(driver);
		
		FileUtility plib = new FileUtility();
		String Url3 = plib.getPropertyKeyValue("url3");
		
		driver.get(Url3);
	
		//driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dest = driver.findElement(By.xpath("//input[@id='toCity']"));	
		
		src.sendKeys("Pune");
		driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
		Thread.sleep(1000);
		
		dest.sendKeys("Mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		
		// navigate to departure
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		String requiredMonth = "November";
		String requiredYear = "2022";
		String requiredDate = "14";
		
		String currentMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[1]")).getText();
		System.out.println(currentMonthYear);
		
		String curremtmonth = currentMonthYear.split(" ")[0];
		String curremtYear = currentMonthYear.split(" ")[1];
		while(!(curremtmonth.equalsIgnoreCase(requiredMonth) && curremtYear.equals(requiredYear) ))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			currentMonthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[1]")).getText();
			curremtmonth = currentMonthYear.split(" ")[0];
			curremtYear = currentMonthYear.split(" ")[1];
		}
		
		driver.findElement(By.xpath("//p[text()='"+requiredDate+"']")).click();
		
		//driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		
		//driver.findElement(By.xpath("//p[text()='2']")).click();
		
		
	}

}
