package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignwithproductValidPage 
{


	//initilization
			public CampaignwithproductValidPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//declaration
			@FindBy(xpath="//span[@class='dvHeaderText']")
			private WebElement validationtext;

			
			// utilisation
			
			public WebElement getValidation() 
			{
				return validationtext;
			}
			
			// buisness logics
			/**
			 * @param validation
			 * @author Tushar
			 */
			
			public String validpagecampaignwithproduct()
			{
				return validationtext.getText();
			}

}
