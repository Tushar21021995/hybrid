package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApportunitesPage 
{
	// initilization
	public ApportunitesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// declaration
	
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement createopportunity;


	// utilization

	public WebElement getCreateopportunity()
	{
		return createopportunity;
	}
	
	// buisness logics
	
	/**
	 * used for create apportunities
	 * @param opportunitiespage
	 * @author Tushar
	 */
	
	public void createapportunities()
	{
		createopportunity.click();
	}
	
	

}
