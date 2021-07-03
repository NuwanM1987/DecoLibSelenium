package com.DL.testCases;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.ProjectPage;
import com.DL.pageObjects.DashboardPage;
import com.DL.utilities.XLUtils;

public class TC_002_CreateProject extends BaseClass {
	 Random rand = new Random();
	 int rand_int1 = rand.nextInt(1000);
	 
	//@Test(dependsOnGroups = { "com.DL.testCases.TC_001_LoginToDL" }, dataProvider = "")
	@Test(dataProvider="DT_02CreateProject")
	public void createProject(String CustomerName,String CustomerEmail,String MobNo,String Address,String Suburb,String State,String PostalCode,String ProjectName,String Description) throws InterruptedException {
		// LoginPage login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		ProjectPage projectpage = new ProjectPage(driver);
		Thread.sleep(8000);
		dashboard.clickCreateprojectBtn();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(projectpage.txtClientName));
		projectpage.txtClientName.sendKeys(CustomerName);
		projectpage.txtClientEmail.sendKeys(CustomerEmail);
		projectpage.txtMobNo.sendKeys(MobNo+rand_int1);
		projectpage.txtAddress.sendKeys(Address);
		projectpage.txtSuburb.sendKeys(Suburb);
		projectpage.txtState.sendKeys(State);
		projectpage.txtPostalCode.sendKeys(PostalCode);
		Thread.sleep(4000);
		// new WebDriverWait(driver,
		// 30).until(ExpectedConditions.elementToBeClickable(projectpage.btnAddClient));
		projectpage.btnAddClient.click();
		Thread.sleep(4000);
		projectpage.txtProName.sendKeys(ProjectName);
		projectpage.txtProDescription.sendKeys(Description);
		// projectpage.btnUpload.sendKeys("D:\\NuwanM\\eclipseWorkPlace\\DecorLibaryDesigner\\images\\project-management-6.jpg");

		Thread.sleep(4000);
		// Drag & Drop
		// locate the drop area
		WebElement droparea = driver
				.findElement(By.xpath("//div[@class='well my-drop-zone text-center padding-tb-30']"));
		// drop the file
		DropFile(new File("C:\\Users\\NuwanMaduranga\\git\\DecoLibSelenium\\DecorLibaryDesigner\\images\\project-management-6.jpg"),
				droparea, 0, 0);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(projectpage.btnAddProject));
		projectpage.btnAddProject.click();
	
		Thread.sleep(7000);
		//logout();
	}
	@DataProvider(name="DT_02CreateProject")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/Testdata/DT_02CreateProject.xlsx";
		
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