package com.Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSubmit {
	
	@Test
	public void testSubmit() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stackoverflow.com/users/signup?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f");
		
		//enter name
		WebElement we = driver.findElement(By.id("email"));
		System.out.println(we.getTagName());
		
		System.out.println(we.getAttribute("maxlength"));
		
		we.sendKeys("helloStack");
		
		
		//enter pwd
		driver.findElement(By.id("password")).sendKeys("helloStack123");
		
		//use submit instead of clicking singup button
		driver.findElement(By.id("password")).submit();
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("helloStack@gmail.com");
		
	}

}
