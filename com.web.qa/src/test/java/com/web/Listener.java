package com.web;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listener implements ITestListener{
  
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	System.out.println("Sucessful testcase is:"+result.getName());
}

public void onTestFailure(ITestResult result) {
	System.out.println("Failed testcase is:"+result.getName());
	
}

public void onTestSkipped(ITestResult result) {
	System.out.println("Skipped testcase is:"+result.getName());
	
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
