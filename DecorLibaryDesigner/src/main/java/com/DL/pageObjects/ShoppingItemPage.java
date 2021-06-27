package com.DL.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingItemPage {
	

	WebDriver ldriver;
		
		public ShoppingItemPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		@FindBy(xpath="//*[@class='mat-card-title txt-overflow-ellipsis col-md-11 padding-0' and contains(text(),'Auto Project2')]")
		public WebElement btnSelectPro;
		
		//Select Shopping list
		@FindBy(xpath="//*[@src='../../../../../../assets/images/stepper-images/icon-1.svg' ]")
		public WebElement btnShoppinglist;
		
		@FindBy(xpath="//*[@class='mat-focus-indicator btn btn-inner btn-grn mat-raised-button mat-button-base ng-star-inserted']")
		public WebElement btnAddNew;
		
		@FindBy(xpath="//*[@placeholder='Product name']")
		public WebElement txtProductName;
		
		@FindBy(xpath="//*[@formcontrolname='supplierId']")
		public WebElement suppliertName;
		
		@FindBy(xpath="//span[contains(text(),'Test Steam Study New')]")
		public WebElement supplierOption;
		
		@FindBy(xpath="//*[@formcontrolname='whd']")
		public WebElement txtmeasurements;
		
		@FindBy(xpath="//*[@formcontrolname='itemPrice']")
		public WebElement txtItembudget;
		
		@FindBy(xpath="//*[@formcontrolname='quantity']")
		public WebElement txtItemquntity;
		
		@FindBy(xpath="//*[@formcontrolname='materialCategoryId']")
		public WebElement material;
		
		@FindBy(xpath="//span[@class='mat-option-text' and contains(text(),'Mirror')]")
		public WebElement materialOption;
		
		@FindBy(xpath="//textarea")
		public WebElement txtNote;
		
		@FindBy(xpath="//*[@class='d-flex justify-content-center ng-star-inserted']")
		public WebElement lblShoppingList;
		
		@FindBy(xpath="//*[@type='submit']")
		public WebElement btnSubmit;
		
		@FindBy(xpath="//*[@id=\"cdk-step-content-0-0\"]/div[1]/app-step-one/div[2]/table/tbody/tr/td[8]/button")
		public WebElement btnedit;
		
		@FindBy(xpath="//*[@src='../../../../../../assets/images/stepper-images/icon-3.svg' ]")
		public WebElement btnSource;
		
	

}
