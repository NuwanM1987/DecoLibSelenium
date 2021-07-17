package com.DL.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.LoginPage;
import com.DL.pageObjects.ProfilePage;


public class TC_011_AddTeamMember extends BaseClass{

	LoginPage login;
	ProfilePage profile;
	@Test
	public void addTeamMember() throws InterruptedException{
		login = new LoginPage(driver);
		profile = new ProfilePage(driver);
		login.txtUserName.sendKeys("thiwand1@yopmail.com");
		login.txtPassword.sendKeys("Nuwan@123");
		login.btnLogin.click();
		Thread.sleep(3000);
		profile.linkDropdown.click();
		profile.ProfileLink.click();
	}
}
