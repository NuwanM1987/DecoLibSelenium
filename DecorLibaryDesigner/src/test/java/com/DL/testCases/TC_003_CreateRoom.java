package com.DL.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.CreateRoomPageNew;
import com.DL.pageObjects.DashboardPage;
import com.DL.pageObjects.LoginPage;
import com.DL.pageObjects.ShoppingItemPage;

public class TC_003_CreateRoom extends BaseClass {


	CreateRoomPageNew createRoomn;
	ShoppingItemPage shItem;
	LoginPage login;
	DashboardPage dashboard;
	
	@Test(dataProvider = "")
//@Test(dependsOnGroups = { "com.DL.testCases.TC_001_LoginToDL" }, dataProvider = "")
	public void createRoom() throws InterruptedException {
	login = new LoginPage(driver);
	login.txtUserName.sendKeys("yuhan1@yopmail.com");
	login.txtPassword.sendKeys("Nuwan@123");
	login.btnLogin.click();
	Thread.sleep(8000);
		createRoomn = new CreateRoomPageNew(driver);
		shItem= new ShoppingItemPage(driver);
		createRoomn.selectProject();
		createRoomn.clickAddRoom();
		createRoomn.selectrooms();
		createRoomn.submitAddroom();
		//shItem.btnShoppinglist.click();
		//	shItem.btnAddNew.click();
		//driver.findElement(By.xpath("//*[@src='../../../../../../assets/images/stepper-images/icon-1.svg' ]")).click();
		//driver.findElement(By.xpath("//*[@class='mat-focus-indicator btn btn-inner btn-grn mat-raised-button mat-button-base ng-star-inserted']")).click();
		//createRoomn.ShoppingList();
		
		
	}
}
