package com.codistan.readingexcelfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dexcel {

	public static void main(String[] args) throws Exception {

		File src = new File (System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelFiles\\usernameandpassword.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String rowZero = sheet.getRow(0).getCell(0).getStringCellValue();
		int value = (int)  sheet.getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(rowZero);
		System.out.println(value);

	}

}
