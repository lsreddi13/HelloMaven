package com.selenium.wait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.utils.Utils;

public class DemoFluentWait extends Utils{

	@Test
	public void testFluentWait() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://continentalhospitals.com/request-appointment/");
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();

		//explicitly wait method
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait11.until(ExpectedConditions.alertIsPresent());
		
		//fluentwait method.
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(13))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(ElementNotInteractableException.class);

		wait2.until(ExpectedConditions.alertIsPresent());
		
	

		driver.switchTo().alert().accept();

	}
}
