package com.pearson.testscript;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pearson.genericLibrary.BaseClass;
import com.pearson.genericLibrary.ExcelUtils;
import com.pearson.objectRepository.HomePage;

public class Test1 extends BaseClass {
	
	@Test
		
	public  void testblock() throws Throwable {
		

		
		String item=eLib.getExcelData("Sheet1", 1, 1);
		HomePage h = new HomePage(driver);
		h.writeSearchbox(item);
		
	}
}
