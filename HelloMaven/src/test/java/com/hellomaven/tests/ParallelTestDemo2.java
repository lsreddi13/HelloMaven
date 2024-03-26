package com.hellomaven.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo2 {
	@Test()
	public void nopcommerceTest() {
		WebDriver driver = new ChromeDriver();
		System.out.println(Thread.currentThread().getName());
		driver.get("https://demo.nopcommerce.com");
		System.out.println(driver.getTitle());

	}
}
