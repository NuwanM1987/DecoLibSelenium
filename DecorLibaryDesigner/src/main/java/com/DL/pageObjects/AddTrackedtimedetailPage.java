package com.DL.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTrackedtimedetailPage {

	WebDriver rdriver;
	
	public AddTrackedtimedetailPage(WebDriver ldriver) {
		this.rdriver= ldriver;
		PageFactory.initElements(rdriver,this);
				
	}
	
	@FindBy(xpath="//*[@href='/time/dashboard']")
	public WebElement MenuTimetracker;
	
	@FindBy(xpath="//*[contains(text(),' Start Time Tracking ')]")
	public WebElement btnStartTimeTracking;
	
	@FindBy(xpath="//*[@role='menuitem' and contains (text(),'Add time manually ')]")
	public WebElement menuManualTimeAdding;
	
	@FindBy(xpath="//*[@formcontrolname='projectId']")
	public WebElement listProjname;
	
	@FindBy(xpath="//*[//*[@class='mat-option-text' and contains(text(),'ProjectJRCT10')]")
	public WebElement inputProjname;
	
	@FindBy(xpath="//*[@formcontrolname='serviceId']")
	public WebElement listService;
	
	@FindBy(xpath="//*[@class='mat-option-text' and contains(text(),'Concept Design ')]")
	public WebElement inputService;
	
	@FindBy(xpath="//*[@placeholder='Service name']")
	public WebElement txtServiceName;
	
	@FindBy(xpath="//*[@formcontrolname='hourlyRate']")
	public WebElement txthourlyrate;
	
	@FindBy(xpath="//*[@formcontrolname='startDate']")
	public WebElement txtDate;
	
	@FindBy(xpath="//*[@formcontrolname='description']")
	public WebElement txtDescription;
	
	@FindBy(xpath="//*[@id='mat-slide-toggle-2']")
	public WebElement toggleBillable;

	@FindBy(xpath="//*[@formcontrolname='timeSpent']")
	public WebElement txtTimer;
	
	@FindBy(xpath="//*[@type='submit']")
	public WebElement btnAddTime;
	
	
	
	//Scrolldown to find Project name
	public void scrolldownProName() {
		WebElement Element = rdriver.findElement(By.xpath("//*[@class='mat-option-text' and contains(text(),'ProjectJRCT10')]"));
		JavascriptExecutor js = (JavascriptExecutor) rdriver;
		 js.executeScript("arguments[0].scrollIntoView();",Element);
		 Element.click();
	}
}

