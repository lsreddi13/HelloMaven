package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.hellomaven.base.Base;

public class loginpage extends Base {

	// write the webelements

	public loginpage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	WebElement email_ele = driver.findElement(By.id("Email"));
//	WebElement pwd_ele = driver.findElement(By.id("Password"));

	@FindBy(how = How.ID, using = "Password")
	WebElement pwd_ele;

	public void enterEmail(String emailID) {

		email_ele.clear();
		email_ele.sendKeys(emailID);

	}

	public void enterPassword(String pass) {

		pwd_ele.clear();
		pwd_ele.sendKeys(pass);
	}

	// methods

}
