	package com.mj.Utility;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDetaProvider {
	XSSFWorkbook wb ;
	public ExcelDetaProvider() throws IOException {
		String excelpath="E:\\New folder\\MJ.2022batch\\TestData\\data.xlsx";
		FileInputStream file = new FileInputStream (excelpath);
		//XSSFWorkbook wb = new XSSFWorkbook(file);
		wb = new XSSFWorkbook(file);
	}
public String getStringData(String Sheetname,int row,int colounm) {
	return wb.getSheet(Sheetname).getRow(row).getCell(colounm).getStringCellValue();
}
}
