package com.DL.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		WebDriver ldriver;
			
			public LoginPage(WebDriver rdriver)
			{
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
			}
				
			@FindBy(id="mat-input-0")
			@CacheLookup
			public WebElement txtUserName;
			
			@FindBy(id="mat-input-1")
			public WebElement txtPassword;
			
			@FindBy(xpath="//*[@class='mat-focus-indicator btn login-btn-decor btn-round mat-raised-button mat-button-base mat-primary']")
			@CacheLookup
			public WebElement btnLogin;
			
			@FindBy(xpath="//a[text()='Logout']")
			@CacheLookup
			public WebElement lnkLogout;
			
			
			
			

}
