package com.DL.testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.CreateItemRoomPage;
import com.DL.pageObjects.CreateProjectPage;
import com.DL.pageObjects.DashboardPage;
import com.DL.pageObjects.LibraryItemPage;
import com.DL.pageObjects.LibraryPage;
import com.DL.pageObjects.LoginPage;
import com.DL.utilities.XLUtils;

public class TC_006_AddLibraryItem extends BaseClass {
	LibraryPage Libpage;
	LibraryItemPage libraryitem;
	CreateItemRoomPage createItem;;
	LoginPage login;
	
	@Test(dataProvider = "DT_05CreateLibraryItem")
	//@Test
	public void createItemLib(String ProductCode,String ItemName,String ItemColor,String Dimension,String Description,String LeadTime,String ItemPrice
			,String ProductMargin,String RRP,String Weight,String Tags,String Note,String CareInstruction) throws InterruptedException {
	// login = new LoginPage(driver);
	// login.txtUserName.sendKeys("kishan1@yopmail.com");
	// login.txtPassword.sendKeys("Nuwan@123");
	// login.btnLogin.click();
		Thread.sleep(6000);
		Libpage= new LibraryPage(driver);
		libraryitem=new LibraryItemPage(driver);
		Thread.sleep(3000);
		Libpage.btnLibrary.click();
		Thread.sleep(10000);
		Libpage.btnAddItemLib.click();
		Thread.sleep(10000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(libraryitem.selectPrductTypeList));
		libraryitem.txtProductCode.sendKeys(ProductCode);
		libraryitem.selectPrductTypeList.click();
		libraryitem.selectProductType.click();
		Thread.sleep(3000);
		libraryitem.selectProductSubTypeList.click();
		libraryitem.selectPrductSubType.click();
		libraryitem.txtItemName.sendKeys(ItemName);
		libraryitem.txtColor.sendKeys(ItemColor);
		libraryitem.selectSupplierList.click();
		libraryitem.selectSupplier.click();
		libraryitem.txtDimensions.clear();
		libraryitem.txtDimensions.sendKeys(Dimension);
		libraryitem.selectItemAvailabilityList.click();
		libraryitem.selectItemAvailability.click();
		libraryitem.ItemDesc.sendKeys(Description);
		libraryitem.selectMaterialList.click();
		libraryitem.selectMaterial.click();
		libraryitem.Leadtime.sendKeys(LeadTime);
		libraryitem.ItemPrice.sendKeys(ItemPrice);
		libraryitem.ProductMargin.sendKeys(ProductMargin);
		Thread.sleep(3000);
		libraryitem.RetailPrice.sendKeys(RRP);
		libraryitem.ItemCategoryList.click();
		libraryitem.ItemCategory.click();
		/*
		 * 
		 * For selection dropdown close Solution found: it needs to click escape button via action class
		 * 
		 */
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		libraryitem.weight.sendKeys(Weight);
		libraryitem.tags.sendKeys(Tags);
		libraryitem.notes.sendKeys(Note);
		libraryitem.CareInstructions.sendKeys(CareInstruction);
		Thread.sleep(6000);
		libraryitem.btnUpload.sendKeys("C:\\Users\\NuwanMaduranga\\Desktop\\Images\\appliances1.jpg");
		Thread.sleep(5000);
		libraryitem.btnAddItem.click();
		Thread.sleep(6000);
		String success =libraryitem.toasmessage.getText();
		System.out.println("Item Created:" + success);
		
	}
	
	@DataProvider(name="DT_05CreateLibraryItem")
	String [][] getdata()throws IOException {
		String path=System.getProperty("user.dir")+"/Testdata/DT_05CreateLibraryItem.xlsx";
		int ronum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String data[][]= new String[ronum][colcount];
		
		for(int i=1;i<=ronum;i++) 
		{
		for (int j=0;j<colcount;j++) {
			data[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
		}	
		}
		return data;
	}

}
