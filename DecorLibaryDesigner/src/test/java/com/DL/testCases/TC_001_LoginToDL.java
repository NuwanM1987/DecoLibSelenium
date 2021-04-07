package com.DL.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.DashboardPage;
import com.DL.pageObjects.LoginPage;
import com.DL.utilities.XLUtils;



public class TC_001_LoginToDL extends BaseClass {

	LoginPage login;
	DashboardPage dashboard;

	@Test(dataProvider="DT_01LogintoDL")
	//@Test(groups = { "com.DL.testCases.TC_001_LoginToDL" })
	public void login(String UserName,String Password) throws InterruptedException {
		login = new LoginPage(driver);
		login.txtUserName.sendKeys(UserName);
		login.txtPassword.sendKeys(Password);
		login.btnLogin.click();
		Thread.sleep(6000);
		 
		//Assert.assertEquals("test", "test1");
		/*
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//img[@src='https://test-jrc-dl-projectImages.azureedge.net/a205a3dd-c258-49e6-94df-008c38dd3c87.jpg']")));
		
		WebElement el = driver.findElement(By.xpath(
				"//img[@src='https://test-jrc-dl-projectImages.azureedge.net/a205a3dd-c258-49e6-94df-008c38dd3c87.jpg']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", el);
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@class='mat-focus-indicator btn btn-inner margin-left-10 mat-raised-button mat-button-base ng-star-inserted']")));

		
		WebElement el2 = driver.findElement(By.xpath("//*[@class='mat-focus-indicator btn btn-inner margin-left-10 mat-raised-button mat-button-base ng-star-inserted']"));
		//executor.executeScript("arguments[0].click();", el2);
		 if (el2.isDisplayed()) {
			executor.executeScript("arguments[0].click();", el2);
		// createRoom.btnCreateRoomNew.click();
		 }
		 else 
		 createRoom.btnCreateRoom.click();
*/
	}
	
	@DataProvider(name="DT_01LogintoDL")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/Testdata/DT_01LogintoDL.xlsx";
		
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
