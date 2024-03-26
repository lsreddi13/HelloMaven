package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.hellomaven.base.Base;

public class loginpage extends Base {

	// write the webelements

//	WebElement email_ele = driver.findElement(By.id("Email"));
//	WebElement pwd_ele = driver.findElement(By.id("Password"));

	@FindBy(how = How.ID, using = "Email")
	WebElement email_ele;

	@FindBy(how = How.ID, using = "Password")
	WebElement pwd_ele;

	@FindBy(how = How.XPATH, using = "//button[text()='Log in']")
	WebElement loginBtn_ele;

	@FindBy(how = How.XPATH, using = "//div[@class='message-error validation-summary-errors']")
	WebElement errorMsg_ele;

	public loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public String getErrorMesage() {
		return errorMsg_ele.getText();
	}

	public void enterEmail(String emailID) {

		email_ele.clear();
		email_ele.sendKeys(emailID);

	}

	public void enterPassword(String pass) {

		pwd_ele.clear();
		pwd_ele.sendKeys(pass);
	}

	public void clickLogin() {
		loginBtn_ele.click();
	}

}
