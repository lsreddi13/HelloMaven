package com.selenium.wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoimplicitWaits {
	@Test
	public void testWait() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));// version 4 onwards.
		driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_0')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		
		driver.findElement(By.name("firstname")).sendKeys("sasidhar");
	}
}
