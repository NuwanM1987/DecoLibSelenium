package com.DL.testCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.ClientPage;
import com.DL.pageObjects.LoginPage;
import com.DL.pageObjects.ProjectPage;

public class TC_009_UpdateClientDetails extends BaseClass{
	LoginPage login;
	ClientPage client;
	ProjectPage prpage;
	
	@Test
	public void updateClientDetails() throws InterruptedException, IOException, InvalidFormatException {
		login = new LoginPage(driver);
		client= new ClientPage(driver);
		prpage= new ProjectPage(driver);
		
		login.txtUserName.sendKeys("thiwand1@yopmail.com");
		login.txtPassword.sendKeys("Nuwan@123");
		login.btnLogin.click();
		Thread.sleep(6000);
		client.searchUser("Taraka Customer");
		Thread.sleep(8000);
		client.updatePhoneNumber("07122900900");
		client.updateAdress("No5,Galle Rd,Galle");
		client.updateSuburb("Galle");
		client.updateState("Southern");
		client.clickUpdate();
}
}