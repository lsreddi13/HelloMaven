package com.selenium.RadioCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoCheckBox {

	WebDriver driver;

	@Test(enabled = false)
	public void verifyCehckBoxStatus() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/search-medicines/Pediasure");

		Thread.sleep(3000);

		WebElement category_checkbox = driver.findElement(
				By.xpath("//div[@class='FilterSearchMedicine_filterMain__9guDx']//label[text()='Bandage']/../input"));
		boolean result0 = category_checkbox.isSelected();
		System.out.println(result0);
		category_checkbox.click();
		Thread.sleep(3000);
		boolean result1 = category_checkbox.isSelected();
		System.out.println(result1);

	}

	@Test
	public void selectCheckBox() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/search-medicines/Pediasure");

		Thread.sleep(1000);
		selectCheckbox(driver, "Buds");
		selectCheckbox(driver, "Bar");
		selectCheckbox(driver, "Capsule");

		System.out.println("Buds checkbox status : " + verifyCheckBoxIsSelected(driver, "Buds"));
		System.out.println("Bar checkbox status : " + verifyCheckBoxIsSelected(driver, "Bar"));

		System.out.println("Capsule checkbox status : " + verifyCheckBoxIsSelected(driver, "Capsule"));
		System.out.println("Cleanser checkbox status : " + verifyCheckBoxIsSelected(driver, "Cleanser"));

	}

	public void selectCheckbox(WebDriver driver, String checkBoxName) throws InterruptedException {
		WebElement category_checkbox = driver
				.findElement(By.xpath("//div[@class='FilterSearchMedicine_filterMain__9guDx']//label[text()='"
						+ checkBoxName + "']/../input"));

		category_checkbox.click();

		Thread.sleep(1000);
	}

	public boolean verifyCheckBoxIsSelected(WebDriver driver, String checkBoxName) {
		boolean result = true;
		WebElement category_checkbox = driver
				.findElement(By.xpath("//div[@class='FilterSearchMedicine_filterMain__9guDx']//label[text()='"
						+ checkBoxName + "']/../input"));

		result = category_checkbox.isSelected();

		return result;
	}

}
