package com.selenium.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.utils.Utils;

public class DemoAlertExplicitWait extends Utils {

	String browser = "firefox";

	@Test
	public void testAlertsWithExplicitWait() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		// maximize widnow
//		driver.manage().window().maximize();
//		// implicitly wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// launching applciaiton
		driver.get("https://demoqa.com/alerts");

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("timerAlertButton"))).build().perform();

		// click on alert
		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(6000);
		waitforAlert(driver, 5);
		acceptAlert(driver);
//		WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(5));
//		x.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();

		// fluent wait

	}
}
