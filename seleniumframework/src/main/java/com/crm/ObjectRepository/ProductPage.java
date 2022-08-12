package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage
{
	// initlization
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	// declaration
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createorganisation;


	// utilization, getter method

	public WebElement getCreateorganisation() 
	{
		return createorganisation;
	}
	
	// buisness logics
	/**
	 * @param createorganisation
	 * @author Tushar
	 */
	
	public void createproduct()
	{
		createorganisation.click();
	}
	

}
