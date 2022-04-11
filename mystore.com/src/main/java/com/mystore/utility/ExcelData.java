package com.mystore.utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelData() throws Exception {
		FileInputStream file = new FileInputStream("/Users/syedyousufali/eclipse-workspace/mystore.com/testData/data.xlsx");
		wb=new XSSFWorkbook(file);
		
	}
	public void readexcel(String sheetname,int row,int col) {
		sheet =wb.getSheet(sheetname);
		String dats =sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(dats+" ");
	}

}
