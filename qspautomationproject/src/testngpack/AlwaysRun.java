package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AlwaysRun {
  @Test
  public void b() {
	  
	  Reporter.log("b",true);
	  
  }
  @Test(dependsOnMethods = "b",alwaysRun = true)
  public void a() 
  {
	  Reporter.log("a",true);
}
}
