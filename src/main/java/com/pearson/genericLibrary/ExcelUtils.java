package com.pearson.genericLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtils {
	
	

	public String getExcelData(String sheetName , int rowNum , int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./Testdata/Pearson.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		wb.close();
		return row.getCell(colNum).getStringCellValue();
				
	}
	

}
