package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apportunitiessearchpage
{
	// initilisation
	public Apportunitiessearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	// declaration
	@FindBy(name="search_text")
	private WebElement searchtextfield;
	
	@FindBy(name="search")
	private WebElement searchingbutton;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement searchedbutton;

	
	//utilization

	public WebElement getSearchtextfield()
	{
		return searchtextfield;
	}

	public WebElement getSearchingbutton() 
	{
		return searchingbutton;
	}

	public WebElement getSearchedbutton() 
	{
		return searchedbutton;
	}
	
	
	//buisnes logics
	/**
	 * searched organisation information
	 * @param searchtesxtfield
	 * @param searchingbutton
	 * @param searchedbutton
	 * @author Tushar
	 */
	
	public void searchtextfield(String TestYantra7)
	{
		searchtextfield.sendKeys(TestYantra7);
	}
	
	public void searchingbutton()
	{
		searchingbutton.click();
	}
	
	public void searchedbutton()
	{
		 searchedbutton.click();
		
	}
	
	
	
	
	
	
}
