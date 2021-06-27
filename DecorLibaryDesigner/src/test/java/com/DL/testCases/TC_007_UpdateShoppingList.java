package com.DL.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.RoomPageNew;
import com.DL.pageObjects.DashboardPage;
import com.DL.pageObjects.LibraryItemPage;
import com.DL.pageObjects.LoginPage;
import com.DL.pageObjects.ShoppingItemPage;

public class TC_007_UpdateShoppingList extends BaseClass {
	RoomPageNew createRoomn;
	ShoppingItemPage shItem;
	LoginPage login;
	DashboardPage dashboard;
	LibraryItemPage lib;
	@Test
	public void updateShopingList() throws Exception, IOException {
		login = new LoginPage(driver);
		createRoomn = new RoomPageNew(driver);
		lib = new LibraryItemPage(driver);
		shItem= new ShoppingItemPage(driver);
		login.txtUserName.sendKeys("thiwand1@yopmail.com");
		login.txtPassword.sendKeys("Nuwan@123");
		login.btnLogin.click();
		Thread.sleep(8000);
		createRoomn.selectProject();
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeSelected(shItem.btnedit));
		Thread.sleep(5000);
		shItem.btnShoppinglist.click();
		shItem.btnedit.click();
		shItem.txtProductName.clear();
		shItem.txtProductName.sendKeys("Prod_Up");
		shItem.txtmeasurements.clear();
		shItem.txtmeasurements.sendKeys("23.33/33.33/44.44");
		Thread.sleep(5000);
		//Select all the text and delete
		shItem.txtItembudget.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(2000);
		shItem.txtItembudget.sendKeys("10");
		shItem.txtItemquntity.clear();
		shItem.txtItemquntity.sendKeys("3");
		shItem.txtNote.clear();
		shItem.txtNote.sendKeys("Item has been updated");
		shItem.btnSubmit.click();
		//new WebDriverWait(driver, 60).until(ExpectedConditions.titleContains("giant panda"));
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.results_links_deep a.result__a")));
		Thread.sleep(6000);
		String success =lib.toastmessage.getText();
		System.out.println("Shopping Item Update:" + success);
}
}