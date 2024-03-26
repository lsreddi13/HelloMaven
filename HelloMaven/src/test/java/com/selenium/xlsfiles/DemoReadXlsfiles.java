package com.selenium.xlsfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hellomaven.base.Base;
import com.hellomaven.pages.loginpage;

public class DemoReadXlsfiles extends Base {
	
	loginpage lp;
	public DemoReadXlsfiles() throws IOException {
		super();
		
		
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setUp() throws IOException {

		init();

//		driver.get(prop.getProperty("nopURL"));
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}

	@Test(dataProvider = "getData", enabled = true)
	public void testPrintTestData(String ss, String xx) throws IOException {
		 lp = new loginpage();
		lp.enterEmail(ss);
		lp.enterPassword(xx);
		pageRefresh();

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		Object[][] obj1 = new Object[][] {};

		obj1 = getTestData();
		return obj1;
	}

	public Object[][] getTestData() throws IOException {
		String filepath = ".//testdata//loginTestdata.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(filepath));
		// workbook connect
		Workbook wb = WorkbookFactory.create(inputStream);
		// sheet connect
		Sheet sh = wb.getSheet("login");
		// get the number of rows and collumns
		int numberOfRows = sh.getLastRowNum();
		int numberOfCol = sh.getRow(numberOfRows).getLastCellNum();
		// get cell data
		Object[][] obj = new Object[numberOfRows][numberOfCol];
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCol; j++) {
				obj[i][j] = sh.getRow(i + 1).getCell(j).toString();
				System.out.println(obj[i][j]);
			}
		}
		return obj;
	}

}
