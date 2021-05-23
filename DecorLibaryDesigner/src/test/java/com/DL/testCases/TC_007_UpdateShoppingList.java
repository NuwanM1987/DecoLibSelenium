package com.DL.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.RoomPageNew;
import com.DL.pageObjects.DashboardPage;
import com.DL.pageObjects.LoginPage;
import com.DL.pageObjects.ShoppingItemPage;

public class TC_007_UpdateShoppingList extends BaseClass {
	RoomPageNew createRoomn;
	ShoppingItemPage shItem;
	LoginPage login;
	DashboardPage dashboard;
	@Test
	public void updateShopingList() throws Exception, IOException {
		login = new LoginPage(driver);
		createRoomn = new RoomPageNew(driver);
		login.txtUserName.sendKeys("thiwand1@yopmail.com");
		login.txtPassword.sendKeys("Nuwan@123");
		login.btnLogin.click();
		Thread.sleep(8000);
		createRoomn.selectProject();
		

}
}