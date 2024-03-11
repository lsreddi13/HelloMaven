package com.selenium.listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoList {

	@Test(enabled = false)
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://continentalhospitals.com/request-appointment/");
		Thread.sleep(2000);
		WebElement selectSpeciality = driver
				.findElement(By.xpath("//section//form[@id='appointment-form']//select[@name='speciality_id']"));

		// select[@id='app_spec_id']

		Select s = new Select(selectSpeciality);

		s.selectByIndex(1);
		Thread.sleep(2000);

		s.selectByValue("3");
		Thread.sleep(2000);
		s.selectByVisibleText("Psychology ");

		Thread.sleep(2000);

	}

	@Test(enabled = false)
	public void test2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://continentalhospitals.com/request-appointment/");
		Thread.sleep(2000);
		WebElement selectSpeciality = driver
				.findElement(By.xpath("//section//form[@id='appointment-form']//select[@name='speciality_id']"));
		selectList(driver, 8, selectSpeciality);

		Thread.sleep(2000);

	}

	@Test(enabled = false)
	public void test3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://continentalhospitals.com/request-appointment/");
		Thread.sleep(2000);
		WebElement selectSpeciality = driver
				.findElement(By.xpath("//section//form[@id='appointment-form']//select[@name='speciality_id']"));
		selectList(driver, "Cosmetic Skin Care ", selectSpeciality);

		Thread.sleep(2000);

	}

	@Test
	public void test4() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://continentalhospitals.com/request-appointment/");
		Thread.sleep(2000);
		WebElement selectSpeciality = driver
				.findElement(By.xpath("//section//form[@id='appointment-form']//select[@name='speciality_id']"));
		selectList(driver, selectSpeciality, "14");

		Thread.sleep(2000);

	}

	public void selectList(WebDriver driver, int index, WebElement we) {

		Select s = new Select(we);

		s.selectByIndex(index);

	}

	public void selectList(WebDriver driver, String text, WebElement we) {

		Select s = new Select(we);

		s.selectByVisibleText(text);

	}

	public void selectList(WebDriver driver, WebElement we, String value) {

		Select s = new Select(we);

		s.selectByValue(value);

	}

}
