package com.selenium.pageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoPageSource {

	@Test
	public void testPageSource() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/search-medicines/Pediasure");

		boolean result = driver.getPageSource().contains("membership");
		System.out.println(result);
	}
}
