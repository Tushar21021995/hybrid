package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage
{
	//intitilization

	public OrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	//declaration

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorganisation;
	
	
	// utilization, getter methods
	public WebElement getCreateorganisation() 
	{
		return createorganisation;
	}
	
	// buisness logics
	/**
	 * @param createorganisation
	 * @author Tushar
	 */
	
	public void creatorganisation()
	{
		createorganisation.click();
	}
	
}
