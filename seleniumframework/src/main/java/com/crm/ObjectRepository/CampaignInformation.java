package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformation 
{
	// initilisation
	public CampaignInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration
	
	@FindBy(name="campaignname")
	private WebElement campaignname;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectbutton;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;

	
	// utilization, gettermethod
	
	public WebElement getCampaignname() 
	{
		return campaignname;
	}

	public WebElement getSelectbutton()
	{
		return selectbutton;
	}

	public WebElement getSavebutton()
	{
		return savebutton;
	}
	
	
	// buisnesslogics
	/**
	 * @param campaignname
	 * @param selectbutton
	 * @param savebutton
	 * @author Tushar
	 */

	public void savebuttonofcampaign()
	{
		//selectbutton.click();
		savebutton.click();		
	}

	public void Campaignname1(String amritsar)
	{
		campaignname.sendKeys(amritsar);
	}

	
	
	public void selectbutton()
	{
		selectbutton.click();
		
	}
    
	
	public void savebuttonp()
	{
		savebutton.click();
		
	}
}
