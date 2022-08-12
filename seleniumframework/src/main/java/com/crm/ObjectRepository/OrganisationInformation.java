package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInformation
{
	// initilization
	
	public OrganisationInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//Declaration
	@FindBy(name="accountname")
	private WebElement accountnametextfield;

	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;

	// utilization, getteemethods
	

	public WebElement getAccountnametextfield()
	{
		return accountnametextfield;
	}


	public WebElement getSavebutton()
	{
		return savebutton;
	}
	
	
	// buisness logics
	/**
	 * @param accountnametextfield
	 * @param savebutton
	 * @author Tushar
	 */
	
	
	public void create()
	{
		
		savebutton.click();
	}
	
	public void orgtextfield(String amritsar)
	{
		accountnametextfield.sendKeys(amritsar);
	}
	
	
}
