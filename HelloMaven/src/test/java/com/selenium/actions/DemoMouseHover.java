package com.selenium.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoMouseHover {

	@Test
	public void testMouseHover() throws InterruptedException {
		List<String> patientList = new ArrayList<>();

		List<String> exp_p = new ArrayList<>(Arrays.asList("Find a Doctor", "Book Appointment", "Patient information",
				"Visitor Guide", "Patient Reviews", "Adult Vaccination", "Blog", "Diseases and Conditions"));

		List<String> corporateList = new ArrayList<>();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://continentalhospitals.com/request-appointment/");

		Thread.sleep(2000);
		patientList = t(driver, "For Patients");
		corporateList = t(driver, "Corporate");

		// For Patients
		// Corporate
		System.out.println("patientList : " + patientList);
		Assert.assertEquals(patientList, exp_p, "expected list is not same.");
		System.out.println("corporateList : " + corporateList);
	}

	public List<String> t(WebDriver driver, String text) {
		List<String> a = new ArrayList<>();
		WebElement corporate_ele = driver.findElement(
				By.xpath("//ul[@class='site-menu main-menu js-clone-nav ml-auto d-none d-lg-block']/li/a[text()='"
						+ text + "']"));

		moveToWebElement(driver, corporate_ele);

		List<WebElement> li = driver.findElements(
				By.xpath("//ul[@class='site-menu main-menu js-clone-nav ml-auto d-none d-lg-block']/li/a[text()='"
						+ text + "']/following::ul[1]/li"));

//		for (WebElement e : li) {
//			a.add(e.getText());
//
//		}

		
		for(int i=0; i<li.size(); i++) {
			a.add(li.get(i).getText());
		}
		return a;
	}

	public void moveToWebElement(WebDriver driver, WebElement s) {
		Actions ac = new Actions(driver);
		ac.moveToElement(s).build().perform();
//		ac.doubleClick();
//		
//		ac.contextClick()
//		
//		ac.dragAndDrop(s, s)
//		
//		ac.clickAndHold()
//		
//		ac.release()
//		
//		ac.keyDown(null)
//		
//		
//		ac.keyUp(null)
		
		
	}
}
