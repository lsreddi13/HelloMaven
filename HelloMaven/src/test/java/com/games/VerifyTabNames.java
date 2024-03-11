package com.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTabNames {
//what you are doing in this class, what is your intention.
	@Test(enabled = false)
	public void testTabNames() {
		WebDriver driver = new ChromeDriver();
		// launching applicaiton
		driver.get("https://demo.nopcommerce.com/");

		// exp list of tab names
		List<String> expTabNames = new ArrayList<>(Arrays.asList("Computers", "Electronics", "Apparel",
				"Digital downloads", "Books", "Jewelry", "Gift Cards"));
		List<String> actTabNames = new ArrayList<>();

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));

		System.out.println(list.size());

		for (WebElement e : list) {

			actTabNames.add(e.getText());
		}

		Assert.assertEquals(actTabNames, expTabNames);

		/*
		 * String expTab = "Computers\r\n" + "Electronics\r\n" + "Apparel\r\n" +
		 * "Digital downloads\r\n" + "Books\r\n" + "Jewelry\r\n" + "Gift Cards";
		 * 
		 * System.out.println("this is expected string : " + expTab);
		 * 
		 * // webelement WebElement listTabNames =
		 * driver.findElement(By.className("top-menu"));
		 * 
		 * // checkign the list is displayed or not boolean x =
		 * listTabNames.isDisplayed();
		 * 
		 * // priting the value System.out.println(x);
		 * 
		 * // print tab names String str = listTabNames.getText();
		 * System.out.println("this is actual string : " + str);
		 * 
		 * Assert.assertEquals(str, expTab, "expected tab names are not displayed.");
		 */

	}

	@Test
	public void test2() {
		WebDriver driver = new ChromeDriver();
		// launching applicaiton
		driver.get("https://demo.nopcommerce.com/");
		
		
		List<String> expTabNames = new ArrayList<>(Arrays.asList("Register", "Log in", "Wishlist",
				"Shopping cart"));
		
	
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='header-links']/ul/li"));

		System.out.println("Number of links : "+li.size());
		List<String> li2 = new ArrayList<>();
		for(WebElement x : li) {
			
			String s = x.getText();
			System.out.println(s);
			li2.add(s);
		}
		
		
		System.out.println("Print list : " + li2);
		Assert.assertEquals(li2, expTabNames, "links count does not matched.");
		
		
		
		
	}
}
