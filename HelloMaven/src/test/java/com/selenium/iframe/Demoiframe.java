package com.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoiframe {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(3000);
		String bodyText = driver.findElement(By.className("modal-body")).getText();
		System.out.println(bodyText);
		
		driver.findElement(By.id("closeSmallModal")).click();
		
		
	}

}
