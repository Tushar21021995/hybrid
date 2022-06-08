package pageobjectmodel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	// decleration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInLabel") private WebElement keepmeloggedin;
	@FindBy(xpath=" //img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licence;
	
	//initialization	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//utilization

	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepmeloggedin() {
		return keepmeloggedin;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicence() {
		return licence;
	}
	


	
	//generic reusable method
	
	public void actitimevalidLogin(String validUsername, String validPassword)
	
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}
	
	public void actitimeInvalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
		
		
	}

	
	
	
	// operational method
	
	

}
