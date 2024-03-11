package com.Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebelementsMethods {

	@Test
	public void testIIItSite() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iiit.ac.in/admissions/");

		WebElement we = driver.findElement(By.cssSelector("div.navbar-container > ul.navbar >li:nth-child(2) > a"));

		

		System.out.println("getText : "+ we.getText());

//		tag?
		System.out.println( "getTagName : "+we.getTagName());
		
		System.out.println("getAttribute : href - "+we.getAttribute("href"));
		
		System.out.println("getSize : "+we.getSize());
		
		System.out.println("getRect : "+we.getRect());
		
		System.out.println("getLocation : "+we.getLocation());
		
		System.out.println("getCssValue : "+we.getCssValue("color"));
		
		System.out.println("isDisplayed :" +we.isDisplayed());
		
		System.out.println("isEnabled : "+we.isEnabled());
		
		System.out.println("isSelected : "+we.isSelected());
		
		
		
		
		

	}

}
