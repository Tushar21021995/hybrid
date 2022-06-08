package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tushar/Desktop/HTML/singleselectdropdown.html");
		WebElement dropdownElement = driver.findElement(By.id("menu"));

		Select sel = new Select(dropdownElement);

		for (int i=0;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		List<WebElement> allops = sel.getAllSelectedOptions();

		for(WebElement we:allops)
		{
			String ops = we.getText();
			System.out.println(ops);
		}

	}


}
