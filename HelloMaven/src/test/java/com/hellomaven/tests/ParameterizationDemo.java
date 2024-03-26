package com.hellomaven.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hellomaven.base.Base;
import com.hellomaven.pages.launchPage;
import com.hellomaven.pages.loginpage;

public class ParameterizationDemo extends Base {

	public ParameterizationDemo() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@BeforeClass
	public void setUp() throws IOException {
		init();
		driver.get(prop.getProperty("nopURL"));
	}

	@Parameters({ "email", "pass" })
	@Test(enabled = true)
	public void verifyErrorMsgInLoginPage(@Optional("hydqa123@gmail.com") String s1, String s2 ) throws IOException, InterruptedException {
		launchPage lp = new launchPage();
		loginpage lpp = new loginpage();

		System.out.println("email : " + s1);
		System.out.println("pass : " + s2);

		lp.clickLogin();
		lpp.enterEmail(s1);
		lpp.enterPassword(s2);
		lpp.clickLogin();
		Thread.sleep(5000);
		String error = lpp.getErrorMesage();
		String exp_error = "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found";
		Assert.assertEquals(error, exp_error);

	}

}
