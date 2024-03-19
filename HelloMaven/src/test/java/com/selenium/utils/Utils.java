package com.selenium.utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Utils {
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

//	@AfterTest
//	public void closeBrowser() {
//		driver.close();
//
//	}
	
	public void acceptAlert(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void EnterTextiAlert(WebDriver driver, String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
	}
	
	public void cancelAlert(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	
	
	public void waitforClickableElement(WebDriver driver, int time, WebElement el) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}

	public void waitforAlert(WebDriver driver, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.alertIsPresent());
	}
}
