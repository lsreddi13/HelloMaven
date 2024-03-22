package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hellomaven.base.Base;

public class launchPage extends Base {

	// webElements

	public launchPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	WebElement registerLinkText = driver.findElement(By.linkText("Register"));

	//
	public boolean isRegLinkDisplayed() {
		return registerLinkText.isDisplayed();
	}

	public void clickRegLink() {
		registerLinkText.click();
	}

}
