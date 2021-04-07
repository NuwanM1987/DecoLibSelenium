package com.DL.pageObjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProjectPage {
	WebDriver ldriver;
	
	public CreateProjectPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
			}

	@FindBy(xpath="//*[@id='mat-input-2']")
	public WebElement txtClientName;
	
	@FindBy(xpath="//*[@id='mat-input-3']")
	public WebElement txtClientEmail;
	
	@FindBy(xpath="//*[@id='mat-input-4']")
	public WebElement txtMobNo;
	
	@FindBy(xpath="//*[@id='mat-input-5']")
	public WebElement txtAddress;
	
	@FindBy(xpath="//*[@id='mat-input-6']")
	public WebElement txtSuburb;
	
	@FindBy(xpath="//*[@id='mat-input-7']")
	public WebElement txtState;
	
	@FindBy(xpath="//*[@id='mat-input-8']")
	public WebElement txtPostalCode;
	
	@FindBy(xpath="//*[@class='mat-focus-indicator btn btn-btn-inner margin-bottom-30 mat-raised-button mat-button-base']")
	public WebElement btnAddClient;
	
	@FindBy(xpath="//*[@class='d-flex justify-content-center ng-star-inserted']/h1")
	public WebElement lblAddClient;
	
	//Adding name and description
	@FindBy(xpath="//*[@id='mat-input-10']")
	public WebElement txtProName;
	
	@FindBy(xpath="//*[@id='mat-input-11']")
	public WebElement txtProDescription;
	
	@FindBy(xpath="//*[@class='mat-focus-indicator btn btn-btn-inner margin-bottom-30 mat-raised-button mat-button-base']")
	public WebElement btnAddProject;
	
	@FindBy(xpath="//input[@type='file']")
	public WebElement btnUpload;
	
	@FindBy(xpath="//div[@class='well my-drop-zone text-center padding-tb-30']")
	public WebElement dropArea;
	
	
	//public WebElement droparea = ldriver.findElement(By.xpath("//div[@class='well my-drop-zone text-center padding-tb-30']"));
	
	
	
}
