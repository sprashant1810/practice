package com.mj.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement emailid;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement pass;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement logbtn;
	
	public loginpom(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmailid() {
		return emailid;
	}
     public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

}
