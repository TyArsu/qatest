package com.codistan.readingexcelfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		
	    File src = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelFiles\\ExcelApachePoi.xlsx");
	    
//	    File src = new File("C:\\Users\\Codistan\\eclipse-workspace\\qatestproject\\src\\main\\resources\\ExcelFiles\\ExcelApachePoi.xlsx");
	    
//	   		 C:\Users\Codistan\eclipse-workspace\qatestproject\src\main\resources\ExcelFiles\ExcelApachePoi.xlsx
	    
//	    First step with File Class is just to show location
	    
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	Java does not understand \ Single slash, it needs to be  \\ double slash
		

		
	}

}
