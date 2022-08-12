package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformation
{
	//initilisation
	
	public ProductInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// declaration
	
	@FindBy(name="productname")
	private WebElement productname;

	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebuttonofproduct;

	
	// utilisation, getter method
	

	public WebElement getProductname()
	{
		return productname;
	}


	public WebElement getSavebuttonofproduct()
	{
		return savebuttonofproduct;
	}
	
	
	// business logics
	/**
	 * @param productname
	 * @param savebuttonofproduct
	 * @author Tushar
	 */
	
	public void createproduct(String amritsar)
	{
		productname.sendKeys(amritsar);
		
		
	}
	public void Savebutton()
	{
		savebuttonofproduct.click();
	}
	
	
	
	
	
	
	
	
	
	
}
