package com.games;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTCSTask {
	WebDriver driver;

	String url = "https://ibegin.tcs.com/iBegin/";

//	how many wait methods ? what are they? 

	@Test
	public void testSeleniumLocators() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get(url);
		Thread.sleep(3000);

		/*
		 * WebElement saveJobs_LinkText_ele =
		 * driver.findElement(By.linkText("My Saved Jobs"));
		 * 
		 * saveJobs_LinkText_ele.click(); Thread.sleep(3000); WebElement
		 * searchBtn_xpath_ele = driver .findElement(By.
		 * xpath("//span[text()='Search Jobs']//parent::button[@type='button']"));
		 * searchBtn_xpath_ele.click();
		 */
		
		//area specific list box - 
		//ul[@class='nav-right-links']/li[1]/a
		driver.findElement(By.xpath("//ul[@class='nav-right-links']/li[1]/a")).click();
		
		//ul[@class='collpased-ul countries']
		
//		ul.collpased-ul.countries li ul.contry-groups.top-pad-30 li
		
		List<WebElement> li =  driver.findElements(By.xpath("//ul[@class='collpased-ul countries']/li/ul[@class='contry-groups top-pad-30 ']/li"));
	
		System.out.println(li.size());
		
//		for(WebElement we : li) {
//			System.out.println(we.getText());
//		}
		
		for(int i=0; i<li.size(); i++) {
			
			System.out.println(li.get(i).getText());
		}
		
		

	}

}
