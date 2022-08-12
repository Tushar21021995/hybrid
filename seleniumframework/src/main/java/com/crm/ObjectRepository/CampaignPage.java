package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage
{
	
	// initilization
	public CampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// declaration
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createcampaign;


	
	// utilization , gettermethod
	public WebElement getCreatecampaign() 
	{
		return createcampaign;
	}
	
	
	// buisness logics
	/**
	 * @param createcampaign
	 * @author Tushar
	 */
	
	public void createcampaign()
	{
		createcampaign.click();
		
	}
	
	
}
