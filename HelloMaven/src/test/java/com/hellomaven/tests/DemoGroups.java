package com.hellomaven.tests;

import org.testng.annotations.Test;

public class DemoGroups {

	@Test(groups = {"regression"})
	public void testlogin() {
		System.out.println("testlogin");
	}

	@Test(groups = {"smoke", "regression"})
	public void testinvalidlogin() {
		System.out.println("testinvalidlogin");
	}

	@Test(groups = {"smoke"})
	public void verifyloginpage() {
		System.out.println("verifyloginpage");
	}

	@Test(groups = {"regression"})
	public void erroLogins() {
		System.out.println("erroLogins");
	}

	@Test(groups = {"regression"})
	public void searchItem() {
		System.out.println("searchItem");
	}

	@Test(groups = {"smoke"})
	public void serachItemwithInvlaidData() {
		System.out.println("serachItemwithInvlaidData");
	}

	@Test(groups = {"regression"})
	public void verifySearchResult() {
		System.out.println("verifySearchResult");
	}

}
