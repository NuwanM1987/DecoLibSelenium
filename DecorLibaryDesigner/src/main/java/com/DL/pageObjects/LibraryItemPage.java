package com.DL.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryItemPage {

	WebDriver ldriver;
	public LibraryItemPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//*[@formcontrolname='productType']")
	public WebElement selectPrductTypeList;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains (text(),'Art ')]")
	public WebElement selectProductType;
	
	@FindBy(xpath="//*[@formcontrolname='subType']")
	public WebElement selectProductSubTypeList;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains (text(),' Poster ')]")
	public WebElement selectPrductSubType;
	
	@FindBy(xpath="//*[@placeholder='Product Code']")
	public WebElement txtProductCode;
	
	@FindBy(xpath="//*[@formcontrolname='itemName']")
	public WebElement txtItemName;
	
	@FindBy(xpath="//*[@formcontrolname='color']")
	public WebElement txtColor;
	
	@FindBy(xpath="//*[@formcontrolname='supplier']")
	public WebElement selectSupplierList;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains (text(),' P&Y TEST ')]")
	public WebElement selectSupplier;
	
	
	@FindBy(xpath="//*[@formcontrolname='whd']")
	public WebElement txtDimensions;
	
	@FindBy(xpath="//*[@formcontrolname='status']")
	public WebElement selectItemAvailabilityList;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains (text(),' Backordered ')]")
	public WebElement selectItemAvailability;
	
	@FindBy(xpath="//*[@formcontrolname='description']")
	public WebElement ItemDesc;
	
	@FindBy(xpath="//*[@formcontrolname='materialCategoryId']")
	public WebElement selectMaterialList;
	
	@FindBy(xpath="//span[@class='mat-option-text' and contains(text(),' Mirror ')]")
	public WebElement selectMaterial;
	
	@FindBy(xpath="//*[@formcontrolname='leadTime']")
	public WebElement Leadtime;
	
	@FindBy(xpath="//*[@formcontrolname='itemPrice']")
	public WebElement ItemPrice;
	
	@FindBy(xpath="//*[@formcontrolname='productMargin']")
	public WebElement ProductMargin;
	
	@FindBy(xpath="//*[@formcontrolname='retailPrice']")
	public WebElement RetailPrice;
	
	@FindBy(xpath="//*[@formcontrolname='catalogs']")
	public WebElement ItemCategoryList;
	
	@FindBy(xpath="//span[contains(text(),'Bedroom')]")
	public WebElement ItemCategory;
	
	@FindBy(xpath="//*[@formcontrolname='weight']")
	public WebElement weight;
	
	
	@FindBy(xpath="//*[@class='mat-chip-input mat-input-element']")
	public WebElement tags;
	
	@FindBy(xpath="//*[@formcontrolname='notes']")
	public WebElement notes;
	
	@FindBy(xpath="//*[@formcontrolname='careInstruction']")
	public WebElement CareInstructions;
	
	//Upload image
	@FindBy(xpath="//input[@type='file']")
		public WebElement btnUpload;
		
		
	@FindBy(xpath="//*[@class='mat-button-wrapper' and contains(text(),'Add library item')]")
	public WebElement btnAddItem;
	
	@FindBy(xpath="//*[@role='alertdialog']")
	public WebElement toasmessage;

}
