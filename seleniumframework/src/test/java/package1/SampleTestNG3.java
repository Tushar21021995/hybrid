package package1;

import org.testng.annotations.Test;

public class SampleTestNG3 
{
	
	@Test
	public void createcontac()
	{
		System.out.println("create contact");
		int[] arr= {1,2,3};
		System.out.println(arr[5]);
	}
	
	@Test(dependsOnMethods="createcontac")
	public void modifycontact()
	{
		System.out.println("modify contact");
	}
	
	
	@Test(dependsOnMethods="modifycontact")
	public void deletecontact()
	{
		System.out.println("delete contact");
	}

}
