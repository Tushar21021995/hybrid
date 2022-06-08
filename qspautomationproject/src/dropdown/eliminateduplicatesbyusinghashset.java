package dropdown;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class eliminateduplicatesbyusinghashset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tushar/Desktop/HTML/singleselectdropdown.html");
		
     WebElement dropdownElement = driver.findElement(By.id("menu"));
  Select sel = new Select(dropdownElement);
     
     // get the list of element
     List<WebElement> options = sel.getOptions();
     
     // declare a set of eliminate the duplicate data
     
    HashSet<String> s = new HashSet<String>();
    
     // read the list and get the text
    
    for(int i=0;i<options.size();i++)
    {
    	WebElement ops = options.get(i);
    	String text = ops.getText();
    	s.add(text);	
    }
    
    
    // read the text
    
    for(String se:s)
    {
    	System.out.println(se);
    }
	}

}
