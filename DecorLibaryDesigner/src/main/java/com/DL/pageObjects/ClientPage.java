package com.DL.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPage {

	protected WebDriver driver;
	
	public ClientPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	private By clientTab = By.xpath("//*[@href='/designer/clients']");
	private By searchBox = By.xpath("//*[@placeholder='Search clients here']");
	private By searchreslt = By.xpath("");
	private By btnEdit = By.xpath("//*[@class='view-clnt-btn edit-btn']");
	private By txtPhoneNumber = By.xpath("//*[@formcontrolname='mobileNo']");
	private By txtAdress = By.xpath("//*[@formcontrolname='address']");
	private By txtSuburb = By.xpath("//*[@formcontrolname='suburb']");
	private By txtState = By.xpath("//*[@formcontrolname='state']");
	private By btnUpdate = By.xpath("//*[contains(text(),'Update')]");
	
	/**
	    * Search user
	    * @param customername
	 * @throws InterruptedException 
	    
	    */
	
	public void searchUser(String customername) throws InterruptedException {
		driver.findElement(clientTab).click();
		driver.findElement(searchBox).sendKeys(customername);
		Thread.sleep(5000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.textToBePresentInElementLocated(searchreslt,customername));
		driver.findElement(btnEdit).click();
	}
	
	public void updatePhoneNumber(String phoneNumber) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(txtPhoneNumber).clear();
		driver.findElement(txtPhoneNumber).sendKeys(phoneNumber);
	}
	
	public void updateAdress(String address) {
		driver.findElement(txtAdress).clear();
		driver.findElement(txtAdress).sendKeys(address);
	}
	
	public void updateSuburb(String suburb) {
		driver.findElement(txtSuburb).clear();
		driver.findElement(txtSuburb).sendKeys(suburb);
	}
	
	public void updateState(String state) {
		driver.findElement(txtState).clear();
		driver.findElement(txtState).sendKeys(state);
	}
	 public void clickUpdate() throws InterruptedException {
		 driver.findElement(btnUpdate).click();
		 Thread.sleep(5000);
	 }
	
}
