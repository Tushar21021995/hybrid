package com.crm.ObjectRepository;

import java.security.PrivateKey;
import java.util.function.Predicate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	// initilization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//decleartiom
	
	@FindBy(name="user_name") 
	private WebElement usernametext;
	
	@FindBy(name="user_password")
	private WebElement passwordtext;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;

	

	
	// utilization, getter method
	
	public WebElement getUsernametext()
	{
		return usernametext;
	}

	public WebElement getPasswordtext()
	{
		return passwordtext;
	}

	public WebElement getSubmitbutton() 
	{
		return submitbutton;
	}
	
	
	
	// buisness logics
	/**
	 * used for login application
	 * @param username
	 * @param password
	 * @author Tushar
	 */
	
	public void login(String Username,String Password)
	{
		usernametext.sendKeys(Username);
		passwordtext.sendKeys(Password);
		submitbutton.click();
		
		
	}
	

	

}
