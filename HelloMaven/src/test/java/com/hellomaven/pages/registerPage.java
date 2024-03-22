package com.hellomaven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hellomaven.base.Base;

public class registerPage extends Base {

	// webElements

	public registerPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	WebElement f_name_ele = driver.findElement(By.id("FirstName"));
	
	
//	
	WebElement gender_male = driver.findElement(By.id("gender-male"));
////	
	WebElement gender_female = driver.findElement(By.xpath("//div[@id='gender']/span/input[@id='gender-female']"));


	
	public void enterFirstName(String name) {
		f_name_ele.clear();
		f_name_ele.sendKeys(name);
	}
	//
	

	public void selectMale() {
		gender_male.click();
	}


	public void selectGender(String gender) {
		driver.findElement(By.xpath("//div[@id='gender']/span/input[@id='" + gender + "']")).click();

	}

}
