package com.DL.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.DL.pageObjects.AddTrackedtimedetailPage;
import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.LoginPage;

public class TC_010_AddTrackedtimedetails extends BaseClass{
	LoginPage login;
	AddTrackedtimedetailPage addtrackedpage;
	@Test
	public void AddTrackedtimedetails() throws InterruptedException 
	{
		login = new LoginPage(driver);
		addtrackedpage = new AddTrackedtimedetailPage(driver);
		
		login.txtUserName.sendKeys("thiwand1@yopmail.com");
		login.txtPassword.sendKeys("Nuwan@123");
		login.btnLogin.click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(addtrackedpage.MenuTimetracker));
		addtrackedpage.MenuTimetracker.click();
		Thread.sleep(4000);
		addtrackedpage.btnStartTimeTracking.click();
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(addtrackedpage.menuManualTimeAdding));
		addtrackedpage.menuManualTimeAdding.click();
		Thread.sleep(4000);
		//new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(addtrackedpage.listProjname));
		addtrackedpage.listProjname.click();
		Thread.sleep(4000);
		addtrackedpage.scrolldownProName();
		Thread.sleep(2000);
		addtrackedpage.listService.click();
		addtrackedpage.inputService.click();
		addtrackedpage.txtServiceName.sendKeys("Design Development");
		Thread.sleep(2000);
		String s = Keys.chord(Keys.CONTROL, "a");
		addtrackedpage.txthourlyrate.sendKeys(s);
		addtrackedpage.txthourlyrate.sendKeys("10.5");
		String s1 = Keys.chord(Keys.CONTROL, "a");
		addtrackedpage.txtDate.sendKeys(s1);
        addtrackedpage.txtDate.sendKeys("6/26/2021");
        addtrackedpage.toggleBillable.click();
        addtrackedpage.txtDescription.sendKeys("Des Added");
        String s2 = Keys.chord(Keys.CONTROL, "a");
		addtrackedpage.txtTimer.sendKeys(s2);
        addtrackedpage.txtTimer.sendKeys("2");
        addtrackedpage.btnAddTime.click();
        
		
	}
}
