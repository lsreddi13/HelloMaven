package com.hellomaven.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo {

	@Test()
	public void fbTest1() {
		WebDriver driver = new FirefoxDriver();
		System.out.println(Thread.currentThread().getName());
		driver.get("http://www.fb.com");
		System.out.println(driver.getTitle());

	}
	
	@Test()
	public void nopcommerceTest() {
		WebDriver driver = new ChromeDriver();
		System.out.println(Thread.currentThread().getName());
		driver.get("https://demo.nopcommerce.com");
		System.out.println(driver.getTitle());

	}

}
