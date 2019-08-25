package com.capsule.listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.capsule.base.TestBase;

public class ListenersClass extends TestBase implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Test Case Completed Successfully");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Starting with Automated Execution");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    try {
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\CaptureScreenshot.png"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
