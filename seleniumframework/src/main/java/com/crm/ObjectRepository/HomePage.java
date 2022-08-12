package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	// initilization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// declaration

	@FindBy(linkText="Organizations")
	private WebElement organisationpage;

	@FindBy(linkText="Products")
	private WebElement productpage;

	@FindBy(xpath="//a[text()='More']")
	private WebElement moredropdown;


	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaignpage;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunitiespage;


	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminbutton;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;





	//utilization, getter methods

	public WebElement getOrganisationpage()
	{
		return organisationpage;
	}

	public WebElement getProductpage() 
	{
		return productpage;
	}

	public WebElement getMoredropdown() 
	{
		return moredropdown;
	}

	public WebElement getCampaignpage() 
	{
		return campaignpage;
	}
	public WebElement getOpportunitiespage()
	{
		return opportunitiespage;
	}

	public WebElement getAdminbutton()
	{
		return adminbutton;
	}

	public WebElement getSignout()
	{
		return signout;
	}


	// buisness logics

	/**
	 *  used for homepage app
	 *  @param organization
	 *  @param product
	 *  @param more
	 *  @param campaign
	 *  @param adminstaor
	 *  @param signout
	 *  @author Tushar
	 * 
	 */

	public void home()
	{
		
		signout.click();

	}

	public void Productpage()
	{
		productpage.click();

	}
	
	public void Organisationpage()
	{
		organisationpage.click();
	}
	
	public void Morebutton(WebDriver driver)
	{
	
		Actions act = new Actions(driver);
		act.moveToElement(moredropdown).perform();
		
	}

	public void Campaignpage()
	{
		campaignpage.click();
	}

	public void Adminbutton(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(adminbutton).perform();
		
	}
	public void Apportunitiespage()
	{
		opportunitiespage.click();
	}









}
