package com.Utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\Acer\\Desktop\\TestData\\Data.xlsx";
		FileInputStream file =new FileInputStream(path);
		wb=new XSSFWorkbook();
	}
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
