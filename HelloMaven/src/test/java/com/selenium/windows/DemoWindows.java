package com.selenium.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.utils.Utils;

public class DemoWindows extends Utils {

	@Test
	public void testWindows() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/browser-windows");
//		String s = driver.getCurrentUrl();
//		System.out.println(s);

		String windowname = driver.getWindowHandle();
		// What is the return type of getwindowhandle ? -> String
		System.out.println("Current window id : " + windowname);

		driver.findElement(By.id("windowButton")).click();
		driver.switchTo().window(windowname);
		driver.findElement(By.id("windowButton")).click();
		driver.switchTo().window(windowname);
		driver.findElement(By.id("windowButton")).click();
		driver.switchTo().window(windowname);
		driver.findElement(By.id("windowButton")).click();

		Set<String> windows = driver.getWindowHandles();

		// What is the return type of getwindowhandles ? -> set

		for (String window : windows) {
			System.out.println("windows id : " + window);
			if (window.equals(windowname)) {
				System.out.println("this is parent");
			} else {
				System.out.println("this is child window");
				driver.switchTo().window(window);

				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());

				String h1Text = driver.findElement(By.xpath("//h1")).getText();

				String h1Tag = driver.findElement(By.tagName("h1")).getText();

				System.out.println("h1 tag : " + h1Tag);
				System.out.println("h1Text : " + h1Text);
				Thread.sleep(5000);
				driver.close();

			}
		}
		driver.switchTo().window(windowname);

	}
	
	
	

}
