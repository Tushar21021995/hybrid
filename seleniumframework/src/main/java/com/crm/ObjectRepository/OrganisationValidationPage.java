package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationValidationPage 
{
	//initilization
		public OrganisationValidationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//declaration
		@FindBy(xpath="//span[@class='lvtHeaderText']")
		private WebElement validation;

		
		// utilisation
		
		public WebElement getValidation() 
		{
			return validation;
		}
		
		// buisness logics
		/**
		 * @param validation
		 * @author Tushar
		 */
		
		public String validpageorg()
		{
			return validation.getText();
		}


}
