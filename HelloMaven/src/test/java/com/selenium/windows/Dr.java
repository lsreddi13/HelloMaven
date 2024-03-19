package com.selenium.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Dr {

	@Test
	public void test() {

		RemoteWebDriver driver = new ChromeDriver(); // pass
		ChromeDriver dd = new ChromeDriver(); // pass
		WebDriver ddd = new EdgeDriver(); // pass
		
		WebDriver ddd2 = new SafariDriver(); // pass
		WebDriver ddd3 = new (); // pass

		driver.get("https://testng.org/#_annotations");

	}

}
