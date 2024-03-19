package com.selenium.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoTooltip {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement cart = driver.findElement(By.className("cart-label"));
		
		Actions ac = new Actions(driver); // actions is class orinterface
//		actions or action class?
		ac.moveToElement(cart).build().perform();
		boolean x = driver.findElement(By.xpath("//div[@id='flyout-cart']//div[@class='count']")).isDisplayed();
		System.out.println(x);
		String tip = driver.findElement(By.xpath("//div[@id='flyout-cart']//div[@class='count']")).getText();
		
		System.out.println(tip);
		

	}

}
