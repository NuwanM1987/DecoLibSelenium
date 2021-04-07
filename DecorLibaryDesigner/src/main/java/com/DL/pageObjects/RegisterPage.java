package com.DL.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver ldriver;
	public RegisterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@class='mat-button-wrapper' and contains(text(),'Register')]")
	public WebElement btnRegister;
	
	@FindBy(xpath="//*[@formcontrolname='firstname']")
	public WebElement txtFirstName;
	
	@FindBy(xpath="//*[@formcontrolname='lastname']")
	public WebElement txtlastName;
	
	@FindBy(xpath="//*[@formcontrolname='abn']")
	public WebElement txtABN;
	
	@FindBy(xpath="//*[@formcontrolname='companyname']")
	public WebElement CompanyName;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains(text(),' OIL-Y ')]")
	public WebElement CompanyNameSelect;
	@FindBy(id="mat-input-10")
	public WebElement txtPreferedName;
	
	@FindBy(xpath="//*[@formcontrolname='email']")
	public WebElement txtemail;
	
	@FindBy(xpath="//*[@formcontrolname='address']")
	public WebElement txtaddress;
	
	@FindBy(xpath="//*[@formcontrolname='suburb']")
	public WebElement txtsuburb;
	
	@FindBy(xpath="//*[@formcontrolname='state']")
	public WebElement txtstate;
	
	@FindBy(xpath="//*[@formcontrolname='postalCode']")
	public WebElement txtPostalCode;
	
	@FindBy(xpath="//*[@formcontrolname='website']")
	public WebElement txtwebsite;
	
	@FindBy(xpath="//*[@formcontrolname='instagram']")
	public WebElement txtinsta;
	
	//@FindBy(xpath="//*[@class='mat-form-field-infix ng-tns-c60-7']")
	@FindBy(css="input[type='password']")
	public WebElement txtpassword;
	
	@FindBy(xpath="//*[@formcontrolname='confirmpassword']")
	public WebElement txtconfpassword;
	
	@FindBy(xpath="//*[@data-intercom-target='userreg nextbtn']")
	public WebElement btnNext;
	
	//Subscription details
	
	@FindBy(xpath="//*[@id='mat-button-toggle-1-button']")
	public WebElement btnyearly;
	
	@FindBy(xpath="//*[@id='mat-button-toggle-2-button']")
	public WebElement btnmonthly;
	
	@FindBy(xpath="//*[@formcontrolname='promocode']")
	public WebElement txtpromocode;
//	@FindBy(xpath="//*[@id='cardNumber']") 
//	public WebElement txtCardNumber;
	
	@FindBy(xpath="/html/body/app-root/app-user-registration/div/div/div[2]/div/form/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[2]/div[1]/div")
	public WebElement txtexpDate;
	
	@FindBy(xpath ="//*[@data-elements-stable-field-name='cardNumber']")
	public WebElement txtCardNumber;
	
	
	@FindBy(xpath="//div[@class='col-md-6'][2]/div[@class='form-control py-3 StripeElement StripeElement--empty']/div[@class='__PrivateStripeElement']/iframe")
	public WebElement CVC;
	
	@FindBy(xpath="//*[@id='mat-checkbox-1-input']")
	public WebElement chkBox;
	
	
	//@FindBy(xpath="//*[@class='mat-focus-indicator btn btn-round full-width margin-lr-10 mat-raised-button mat-button-base mat-primary'])")
	@FindBy(css="input[type='submit']")
	public WebElement btnSubmit;
}
