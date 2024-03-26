package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hellomaven.base.Base;

public class registerPage extends Base {


	
	
	@FindBy(how = How.ID, using = "FirstName")
	WebElement f_name_ele;
	
	@FindBy(how = How.NAME, using = "LastName")
	WebElement l_name_ele;
	
	
	@FindBy(how = How.NAME, using = "DateOfBirthDay")
	WebElement date_ele;
	
	@FindBy(how = How.NAME, using = "DateOfBirthMonth")
	WebElement month_ele;
	
	@FindBy(how = How.NAME, using = "DateOfBirthYear")
	WebElement year_ele;
	
	
	@FindBy(how = How.ID, using = "Email")
	WebElement email_ele;
	
	
	@FindBy(how = How.ID, using = "Company")
	WebElement company_ele;
	
	
	@FindBy(how = How.ID, using = "Password")
	WebElement password;

	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	WebElement confirmpassword;
	

	@FindBy(how = How.ID, using = "register-button")
	WebElement registerBtn;
	
	@FindBy(how = How.CLASS_NAME, using = "result")
	WebElement successmessage_ele;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Continue']")
	WebElement continueLink_ele;
	
	
	
	
	
	public registerPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickContinue() {
		continueLink_ele.click();
	}
	
	public boolean successMessageIsDisplayed() {
		return successmessage_ele.isDisplayed();
	}
	
	public String getSuccessmessage() {
		return successmessage_ele.getText();
	}
	
	
	public void enterEmail(String emailId) {
		email_ele.sendKeys(emailId);
	}
	
	public void enterCompany(String comapnyName) {
		company_ele.sendKeys(comapnyName);
	}
	
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterConfirmPass(String pass) {
		confirmpassword.sendKeys(pass);
	}
	
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	
	public void selectDate(String date) {
		selectListItemByVisibilityText(date_ele, date);
	}
	
	public void selectMonth(String month) {
		selectListItemByVisibilityText(month_ele, month);
	}
	
	public void selectYear(String year) {
		selectListItemByVisibilityText(year_ele, year);
	}
	
	public void enterLastName(String name) {
		l_name_ele.clear();
		l_name_ele.sendKeys(name);
	}
	
	public void enterFirstName(String name) {
		f_name_ele.clear();
		f_name_ele.sendKeys(name);
	}
	
	
	//
	

//	public void selectMale() {
//		gender_male.click();
//	}


	public void selectGender(String gender) {
		driver.findElement(By.xpath("//div[@id='gender']/span/input[@id='" + gender + "']")).click();

	}

}
