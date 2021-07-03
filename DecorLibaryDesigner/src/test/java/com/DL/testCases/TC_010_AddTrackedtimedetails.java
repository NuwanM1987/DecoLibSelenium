package com.DL.testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DL.pageObjects.AddTrackedtimedetailPage;
import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.LoginPage;
import com.DL.utilities.XLUtils;

public class TC_010_AddTrackedtimedetails extends BaseClass {
	LoginPage login;
	AddTrackedtimedetailPage addtrackedpage;

	@Test(dataProvider ="DT_06TimeTracker")
	public void AddTrackedtimedetails(String ServiceName,String HourlyRate,String Date,String Description,String Timer) throws InterruptedException {
		//login = new LoginPage(driver);
		addtrackedpage = new AddTrackedtimedetailPage(driver);

		//login.txtUserName.sendKeys("thiwand1@yopmail.com");
		//login.txtPassword.sendKeys("Nuwan@123");
		//login.btnLogin.click();
	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(addtrackedpage.MenuTimetracker));
		
		addtrackedpage.MenuTimetracker.click();
		Thread.sleep(4000);
		addtrackedpage.btnStartTimeTracking.click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.elementToBeClickable(addtrackedpage.menuManualTimeAdding));
		addtrackedpage.menuManualTimeAdding.click();
		Thread.sleep(4000);
		// new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(addtrackedpage.listProjname));
		addtrackedpage.listProjname.click();
		Thread.sleep(4000);
		addtrackedpage.scrolldownProName();
		Thread.sleep(2000);
		addtrackedpage.listService.click();
		addtrackedpage.inputService.click();
		//addtrackedpage.txtServiceName.sendKeys(ServiceName);
		Thread.sleep(2000);
		String s = Keys.chord(Keys.CONTROL, "a");
		addtrackedpage.txthourlyrate.sendKeys(s);
		addtrackedpage.txthourlyrate.sendKeys(HourlyRate);
		String s1 = Keys.chord(Keys.CONTROL, "a");
		addtrackedpage.txtDate.sendKeys(s1);
		addtrackedpage.txtDate.sendKeys(Date);
		addtrackedpage.toggleBillable.click();
		addtrackedpage.txtDescription.sendKeys(Description);
		String s2 = Keys.chord(Keys.CONTROL, "a");
		addtrackedpage.txtTimer.sendKeys(s2);
		addtrackedpage.txtTimer.sendKeys(Timer);
		addtrackedpage.btnAddTime.click();

	}

	@DataProvider(name = "DT_06TimeTracker")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/Testdata/DT_06TimeTracker.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String data[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) 
		{
			for (int j = 0; j < colcount; j++) 
			{
				data[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}

		}
		return data;
	}
}
