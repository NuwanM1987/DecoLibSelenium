package com.DL.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/div/app-header/div/div/div/div[2]/span[3]/div/div/a[1]")
	public WebElement ProfileLink;
	
	@FindBy(xpath="//*[@class='mat-tab-label-content' and contains(text(),'TEAM MANAGEMENT')]")
	public WebElement linkTeamManagement;
	
	@FindBy(xpath="//*[@placeholder='New team member email address']")
	public WebElement txtTeamEmail;
	
	@FindBy(xpath="//*[contains(text(),'Add a team member')]")
	public WebElement btnAddTeamMember;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/div/app-header/div/div/div/div[2]/span[3]/div")
	public WebElement linkDropdown;
}
