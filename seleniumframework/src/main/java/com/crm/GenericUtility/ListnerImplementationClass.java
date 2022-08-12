package com.crm.GenericUtility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;

public class ListnerImplementationClass implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}
	public void onTestFailure(ITestResult result)
	{
		String testname = result.getMethod().getMethodName();
		System.out.println(testname+"===Execute and i am Listening====");
		//EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sDriver);
		//File src = eDriver.getScreenshotAs(OutputType.FILE);
		try 
		{
			File dest = new File("./screenshot/"+testname+".png");
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}

	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
