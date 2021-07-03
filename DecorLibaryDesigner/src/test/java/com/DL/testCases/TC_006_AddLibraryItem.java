package com.DL.testCases;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.ItemRoomPage;
import com.DL.pageObjects.ProjectPage;
import com.DL.pageObjects.DashboardPage;
import com.DL.pageObjects.LibraryItemPage;
import com.DL.pageObjects.LibraryPage;
import com.DL.pageObjects.LoginPage;
import com.DL.utilities.XLUtils;

public class TC_006_AddLibraryItem extends BaseClass {
	LibraryPage Libpage;
	LibraryItemPage libraryitem;
	ItemRoomPage createItem;;
	LoginPage login;
	 Random rand = new Random();
	 int rand_int1 = rand.nextInt(10000);
	 int rand_int2 = rand.nextInt(100);
	
	@Test(dataProvider = "DT_05CreateLibraryItem")
	public void createItemLib(String ProductCode,String ItemName,String ItemColor,String Dimension,String Description,String LeadTime,String ItemPrice
			,String ProductMargin,String RRP,String Weight,String Tags,String Note,String CareInstruction) throws InterruptedException {
	
		Thread.sleep(6000);
		Libpage= new LibraryPage(driver);
		libraryitem=new LibraryItemPage(driver);
		Thread.sleep(3000);
		Libpage.menuLibrary.click();
		Thread.sleep(10000);
		Libpage.btnAddItemLib.click();
		Thread.sleep(10000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(libraryitem.selectPrductTypeList));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-550)");
		libraryitem.txtProductCode.sendKeys(ProductCode+rand_int1);
		Thread.sleep(3000);
		libraryitem.selectPrductTypeList.click();
		libraryitem.selectProductType.click();
		Thread.sleep(3000);
		libraryitem.selectProductSubTypeList.click();
		libraryitem.selectPrductSubType.click();
		Thread.sleep(3000);
		
		libraryitem.txtItemName.sendKeys(ItemName+rand_int2);
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
		String s = Keys.chord(Keys.CONTROL, "a");
		libraryitem.ItemPrice.sendKeys(s);
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
		String success =libraryitem.toastmessage.getText();
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
