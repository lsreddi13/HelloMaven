package com.drivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoDrivermethods {

	@Test
	public void testDriverMethods() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
	//what are the driver methods?
		
		//
		
	
		
		
//		driver.manage().window().fullscreen();
		
//		what is the diff b/w driver.get  and driver.navigate.to
		
		
		// driver.close and driver.quit
		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);

//		driver.navigate().to("https://www.amazon.in/s?k=oneplus&rh=n%3A1389401031&ref=nb_sb_noss");
//
//		String pageTitle2 = driver.getTitle();
//
//		System.out.println(pageTitle2);
		
		String pageURL = driver.getCurrentUrl();
		System.out.println("page url : "+pageURL);
		
		String windowID = driver.getWindowHandle();
		System.out.println("WindowID : " + windowID);
		
		
		Set<String> windowIDs = driver.getWindowHandles();
		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
//		
		
		
//		what is the return type of windowHandle ?
//		what is the return type of windowHandles ?
		
		//what is the diff between set and list
//		or
		//why are you using set why don;t you use list ? 
		
//		driver.close();
		
//		driver.quit();
		
		
		
		

	}

}
