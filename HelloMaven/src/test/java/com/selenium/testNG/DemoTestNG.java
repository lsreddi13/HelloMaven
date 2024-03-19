package com.selenium.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite annotation method.");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite annotation method.");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest annotation method.");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass annotation method.");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass annotation method.");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest annotation method.");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod annotation method.");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod annotation method.");
	}

	@Test
	public void test() {
		System.out.println("test annotation method.");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 annotation method.");
	}
}
