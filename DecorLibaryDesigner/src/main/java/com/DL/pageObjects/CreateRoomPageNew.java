package com.DL.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DL.utilities.ReadConfig;


public class CreateRoomPageNew {
ReadConfig readconfig = new ReadConfig();	
WebDriver driver;
String projectname=readconfig.getProjectName();
By btnSelectProject = By.xpath("//mat-card-title[contains(text(),'"+projectname+"')]");
By btnSelectProject1 = By.xpath("//mat-card-title[contains(text(),'TestAutoNM3')]");

//driver.findElement(By.xpath("//td[normalize-space(text())='"+newUser+"']/a")).click();
//int num =1;
//By btnSelectProject = By.xpath("/html/body/app-root/app-layout/div/div/div[2]/app-designer-dashboard/div/div/div[2]/div["+num+"]/div/mat-card/a/div/img");
//By btnSelectProject = By.cssSelector(".project-cvr-img[_ngcontent-koa-c196] img[_ngcontent-koa-c196]");
By addRoom = By.className("mat-focus-indicator btn btn-inner margin-left-10 mat-raised-button mat-button-base ng-star-inserted");
//By submitAddRoom = By

public CreateRoomPageNew(WebDriver driver){
    this.driver = driver;

}

public void selectProject() throws InterruptedException{
	//Thread.sleep(10000);
//new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeSelected(btnSelectProject));
 driver.findElement(btnSelectProject1).click();

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
	//driver.findElement(By.xpath("//img[@src='https://prod-jrc-dl-roomtypeImages.azureedge.net/MasterBedroom.svg']")).click();

	
}

public void submitAddroom() {
	driver.findElement(By.xpath("//*[@class='mat-focus-indicator btn btn-inner mat-raised-button mat-button-base']")).click();
}

public void ShoppingList() {
	driver.findElement(By.xpath("//*[@src='../../../../../../assets/images/stepper-images/icon-1.svg' ]")).click();
}
//JS executor

// executor.executeScript("arguments[0].click();",el);
/*
 * new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='mat-focus-indicator btn btn-inner margin-left-10 mat-raised-button mat-button-base ng-star-inserted']"))); 
 * WebElement el2 = driver.findElement(By.xpath("//*[@class='mat-focus-indicator btn btn-inner margin-left-10 mat-raised-button mat-button-base ng-star-inserted']" ));
 
 * if (el2.isDisplayed()) { 
 * executor.executeScript("arguments[0].click();",el2);
 * 
 * } else createRoom.btnCreateRoom.click();
 */
}
