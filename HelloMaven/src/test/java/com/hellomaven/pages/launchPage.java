package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.hellomaven.base.Base;

public class launchPage extends Base {

	// webElements

	

//	WebElement registerLinkText = driver.findElement(By.linkText("Register"));
	
	@FindBy(how=How.LINK_TEXT, using="Register")
	WebElement registerLinkText;

	@FindBy(how=How.LINK_TEXT, using="Log in")
	WebElement loginLink_ele;
	
	public launchPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	//
	public boolean isRegLinkDisplayed() {
		return registerLinkText.isDisplayed();
	}

	public void clickRegLink() {
		registerLinkText.click();
	}
	
	public void clickLogin() {
		loginLink_ele.click();
	}


}
