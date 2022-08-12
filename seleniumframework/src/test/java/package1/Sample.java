package package1;

import org.testng.annotations.Test;

public class Sample 
{
	
	@Test
	public void createcontat()
	{
		System.out.println("createcontact");
	}
 
	@Test(invocationCount=5)
	public void modifycontact()
	{
		System.out.println("modify contact");
	}
	@Test
	public void deletecontact()
	{
		System.out.println("delete contact");
	}
	
	
}
