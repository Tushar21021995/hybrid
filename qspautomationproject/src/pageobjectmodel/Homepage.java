package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{

	// declration
	@FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createnewtask;
	@FindBy(linkText="Settings") private WebElement setting;





	// initilization

	public Homepage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}



	// utilization

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getCreatenewtask() {
		return createnewtask;
	}
	public WebElement getSetting() {
		return setting;
	}

	// operational method
	
	public void clickLogout()
	{
		logout.click();
	}
	
	
	
	
	
	
	


}
