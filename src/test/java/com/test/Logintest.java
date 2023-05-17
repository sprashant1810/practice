package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mj.Utility.Baseclass;
import com.mj.Utility.Libraryclass;
import com.mj.pageobject.loginpom;

public class Logintest extends Baseclass {

	@Test
	public void verifylogin() {
		loginpom login =PageFactory.initElements(driver, loginpom.class);
		//login.getEmailid().sendKeys("vinodmehetre92@gmail.com");
		//login.getPass().sendKeys("Vinod@2519");
		//login.getLogbtn().click();
		
		Libraryclass.custom_sendKeys(login.getEmailid(), "emailid", "vinodmehetre92@gmail.com");
		Libraryclass.custom_sendKeys(login.getPass(), "pass", "Vinod@2519");
		Libraryclass.custom_click(login.getLogbtn(), "logbtn");
		
		//Libraryclass.custom_sendKeys(login.getEmailid(), "emailid",excel.getStringData("Sheet1", 0, 0));
		//Libraryclass.custom_sendKeys(login.getPass(), "pass", excel.getStringData("Sheet1", 0, 1));
		//Libraryclass.custom_click(login.getLogbtn(), "logbtn");
		Assert.assertTrue(false);
	}
	
	
}
