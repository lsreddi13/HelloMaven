package com.selenium.xlsfiles;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hellomaven.base.Base;
import com.hellomaven.pages.launchPage;
import com.hellomaven.pages.registerPage;

public class DemoTest extends Base {

	public DemoTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setUp() throws IOException {

		init();

		driver.get(prop.getProperty("nopURL"));
	}

	// verify reg page
	@Test
	public void testReg() throws IOException, InterruptedException {
		launchPage lp = new launchPage();
		

		String male = "gender-male";
		String female = "gender-female";
		String f_name = "sasidhar";

		Assert.assertTrue(lp.isRegLinkDisplayed());
		lp.clickRegLink();
		registerPage rp = new registerPage();
//		rp.selectGender(female);
		rp.selectMale();
		rp.enterFirstName(f_name);

	}

}
