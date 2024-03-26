package com.hellomaven.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDependsOn {

	@Test(priority = 1)
	public void login() {
		System.out.println("login");
		Assert.assertEquals("please try enter valid data", "Welcome! Sasidhar");
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void orderItem() {
		System.out.println("orderItem");
	}
	
	@Test(priority = 3, dependsOnMethods = "login" )
	public void logout() {
		System.out.println("logout");
	}

}
