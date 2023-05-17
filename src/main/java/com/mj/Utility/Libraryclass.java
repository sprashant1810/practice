package com.mj.Utility;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Libraryclass {
	public static ExtentTest test;
public static void custom_sendKeys(WebElement element,String fieldname,String value) {
	try {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname+"=value successfully send="+value);
		
	}
	
	catch(Exception e) {
		//System.out.println("unable to send value"+fieldname);	
		test.log(Status.FAIL, fieldname+"=unable to send value ="+e);
		
		
		
	}
		
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, fieldname+"=btn click successfully =");
			
		}
		catch (Exception e) {
			
			//System.out.println("unable to click"+fieldname);	
			test.log(Status.FAIL, fieldname+"=unable to click ="+e);
			
		}
		
		
	}
	

public static void custom_HandleDropDown(WebElement element,String fieldname,String value) {
	try {
		Select s= new Select(element);
		s.selectByVisibleText("test");
		
	}
	catch(Exception e) {
		System.out.println("unable to HandleDropDown"+fieldname);
	}
}


}











