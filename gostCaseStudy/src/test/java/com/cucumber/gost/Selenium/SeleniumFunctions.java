package com.cucumber.gost.Selenium;

import java.io.File;
import java.net.MalformedURLException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.gost.OR.ObjectRepositories;

public class SeleniumFunctions {

	public static WebDriver driver = null;
	public static  Wait<WebDriver> waitVar = null;

	public static String baseURL = "https://ghost.org/";

	
	 public void createDriver() throws MalformedURLException,
	 InterruptedException {
			String[] phantomArgs = new  String[] {
					"--webdriver-loglevel=NONE"
			};
			driver = new FirefoxDriver(); 
			/*DesiredCapabilities cap= DesiredCapabilities.phantomjs();
			cap.setCapability("phantomjs.page.settings.userAgent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/53 (KHTML, like Gecko) Chrome/15.0.87");
			cap.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);

			//File file = new File("./Resources/phantomjs.exe");  
			File file  = new File("./Resources/phantomjs.exe");  
			  if(System.getProperty("os.name").toLowerCase().contains("linux")){
			    file  = new File("./Resources/phantomjs");  
			  }
			System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
			driver = new PhantomJSDriver(cap); */

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.get(baseURL);
			// waitVar = new WebDriverWait(driver, 25); 


			waitVar = new FluentWait<WebDriver>(driver)							
					.withTimeout(30, TimeUnit.SECONDS) 			
					.pollingEvery(5, TimeUnit.SECONDS) 			
					.ignoring(NoSuchElementException.class);
		}
	
	public void teardown() {
		if (driver != null)
			driver.close();
			driver.quit();
	}

	public void ishomepageDisplayed() {

		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.id(ObjectRepositories.BT_Sign_In_On_Home_page)));
		driver.findElement(By.id(ObjectRepositories.BT_Sign_In_On_Home_page)).isDisplayed();

	}

	public void clickSigninLink() {
		driver.findElement((By.id(ObjectRepositories.BT_Sign_In_On_Home_page))).click();
	}

	public void isloginsectionDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.LBL_Ghost)));
		driver.findElement(By.xpath(ObjectRepositories.LBL_Ghost)).isDisplayed();
	}

	public void enterRegisterDetails() {
		
		//Lnk_Register
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.Lnk_Register)));
		driver.findElement(By.xpath(ObjectRepositories.Lnk_Register)).click();
		//TXT_Name
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.TXT_Name)));
		driver.findElement(By.xpath(ObjectRepositories.TXT_Name)).sendKeys("suresh2");
		// Email Adress
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.TXT_EmailAddress)));
		driver.findElement(By.xpath(ObjectRepositories.TXT_EmailAddress)).sendKeys("snapfish.suresh2@gmail.com");
		// Password
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.TXT_Passowrd)));
		driver.findElement(By.xpath(ObjectRepositories.TXT_Passowrd)).sendKeys("sfqatest");
		waitVar.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.BT_Register)));
		driver.findElement((By.xpath(ObjectRepositories.BT_Register))).click();

	}
	public void enterUserNameAndPwd() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.TXT_EmailAddress)));
		driver.findElement(By.xpath(ObjectRepositories.TXT_EmailAddress)).sendKeys("aruna.boddu@valuelabs.com");
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.TXT_Passowrd)));
		driver.findElement(By.xpath(ObjectRepositories.TXT_Passowrd)).sendKeys("Chinnu@25");
		waitVar.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.BT_Sign_In_On_LoginIn_Page)));
		driver.findElement((By.xpath(ObjectRepositories.BT_Sign_In_On_LoginIn_Page))).click();

	}

	public void isSuccessfulLoginDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.LBL_Head_Content)));
		driver.findElement((By.xpath(ObjectRepositories.LBL_Head_Content))).isDisplayed();
	}

	public void logOut() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ObjectRepositories.BT_Sign_Out)));
		driver.findElement((By.xpath(ObjectRepositories.BT_Sign_Out))).click();

	}

}
