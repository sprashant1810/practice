package com.mj.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterclass {
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public  static ExtentReports getReports() {
		String reportpath= "E:\\New folder\\MJ.2022batch\\TestReport\\index.html";
		//ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Automation report_Egale Vision");
		reporter.config().setReportName("Egale vision Automation");
		reporter.config().setTheme(Theme.DARK);
		
		//ExtentReports extent= new ExtentReports() {
			extent= new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("project name", "Egale vision project");
			extent.setSystemInfo("virsion", "1.5.1");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("QA", "Vinod");
			return extent;
			
			
		}
	}


