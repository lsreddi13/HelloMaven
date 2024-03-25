package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.hellomaven.base.Base;

public class homepage extends Base {

	

	@FindBy(how = How.LINK_TEXT, using = "Log out")
	WebElement logoutLink_ele;;

	public homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}


	public void clickLogout() {
		logoutLink_ele.click();
	}

}
