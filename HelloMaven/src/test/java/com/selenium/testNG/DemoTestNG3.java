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

public class DemoTestNG3 {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite3 annotation method.");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite3 annotation method.");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest3 annotation method.");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass3 annotation method.");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass3 annotation method.");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest3 annotation method.");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod3 annotation method.");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod3 annotation method.");
	}

	@Test
	public void test() {
		System.out.println("test3 annotation method.");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 annotation method.");
	}
}
