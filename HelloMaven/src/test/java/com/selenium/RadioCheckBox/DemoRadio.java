package com.selenium.RadioCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoRadio {

	@Test
	public void testPageSource() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// click create new account link
		driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_0')]")).click();
		Thread.sleep(3000);
		WebElement femaleRadio = driver.findElement(By.xpath("//input[starts-with(@id, 'u_2_4')]"));
		
		boolean result = femaleRadio.isSelected();
		System.out.println(result);
		if(result==false) {
		femaleRadio.click();
		boolean result2 = femaleRadio.isSelected();
		System.out.println(result2);
		}
		else {
			System.out.println("it is already selected.");
		}
		
//		select gender female and verify

	}

}
