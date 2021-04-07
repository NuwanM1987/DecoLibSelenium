package com.DL.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver ldriver;
	
	public DashboardPage(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@class='deco-dash-add-btn']")
	public WebElement btnCreateProject;
	
	public void clickCreateprojectBtn() {
		btnCreateProject.click();
	}
	@FindBy(xpath="//span[contains(text(),'Add new project')]")
	public WebElement btnCreateProjectbtn;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/div/app-menubar/div/div/div/div/ul/li[3]/a")
	public WebElement btnLibrary;
}
