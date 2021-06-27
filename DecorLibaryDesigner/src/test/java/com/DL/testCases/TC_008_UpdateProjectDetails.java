package com.DL.testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.LoginPage;
import com.DL.pageObjects.ProjectPage;
import com.DL.pageObjects.RoomPageNew;

public class TC_008_UpdateProjectDetails extends BaseClass{
	RoomPageNew createRoomn;
	LoginPage login;
	ProjectPage prpage;
	@Test
public void updateProjectDetails() throws Exception, IOException {
	login = new LoginPage(driver);
	createRoomn = new RoomPageNew(driver);
	prpage= new ProjectPage(driver);
	
	login.txtUserName.sendKeys("thiwand1@yopmail.com");
	login.txtPassword.sendKeys("Nuwan@123");
	login.btnLogin.click();
	Thread.sleep(8000);
	createRoomn.selectProject();
	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(prpage.btnProjView));
	prpage.btnProjView.click();
	Thread.sleep(8000);
	prpage.txtClname.clear();
	prpage.txtClname.sendKeys("Taraka Customer_Updated new");
	prpage.txtMob.clear();
	prpage.txtMob.sendKeys("0782221111");
	prpage.txtAddrs.clear();
	prpage.txtAddrs.sendKeys("26 Sycamore Crs, Hawthorndene, SA 5051");
	prpage.tabProjDet.click();
	Thread.sleep(4000);
	//prpage.txtPrjName.clear();
	//prpage.txtPrjName.sendKeys("Project 10 Updated");
	prpage.txtPrjDesc.clear();
	prpage.txtPrjDesc.sendKeys("new descrption");
	Thread.sleep(3000);
	prpage.btnUpdate.click();
	Thread.sleep(3000);
	//String updateSucccessmsg= prpage.msgSuccessUpdate.getText();
	//System.out.println("SuccMsg:"+updateSucccessmsg);
	//Assert.assertEquals("", "");
}
}