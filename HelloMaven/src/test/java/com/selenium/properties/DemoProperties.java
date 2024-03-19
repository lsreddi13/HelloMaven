package com.selenium.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class DemoProperties {

	@Test
	public void test() throws IOException {

		FileInputStream fis = new FileInputStream(".//test.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		ChromiumDriver driver = new ChromeDriver();
		String pageURL = prop.getProperty("url");
		String u_name = prop.getProperty("username");
		String u_password = prop.getProperty("password");
		
		
		
		System.out.println(pageURL);
		System.out.println(u_name);
		System.out.println(u_password);
		driver.get(pageURL);
		
		

		

	}
}
