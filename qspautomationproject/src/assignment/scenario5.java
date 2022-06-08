package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario5

{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.Bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(5000);

		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Diamond'][@title='Diamond Rings']")).click();


		List<WebElement> list = driver.findElements(By.xpath("//span[@class='new-price']"));

		for(int i=0;i<list.size();i++)
		{
			WebElement obj = list.get(i);
			String text = obj.getText();
			System.out.println(text);
		}

		WebElement target1 = driver.findElement(By.xpath("//span[text()=' Popular ']"));
		Thread.sleep(2000);
		act.moveToElement(target1).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();


		List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.out.println("...............................................");

		for(int i=0;i<list1.size();i++)
		{
			WebElement obj1 = list1.get(i);
			String text1 = obj1.getText();
			System.out.println(text1);
		}


		if(list.equals(list1))
		{
			System.out.println("both price are same");
		}

		else
		{
			System.out.println("price are not same");
		}

		Thread.sleep(4000);
		driver.close();


	}

}
