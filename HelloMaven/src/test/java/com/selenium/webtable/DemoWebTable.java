package com.selenium.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebTable {
	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String bookname = "Speaking JavaScript";
//		driver.findElement(By.xpath("")).getText();

		System.out.println("author name : ");
		// a[contains(text(), 'Designing Evolvable Web APIs with
		// ASP.NET')]/../../../..//div[@class='rt-td'][3]
		// a[contains(text(), 'Git Pocket
		// Guide')]/ancestor::div[@class='rt-tr-group']//div[@class='rt-td'][3]

		String au_name = driver.findElement(By.xpath("//a[contains(text(), '" + bookname
				+ "')]/ancestor::div[@class='rt-tr-group']//div[@class='rt-td'][3]")).getText();

		System.out.println(au_name + " : " + bookname);
	}
}
