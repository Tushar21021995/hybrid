package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
     @Test(retryAnalyzer = com.crm.GenericUtility.ReTryImpClass.class )
	public void modifyContact()
	{
		Assert.assertEquals(false, true);
		System.out.println("modified contact");
	}
     
     
     @Test(retryAnalyzer = com.crm.GenericUtility.ReTryImpClass.class )
     public void createContact()
     {
    	 System.out.println("create contact");
     }
     
     
     
     
}
