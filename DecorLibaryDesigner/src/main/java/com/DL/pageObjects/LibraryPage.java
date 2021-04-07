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
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/div/app-menubar/div/div/div/div/ul/li[3]/a")
	public WebElement btnLibrary;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/div/div[2]/app-view-library-item/div/div[1]/div[2]/div[2]/button")
	public WebElement btnAddItemLib;
	

	
	
	
	
}
