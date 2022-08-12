package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignValidationPage 
{
	//initilization
			public CampaignValidationPage(WebDriver driver)
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
			
			public String validpagecampaign()
			{
				return validationtext.getText();
			}


}
