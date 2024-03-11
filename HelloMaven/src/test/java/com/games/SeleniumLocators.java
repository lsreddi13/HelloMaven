package com.games;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumLocators {
	WebDriver driver;

//	String url = "https://demo.nopcommerce.com/"; //vars or data memebrs

	String fburl = "https://www.facebook.com/";

	@Test
	public void testSeleniumLocators() {

		driver = new ChromeDriver();

		driver.get(fburl);

		WebElement user_emaiId_ele = driver.findElement(By.id("email"));

		System.out.println(user_emaiId_ele.isDisplayed());

		user_emaiId_ele.sendKeys("sasidahr");

		WebElement user_password_ele = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));

		System.out.println(user_password_ele.isDisplayed());

		user_password_ele.sendKeys("sasidahr");

	}

}
