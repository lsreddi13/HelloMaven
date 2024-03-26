package com.hellomaven.tests;

import org.testng.annotations.Test;

public class DemoGroups2 {

	@Test
	public void testlogin1() {
		System.out.println("testlogin1");
	}

	@Test(groups = {"regression"})
	public void testinvalidlogin1() {
		System.out.println("testinvalidlogin1");
	}

	@Test(groups = {"smoke"})
	public void verifyloginpage1() {
		System.out.println("verifyloginpage1");
	}

	@Test(groups = {"regression"})
	public void erroLogins1() {
		System.out.println("erroLogins1");
	}

	@Test(groups = {"regression"})
	public void searchItem1() {
		System.out.println("searchItem1");
	}

	@Test(groups = {"smoke", "regression"})
	public void serachItemwithInvlaidData1() {
		System.out.println("serachItemwithInvlaidData1");
	}

	@Test(groups = {"regression"})
	public void verifySearchResult1() {
		System.out.println("verifySearchResult1");
	}

}
