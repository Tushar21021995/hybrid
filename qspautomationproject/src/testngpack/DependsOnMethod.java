package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test
	public void b() {
		Reporter.log("b method",true);
	}
	@Test(dependsOnMethods = "b")
	public void a()
	{
		Reporter.log("a",true);
	}


}
