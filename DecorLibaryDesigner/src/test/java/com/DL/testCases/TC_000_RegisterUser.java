package com.DL.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DL.pageObjects.BaseClass;
import com.DL.pageObjects.RegisterPage;

public class TC_000_RegisterUser extends BaseClass {

	RegisterPage regPage;

	@Test
	public void RegisterUser() throws InterruptedException, InvalidElementStateException {
		regPage = new RegisterPage(driver);
		regPage.btnRegister.click();
		Thread.sleep(3000);
		regPage.txtFirstName.sendKeys("Auto ");
		regPage.txtlastName.sendKeys("Designer");
		regPage.txtABN.sendKeys("14481004861");
		Thread.sleep(6000);
		regPage.CompanyName.click();
		Thread.sleep(3000);
		regPage.CompanyNameSelect.click();
		regPage.txtemail.sendKeys("autodesigner77@yopmail.com");
		regPage.txtaddress.sendKeys("72 Hart Street,OMADALE,New South Wales,2337");
		regPage.txtsuburb.sendKeys("Galle Suburb");
		regPage.txtstate.sendKeys("Test State");
		regPage.txtPostalCode.sendKeys("7788");
		regPage.txtwebsite.sendKeys("www.auto.com");
		regPage.txtinsta.sendKeys("@autod");
		Thread.sleep(3000);
		regPage.txtpassword.click();
		regPage.txtpassword.clear();
		Thread.sleep(2000);
		regPage.txtpassword.sendKeys("Auto@123");
		Thread.sleep(2000);
		regPage.txtconfpassword.sendKeys("Auto@123");
		Thread.sleep(3000);
		regPage.btnNext.click();
		Thread.sleep(6000);
		// Actions action = new Actions(driver);
		// action.contextClick(regPage.txtCardNumber);
		// action.moveToElement(regPage.txtCardNumber).sendKeys("55555555").build().perform();
		regPage.btnmonthly.click();
		Thread.sleep(6000);
		//driver.findElement(By.cssSelector("div.CardNumberField-input-wrapper > span > input"));
		//System.out.println(regPage.txtCardNumber.getText());
		// Method 1: using send keys
		regPage.txtCardNumber.clear();
		regPage.txtCardNumber.sendKeys("4242 4242 4242 4242");

		// Method 2: using waits
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.elementToBeClickable(regPage.txtCardNumber)).sendKeys("4242
		// 4242 4242 4242");

		// Method 3: using Action
		/*
		 * 
		 * WebElement element = regPage.txtCardNumber; Actions action1 = new
		 * Actions(driver); action1.moveToElement(element).click().perform();
		 * Thread.sleep(6000); action1.sendKeys("4242 4242 4242 4242");
		 * 
		 */
		
	//	new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-user-registration/div/div/div[2]/div/form/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[1]/div/div"))).click();
      //  driver.findElement(By.xpath("/html/body/app-root/app-user-registration/div/div/div[2]/div/form/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[1]/div/div")).click();
      //  driver.findElement(By.xpath("/html/body/app-root/app-user-registration/div/div/div[2]/div/form/div/div/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[1]/div/div")).sendKeys("4242 4242 4242 4242");;

        
        // Method 4: using Action
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	 //   js.executeScript("[div.CardNumberField-input-wrapper > span > input].value='99000'");
		regPage.txtpromocode.click();
		
	  //  JavascriptExecutor js = (JavascriptExecutor) driver;
	  //  js.executeScript(
	  //          "return document.querySelector('#root > form > span:nth-child(4) > div > div.CardNumberField-input-wrapper > span > input').value='66778888'");
	           
	    
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].value='11/22'", regPage.txtexpDate);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", regPage.chkBox);

		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(regPage.CVC)).sendKeys("123");
		 // This  will scroll down the page by  1000 pixel vertical		
      //  js.executeScript("window.scrollBy(0,1000)");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(regPage.btnSubmit)).click();
	    
	}

}
