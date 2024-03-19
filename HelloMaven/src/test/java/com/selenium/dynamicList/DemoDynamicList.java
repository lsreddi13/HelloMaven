package com.selenium.dynamicList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoDynamicList {
	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		// click select value list box
		driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
		Thread.sleep(1000);

		List<WebElement> childs = driver.findElements(By.xpath("//div[@id='withOptGroup']/child::*"));
		System.out.println("yes we got it.");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//b[contains(text(), 'Standard multi select')]"))).build()
				.perform();
		Thread.sleep(2000);
		for (WebElement e : childs) {

			if (e.getAttribute("class").endsWith("css-26l3qy-menu")) {
				List<WebElement> child2 = driver.findElements(
						By.xpath("//div[@id='withOptGroup']/div[contains(@class, 'css-26l3qy-menu')]//child::*"));
				for (WebElement e2 : child2) {
					if (e2.getText().equalsIgnoreCase("Another root option")) {

						e2.click();
						break;

					}
				}
			}
		}

	}

}
