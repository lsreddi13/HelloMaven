package com.games;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/digital-downloads");
		
		driver.get("https://www.fb.com");
	}
	
}
