package com.DL.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {

	WebDriver ldriver;
	public LibraryPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='/library']")
	public WebElement menuLibrary;
	
	@FindBy(xpath="//*[@data-intercom-target='viewlibryitm uploadtolibrarybtn']")
	public WebElement btnAddItemLib;
	

	
	
	
	
}
