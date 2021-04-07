package com.DL.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateItemRoomPage {
	
	WebDriver driver;
	
	public CreateItemRoomPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
				
	}
	//btn source item
	@FindBy(xpath="//*[@class='stepper-hdr-txt' and contains(text(),'Source items')]")
	public WebElement btnSourceItem;
	
	//Add new button
	@FindBy(xpath="//span[@class='mat-button-wrapper' and contains(text(),' Add new ')]")
	public WebElement btnAddNew;
	
	@FindBy(xpath="//*[@class='stepper-hdr-txt' and contains(text(),'Create floor plan')]")
	public WebElement btnFloorplan;
	
	@FindBy(xpath="//*[contains(text(),' Add item from computer ')]")
	public WebElement selectAddItemfromComp;
	
	@FindBy(xpath="//*[@formcontrolname='productType']")
	public WebElement selectPrductTypeList;
	
	@FindBy(xpath="//*[@class='mat-option-text' and contains(text(),'Beds')]")
	public WebElement selectProductType;
	
	@FindBy(xpath="//*[@class='mat-option-text' and contains(text(),' Super King ')]")
	public WebElement selectProductSubType;
	
	@FindBy(xpath="//*[@formcontrolname='subType']")
	public WebElement selectPrductSubTypeList;
	
	@FindBy(xpath="//*[@formcontrolname='itemName']")
	public WebElement txtItemName;
	
	@FindBy(xpath="//*[@formcontrolname='color']")
	public WebElement txtItemColor;
	
	@FindBy(xpath="//*[@formcontrolname='supplier']")
	public WebElement selectSupplierNameList;
	
	@FindBy(xpath="//*[@class='mat-option-text' and contains(text(),'Test Steam Study New')]")
	public WebElement selectSupplierOption;
	
	@FindBy(xpath="//*[@formcontrolname='productCode']")
	public WebElement txtProductCode;
	
	@FindBy(xpath="//*[@formcontrolname='whd']")
	public WebElement txtDimensions;
	
	@FindBy(xpath="//*[@formcontrolname='status']")
	public WebElement itemAvailbleList;
	
	@FindBy(xpath="//span[contains(text(),' Instock ')]")
	public WebElement itemAvailbleOption;
	
	
	@FindBy(xpath="//textarea[@placeholder='Description']")
	public WebElement Description;
	
	@FindBy(xpath="//*[@formcontrolname='materialCategoryId']")
	public WebElement MaterialList;
	
	@FindBy(xpath="//span[contains(text(),' Mirror ')]")
	public WebElement material;
	
	@FindBy(xpath="//*[@formcontrolname='leadTime']")
	public WebElement LeadTime;
	
	@FindBy(xpath="//*[@formcontrolname='itemPrice']")
	public WebElement ItemPrice;
	
	@FindBy(xpath="//*[@formcontrolname='productMargin']")
	public WebElement ProductMargin;
	
	@FindBy(xpath="//*[@formcontrolname='retailPrice']")
	public WebElement RRP;
	
	@FindBy(xpath="//*[@formcontrolname='catalogs']")
	public WebElement ItemCategoryList;
	
	@FindBy(xpath="//span[contains(text(),'Bedroom')]")
	public WebElement ItemCategory;
	
	@FindBy(xpath="//*[@formcontrolname='weight']")
	public WebElement Weight;
	
	@FindBy(xpath="//*[@aria-label='Tags selection']")
	public WebElement Tag;
	
	@FindBy(xpath="//textarea[@placeholder='Notes']")
	public WebElement Note;
	
	@FindBy(xpath="//textarea[@placeholder='Care instructions']")
	public WebElement CInstruction;
	
	//Upload image
	@FindBy(xpath="//input[@type='file']")
	public WebElement btnUpload;
	
	//Label
	@FindBy(xpath="//p[contains(text(),'Add comma')]")
	public WebElement lbl;
	
	@FindBy(xpath="//*[@type='submit']")
	public WebElement btnAddItem;
}
