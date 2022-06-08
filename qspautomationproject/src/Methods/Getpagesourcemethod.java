package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesourcemethod 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tushar/Desktop/HTML/textbox.html");
		String sourceCodeofTheWebPage = driver.getPageSource();
		System.out.println(sourceCodeofTheWebPage);

	}

}
