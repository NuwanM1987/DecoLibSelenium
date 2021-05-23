package com.DL.testCases;

import java.io.IOException;

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
import com.DL.pageObjects.RoomPageNew;
import com.DL.utilities.ReadConfig;
import com.DL.utilities.XLUtils;

import freemarker.core.ReturnInstruction.Return;

public class TC_005_CreateItemRoom extends BaseClass {
	ItemRoomPage createiRoomn;
	RoomPageNew createRoomn;
	ReadConfig readconfig = new ReadConfig();
@Test(dataProvider="DT_03CreateRoomItem")
	//@Test(dependsOnGroups = { "com.DL.testCases.TC_001_LoginToDL" }, dataProvider = "DT_03CreateRoomItem")
	public void createItemRoom(String ProductCode,String ItemName,String ItemColor,String Dimension,String Description,String LeadTime,String ItemPrice,
			String ProductMargin,String RRP,String Weight,String Tags,String Note,String CareInstruction) throws InterruptedException {
		
		createiRoomn=new ItemRoomPage(driver);
		createRoomn = new RoomPageNew(driver);
	//	createRoomn.selectProject();
		Thread.sleep(4000);
	//	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(createiRoomn.btnFloorplan));
		createiRoomn.btnFloorplan.click();
		createiRoomn.btnSourceItem.click();
		createiRoomn.btnAddNew.click();
		createiRoomn.selectAddItemfromComp.click();
		Thread.sleep(3000);
		createiRoomn.selectPrductTypeList.click();
		Thread.sleep(2000);
		createiRoomn.selectProductType.click();
		Thread.sleep(3000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(createiRoomn.selectPrductSubTypeList));
		createiRoomn.selectPrductSubTypeList.click();
		createiRoomn.selectProductSubType.click();
		createiRoomn.txtProductCode.sendKeys(ProductCode);
		createiRoomn.txtItemName.sendKeys(ItemName);
		createiRoomn.txtItemColor.sendKeys(ItemColor);
		Thread.sleep(2000);
		createiRoomn.selectSupplierNameList.click();
		createiRoomn.selectSupplierOption.click();
		createiRoomn.txtDimensions.clear();
		createiRoomn.txtDimensions.sendKeys(Dimension);
		Thread.sleep(2000);
		createiRoomn.itemAvailbleList.click();
		createiRoomn.itemAvailbleOption.click();
		createiRoomn.Description.sendKeys(Description);
		createiRoomn.MaterialList.click();
		createiRoomn.material.click();
		createiRoomn.LeadTime.sendKeys(LeadTime);
		createiRoomn.ItemPrice.sendKeys(ItemPrice);
		createiRoomn.ProductMargin.sendKeys(ProductMargin);
		createiRoomn.RRP.sendKeys(RRP);
		createiRoomn.ItemCategoryList.click();
		createiRoomn.ItemCategory.click();
		/*
		 * 
		 * For selection dropdown close Solution found: it needs to click escape button via action class
		 * 
		 */
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		createiRoomn.Weight.sendKeys(Weight);
		createiRoomn.Tag.sendKeys(Tags);
		createiRoomn.Note.sendKeys(Note);
		createiRoomn.CInstruction.sendKeys(CareInstruction);
		Thread.sleep(2000);
		createiRoomn.btnUpload.sendKeys("C:\\Users\\NuwanMaduranga\\git\\DecoLibSelenium\\DecorLibaryDesigner\\images\\project-management-6.jpg");
		Thread.sleep(6000);
		createiRoomn.btnAddItem.click();
		Thread.sleep(3000);
		
	}
	
	@DataProvider(name="DT_03CreateRoomItem")
	String[][] getdata() throws IOException{
		
		String path = System.getProperty("user.dir")+"/Testdata/DT_03CreateRoomItem.xlsx";
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
