package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apportunitiespageinfo 
{
	//initilisation
	public Apportunitiespageinfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	
	@FindBy(name="potentialname")
	private WebElement potentialname;
	
	@FindBy(xpath="//img[@title='Select' and @align='absmiddle']")
	private WebElement selectbutton;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;

	
	// utilisation
	
	public WebElement getPotentialname() 
	{
		return potentialname;
	}

	public WebElement getSelectbutton()
	{
		return selectbutton;
	}

	public WebElement getSavebutton()
	{
		return savebutton;
	}
	
	
	// buisness logics
	/**
	 * information page of apportunity
	 * @param potentialname
	 * @param selectbutton
	 * @param savebutton
	 * @author Tushar
	 */
	
	public void apportunityname(String amritsar)
	{
		potentialname.sendKeys(amritsar);
	}
	
	public void selectbutton()
	{
		selectbutton.click();
	}
	
	public void savebuttonofapportunity()
	{
		savebutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
