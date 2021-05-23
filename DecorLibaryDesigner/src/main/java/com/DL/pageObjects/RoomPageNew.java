package com.DL.pageObjects;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DL.utilities.ReadConfig;

public class RoomPageNew {
ReadConfig readconfig = new ReadConfig();	
WebDriver driver;

By addRoom = By.className("mat-focus-indicator btn btn-inner margin-left-10 mat-raised-button mat-button-base ng-star-inserted");

public RoomPageNew(WebDriver driver){
    this.driver = driver;

}

public void selectProject() throws InterruptedException, IOException{
	
	// READ EXCEL
	//Create an object of File class to open xlsx file
	String path ="C:\\Users\\NuwanMaduranga\\git\\DecoLibSelenium\\\\DecorLibaryDesigner\\Testdata\\DT_02CreateProject.xlsx";
	//File file = new File("C:\\Users\\NuwanMaduranga\\git\\DecoLibSelenium\\DecorLibaryDesigner\\Testdata\\DT_02CreateProject.xls");

	//Create an object of FileInputStream class to read excel file
	//FileInputStream inputStream = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File(path)));
	//Creating workbook instance that refers to .xls file
	//HSSFWorkbook wb=new HSSFWorkbook(inputStream);

	//Creating a Sheet object using the sheet Name
	XSSFSheet sheet=wb.getSheet("Sheet1");

	//Create a row object to retrieve row at index 1
	XSSFRow row2=sheet.getRow(1);

	//Create a cell object to retreive cell at index 5
	XSSFCell cell=row2.getCell(7);

	//Get the address in a variable
	String PrName= cell.getStringCellValue();

	System.out.println(PrName);
	//By btnSelectProject1 = By.xpath("//mat-card-title[contains(text(),'ProjectJRCT5')]");
	By btnSelectProject = By.xpath("//mat-card-title[contains(text(),'"+PrName+"')]");
 driver.findElement(btnSelectProject).click();

}

public void clickAddRoom() {
		
	new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(
			"//span[@class='mat-button-wrapper' and contains(text(),' + Add room ')]")));
		WebElement el2 = driver.findElement(By.xpath("//span[@class='mat-button-wrapper' and contains(text(),' + Add room ')]"));
		el2.click();
}

public void selectrooms() {
	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='https://prod-jrc-dl-roomtypeImages.azureedge.net/DiningRoom.svg']")));
	driver.findElement(By.xpath("//img[@src='https://prod-jrc-dl-roomtypeImages.azureedge.net/DiningRoom.svg']")).click();
	
	}

public void submitAddroom() {
	driver.findElement(By.xpath("//*[@class='mat-focus-indicator btn btn-inner mat-raised-button mat-button-base']")).click();
}

public void ShoppingList() {
	driver.findElement(By.xpath("//*[@src='../../../../../../assets/images/stepper-images/icon-1.svg' ]")).click();
}




}
