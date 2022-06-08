package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getwrappedelement {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/Tushar/Desktop/HTML/singleselectdropdown.html");
WebElement dropdownElement = driver.findElement(By.id("menu"));


Select sel=new Select(dropdownElement);
 WebElement wrappedElement = sel.getWrappedElement();
 
 String text = wrappedElement.getText();
 System.out.println(text);

	}
	

}
