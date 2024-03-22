package com.hellomaven.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Properties prop;

	public static WebDriver driver;

	public Base() throws IOException {
		FileInputStream fis = new FileInputStream(new File("D:\\myworkspace\\HelloMaven\\test.properties"));
		prop = new Properties();
		prop.load(fis);
	}

	public static void init() {
		driver = new ChromeDriver();

	}
	
	public void pageRefresh() {
		driver.navigate().refresh();
	}

}
