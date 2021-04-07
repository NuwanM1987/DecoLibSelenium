package com.DL.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.CreateRoomPageNew;
import com.DL.pageObjects.ShoppingItemPage;
import com.DL.utilities.XLUtils;

public class TC_004_CreateShoppingList extends BaseClass {

	CreateRoomPageNew createRoomn;
	ShoppingItemPage shItem;

	//@Test(dependsOnGroups = { "com.DL.testCases.TC_001_LoginToDL" }, dataProvider = "")
	@Test(dataProvider="DT_04CreateShoppingItem")
	public void createShoppingitem(String ProductName,String Measurements,String Itembudget,String Quantity,String Note) throws InterruptedException {
		
		Thread.sleep(15000);
		createRoomn = new CreateRoomPageNew(driver);
		shItem = new ShoppingItemPage(driver);

		createRoomn.selectProject();
		createRoomn.clickAddRoom();
		createRoomn.selectrooms();
		createRoomn.submitAddroom();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shItem.btnShoppinglist));
		shItem.btnShoppinglist.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shItem.btnAddNew));
		shItem.btnAddNew.click();
		shItem.txtProductName.sendKeys(ProductName);
		Thread.sleep(3000);
		//new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shItem.suppliertName));
		shItem.suppliertName.click();
		Thread.sleep(4000);
		//new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shItem.suppliertName));
		shItem.supplierOption.click();
		//shItem.lblShoppingList.click();
		shItem.txtmeasurements.clear();
		shItem.txtmeasurements.sendKeys(Measurements);
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shItem.txtItembudget));
		shItem.txtItembudget.sendKeys(Itembudget);
		shItem.txtItemquntity.sendKeys(Quantity);
		Thread.sleep(4000);
		shItem.material.click();
		shItem.materialOption.click();
		shItem.txtNote.sendKeys(Note);
		shItem.btnSubmit.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(shItem.btnShoppinglist));
		shItem.btnShoppinglist.click();
		//logout();

	}
	
	@DataProvider(name="DT_04CreateShoppingItem")
	String [][] getdata()throws IOException {
		String path=System.getProperty("user.dir")+"/Testdata/DT_04CreateShoppingItem.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String data[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				data[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
				
		}
	return data;
	}

		
	}
	

