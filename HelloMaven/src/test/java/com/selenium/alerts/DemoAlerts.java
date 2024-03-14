package com.selenium.alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.utils.Utils;

public class DemoAlerts extends Utils {
	

	

//	@BeforeMethod
//	public void setUp() {
//		driver = new ChromeDriver();
//		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//	}
//
//	@AfterMethod
//	public void closeBrowser() {
//		driver.close();
//
//	}

	@Test(priority = 1, enabled = true)
	public void testSimpleAlerts() {

		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		waitforClickableElement(driver, 5, simpleAlert);
		simpleAlert.click();
		waitforAlert(driver, 5);
		acceptAlert(driver);

	}

	@Test(priority = 2, enabled = true)
	public void testConfirmationAlertsAccept() {
		WebElement confirmationAlert = driver.findElement(By.id("confirmButton"));
		waitforClickableElement(driver, 5, confirmationAlert);
		confirmationAlert.click();
		waitforAlert(driver, 5);
		acceptAlert(driver);
		String result = driver.findElement(By.id("confirmResult")).getText();
		Assert.assertEquals(result, "You selected Ok", "expected text doest not same.");

	}

	@Test(priority = 3, enabled = true)
	public void testConfirmationAlertsDismiss() throws InterruptedException {

		WebElement confirmationAlert = driver.findElement(By.id("confirmButton"));
		waitforClickableElement(driver, 5, confirmationAlert);
		confirmationAlert.click();
		waitforAlert(driver, 5);
		cancelAlert(driver);
		String result = driver.findElement(By.id("confirmResult")).getText();
		Assert.assertEquals(result, "You selected Cancel", "expected text doest not same.");

	}

	@Test(enabled = true)
	public void testPromptAlertsAccept() {

		String alertText = "Sasidhar";
		WebElement promptAlert = driver.findElement(By.id("promtButton"));
		waitforClickableElement(driver, 5, promptAlert);
		promptAlert.click();
		waitforAlert(driver, 5);
		EnterTextiAlert(driver, alertText);
		acceptAlert(driver);
		String result = driver.findElement(By.id("promptResult")).getText();
		Assert.assertEquals(result, "You entered " + alertText, "expected text doest not same.");

	}

}
