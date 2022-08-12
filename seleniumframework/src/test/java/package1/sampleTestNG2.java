package package1;

import org.testng.annotations.Test;

public class sampleTestNG2
{
	@Test(priority=2)
	public void createorganisation()
	{
		System.out.println();
	}

	
	@Test(priority=1)
	public void modifyorganisation()
	{
		System.out.println("modify organisation");
	}
	
	@Test(priority=3)
	public void deleteorganisation()
	{
		System.out.println("delete organisation");
	}
}
