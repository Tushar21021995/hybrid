package package1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Softassert 
{

	@Test
	public void createcontacttest()
	{
		
		System.out.println("Step 1");
		System.out.println("Step 2");
		Assert.assertEquals("A", "A");
		System.out.println("Step 3");
		System.out.println("Step 4");
	}
	
	
	@Test
	public void modifycontacttest()
	{
		System.out.println("....................................");
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
	}
}
