package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignProductSearch
{
	// initilisation
	public CampaignProductSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// declaration
	@FindBy(name="search_text")
	private WebElement searchtextbox;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement searchedproduct;

	
	
	// getter method
	
	public WebElement getSearchtextbox()
	{
		return searchtextbox;
	}

	public WebElement getSearchbutton()
	{
		return searchbutton;
	}

	public WebElement getSearchedproduct()
	{
		return searchedproduct;
	}
	
	
	// buisness logics
	/**
	 * @param searchtexbos
	 * @param searchbutton
	 * @param searchedproduuct
	 * @author Tushar
	 */
	
	public void clickedonsearchedproduct(String ok)
	{
		searchtextbox.sendKeys(ok);
		
	}
	
	public void searchbutton()
	{
		searchbutton.click();
	}
	
	public void searchedproduct()
	{
		searchedproduct.click();	
	}
	
	


}
