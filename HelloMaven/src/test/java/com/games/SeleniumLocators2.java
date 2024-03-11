package com.games;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumLocators2 {
	WebDriver driver;

	String url = "https://demo.nopcommerce.com/"; 

	
	@Test
	public void testSeleniumLocators() {

		driver = new ChromeDriver();

		driver.get(url);

		WebElement reg_ele = driver.findElement(By.className("ico-register"));
		System.out.println(reg_ele.isDisplayed());
		
//		reg_ele.click();
		
		
		List<WebElement> li  = driver.findElements(By.tagName("input"));
		
		
		System.out.println(li.size());
		WebElement loing__linkText_ele = driver.findElement(By.linkText("Log in"));
		System.out.println(loing__linkText_ele.isDisplayed());
		
//		loing__linkText_ele.click();
		
		WebElement wishlist__linkText_ele = driver.findElement(By.partialLinkText("Wishli"));
		System.out.println("wishlist displayed : "+wishlist__linkText_ele.isDisplayed());
		
		wishlist__linkText_ele.click();
		
	}

}
