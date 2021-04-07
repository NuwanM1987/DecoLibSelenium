package com.DL.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.DL.utilities.ReadConfig;
import com.aventstack.extentreports.utils.FileUtil;

public class BaseClass {
	public static WebDriver driver;
	public WebElement logoutbtn;
	
	ReadConfig readconfig = new ReadConfig();
	
	/*
	@BeforeTest
	public void setup()	
	{	
		System.setProperty("webdriver.chrome.driver", "D://NuwanM//Automation Scripts//WebDriverAutomationCourse//DecorLibrary//src//main//resources//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
      
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("https://test.decorlibrary.com/login");
		 try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	*/
	@BeforeTest
	public void setup()	
	{	
				
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
					
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get(readconfig.getApplicationURL());
	}
		
	
	@SuppressWarnings("deprecation")
	public void DropFile(File filePath, WebElement target, int offsetX, int offsetY) {
	    if(!filePath.exists())
	        throw new WebDriverException("File not found: " + filePath.toString());

	    WebDriver driver = ((RemoteWebElement)target).getWrappedDriver();
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    WebDriverWait wait = new WebDriverWait(driver, 30);

	    
	    String JS_DROP_FILE =
	        "var target = arguments[0]," +
	        "    offsetX = arguments[1]," +
	        "    offsetY = arguments[2]," +
	        "    document = target.ownerDocument || document," +
	        "    window = document.defaultView || window;" +
	        "" +
	        "var input = document.createElement('INPUT');" +
	        "input.type = 'file';" +
	        "input.style.display = 'none';" +
	        "input.onchange = function () {" +
	        "  var rect = target.getBoundingClientRect()," +
	        "      x = rect.left + (offsetX || (rect.width >> 1))," +
	        "      y = rect.top + (offsetY || (rect.height >> 1))," +
	        "      dataTransfer = { files: this.files };" +
	        "" +
	        "  ['dragenter', 'dragover', 'drop'].forEach(function (name) {" +
	        "    var evt = document.createEvent('MouseEvent');" +
	        "    evt.initMouseEvent(name, !0, !0, window, 0, 0, 0, x, y, !1, !1, !1, !1, 0, null);" +
	        "    evt.dataTransfer = dataTransfer;" +
	        "    target.dispatchEvent(evt);" +
	        "  });" +
	        "" +
	        "  setTimeout(function () { document.body.removeChild(input); }, 25);" +
	        "};" +
	        "document.body.appendChild(input);" +
	        "return input;";

	    WebElement input =  (WebElement)jse.executeScript(JS_DROP_FILE, target, offsetX, offsetY);
	    input.sendKeys(filePath.getAbsoluteFile().toString());
	    wait.until(ExpectedConditions.stalenessOf(input));
	    
	    if(WrapsElement.class.isAssignableFrom(input.getClass()))
	    	  driver = ((WrapsDriver)((WrapsElement)input).getWrappedElement()).getWrappedDriver();
	    	else
	    	  driver = ((WrapsDriver)input).getWrappedDriver();
	}
	
	@FindBy(xpath="//input[@type='file']")
	public WebElement btnUpload;
	
	public void logout() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-layout/div/div/app-header/div/div/div/div[2]/span/div/div/a[3]/p")));
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-header/div/div/div/div[2]/span/div/div/a[3]/p")).click();
	}
	


}
