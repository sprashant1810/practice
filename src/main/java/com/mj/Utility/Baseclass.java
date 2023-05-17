package com.mj.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static ConfigDetaProvider config;
	//public static ExcelDetaProvider excel;
	public static  WebDriver driver;
	
	@BeforeSuite
	public void BS() throws IOException {
		//ConfigDetaProvider config= new ConfigDetaProvider();
		config= new ConfigDetaProvider();
		//ExcelDetaProvider excel= new ExcelDetaProvider();
		//excel= new ExcelDetaProvider();
	}
	
	
	@BeforeMethod
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/login/");
		driver.get(config.getStageUrl());
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closebrower() {
		driver.close();
	}
	

}
