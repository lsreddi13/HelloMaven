package com.Webelementmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenshot {

	@Test(enabled = false)
	public void testScreenshotPage() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iiit.ac.in/admissions/");

		driver.manage().window().maximize();

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshotFile, new File("D:\\myworkspace\\HelloMaven\\Screenshots\\image.png"));

//		 String src = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);

	}
//create separate method to take the screenshots and use it in any class.

	public void takeWebelementScreenshot() {

	}

	public void takePageScreenshot() {

	}
	

	public String taketime() {
		return "20240310_8-10_mm";
		//yyyymmdd_hh-mm-ss
	}

	@Test
	public void testScreenshotWebElement() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iiit.ac.in/admissions/");

		driver.manage().window().maximize();
		String s = taketime();
		String s2 = "testScreenshotWebElement_";
		WebElement we = driver.findElement(By.cssSelector("div.navbar-container > ul.navbar"));

//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File src = ((TakesScreenshot) we).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D:\\myworkspace\\HelloMaven\\Screenshots\\"+s2+s+".png"));

	}

}