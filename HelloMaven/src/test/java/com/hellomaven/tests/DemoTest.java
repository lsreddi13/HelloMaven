package com.hellomaven.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hellomaven.base.Base;
import com.hellomaven.pages.homepage;
import com.hellomaven.pages.launchPage;
import com.hellomaven.pages.loginpage;
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

	@Test(dataProvider = "getLoginData")
	public void testLoginMultipleUsers(String email, String pass) throws IOException, InterruptedException {
		launchPage lp = new launchPage();
		loginpage lpp = new loginpage();
		homepage hp = new homepage();

		lp.clickLogin();
		lpp.enterEmail(email);
		lpp.enterPassword(pass);
		lpp.clickLogin();
		Thread.sleep(5000);
		// add assetion to display the logout link.
		hp.clickLogout();
		// add aserion to display the login link

	}

	@Test(enabled = false)
	public void testLogin() throws IOException, InterruptedException {
		launchPage lp = new launchPage();
		loginpage lpp = new loginpage();
		homepage hp = new homepage();

		lp.clickLogin();
		lpp.enterEmail("venu_machina@gmail.com");
		lpp.enterPassword("venu12345");
		lpp.clickLogin();
		Thread.sleep(5000);
		// add assetion to display the logout link.
		hp.clickLogout();
		// add aserion to display the login link

	}

	// verify reg page
	@Test(dataProvider = "getregData", enabled = false)
	public void testRegMultipleusers(String f_name, String l_name, String date, String month, String year, String email,
			String company, String password, String confirmpassword) throws IOException, InterruptedException {
		launchPage lp = new launchPage();
		registerPage rp = new registerPage();
		Assert.assertTrue(lp.isRegLinkDisplayed());
		lp.clickRegLink();
		String male = "gender-male";
		String female = "gender-female";
		rp.selectGender(female);
		rp.enterFirstName(f_name);
		rp.enterLastName(l_name);
		rp.selectDate(date);
		rp.selectMonth(month);
		rp.selectYear(year);
		rp.enterEmail(email);
		rp.enterCompany(company);
		rp.enterPass(password);
		rp.enterConfirmPass(password);
		rp.clickRegisterBtn();
		Thread.sleep(3000);
		Assert.assertTrue(rp.successMessageIsDisplayed(), "Success message does not displayed.");

		Assert.assertEquals(rp.getSuccessmessage(), "Your registration completed", "Success message does not same.");

		rp.clickContinue();
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void testReg() throws IOException, InterruptedException {

		launchPage lp = new launchPage();

		registerPage rp = new registerPage();
		Assert.assertTrue(lp.isRegLinkDisplayed());
		lp.clickRegLink();

		String male = "gender-male";
		String female = "gender-female";

		String f_name = "sasidhar";
		String l_name = "venu";
		String date = "13";
		String month = "June";
		String year = "1927";
		String email = "testqa@gmail.com";
		String company = "info";
		String password = "Tell123";

		rp.selectGender(female);
		rp.enterFirstName(f_name);
		rp.enterLastName(l_name);

		rp.selectDate(date);
		rp.selectMonth(month);
		rp.selectYear(year);
		rp.enterEmail(email);
		rp.enterCompany(company);

		rp.enterPass(password);
		rp.enterConfirmPass(password);

		rp.clickRegisterBtn();

		Assert.assertTrue(rp.successMessageIsDisplayed(), "Success message does not displayed.");

		Assert.assertEquals(rp.getSuccessmessage(), "Your registration completed", "Success message does not same.");

		rp.clickContinue();

	}

}
