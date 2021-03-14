package com.pearson.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	
 public static WebDriver driver;
 
public WebdriverUtils wLib = new WebdriverUtils();
public FileUtils fLib= new FileUtils();
public  ExcelUtils eLib= new ExcelUtils();
	

	
	@BeforeClass
	
	public void configBC() throws Throwable {
		String BROWSER = fLib.getPropertyKeyValue("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(BROWSER.equalsIgnoreCase("ie")) {
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		wLib.waitForHTMLDOM(driver);
		driver.get(fLib.getPropertyKeyValue("url"));
		System.out.println(eLib.getExcelData("Sheet1", 1, 1));
	}
/**
 * close the browser
 */
@AfterClass
public void configAC() {
	driver.quit();
}

}
