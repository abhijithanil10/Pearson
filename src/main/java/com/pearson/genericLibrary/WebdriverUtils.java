package com.pearson.genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils {
	
	/**
	 *  used to wait for Element to be click able in GUI  & check for the element for every 500 millisecond , 
	 * @param driver
	 * @param elemnet
	 */
	public void waitforElementToBeClickable(WebDriver driver , WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * wait for DOM document to be load before finding any element in GUI
	 * @param driver
	 */
	public void waitForHTMLDOM(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
