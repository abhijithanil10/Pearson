package com.pearson.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.pearson.genericLibrary.BaseClass;
import com.pearson.genericLibrary.ExcelUtils;

public class HomePage extends BaseClass {

	

	@FindBy(xpath="//input[@class='search-box-input ui-autocomplete-input']")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}
	
	@FindBy(xpath="//button[@class='search-box-icon']")
	private WebElement searchIcon;

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	@FindBy(xpath="//a[@id='cookie-notification-policy-accept-continue']")
	private WebElement clear;
		
	public WebElement getClear() {
		return clear;
	}
	
	

	

	@FindBys({@FindBy(xpath="//a[@class='productItem__name']")})
	private List<WebElement> links;
	
	
	
	public List<WebElement> getLinks() {
		return links;
	}
	
	
	
	@FindBy(xpath="//a[@class='pagination__btn hasArrow arrowRight']")
	private WebElement nextButton;
	

	public WebElement getNextButton() {
		return nextButton;
	}

	
	
	

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//business logic method
	
public void writeSearchbox(String item) throws InterruptedException {
		
		
	
	
		clear.click();
		searchbox.clear();
		searchbox.sendKeys(item);
		searchIcon.click();
		
		
		int count1=links.size();
		SoftAssert s= new SoftAssert();
		s.assertEquals(count1, 10);
		System.out.println("Count1 is "+count1);
		nextButton.click();
		
		
		int count2=links.size();
		s.assertEquals(count2, 10);
		System.out.println("Count2 is "+count2);
		
		System.out.println(links.get(2).getText());
		links.get(2).click();
		Thread.sleep(5000);
		
	
		
		
		
		
	}

	
}
