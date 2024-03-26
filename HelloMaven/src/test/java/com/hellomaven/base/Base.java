package com.hellomaven.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class Base {
	public static Properties prop;

	public static WebDriver driver;

	public Base() throws IOException {
		FileInputStream fis = new FileInputStream(new File("D:\\myworkspace\\HelloMaven\\test.properties"));
		prop = new Properties();
		prop.load(fis);
	}

	public static void init() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}

	public void selectListItemByVisibilityText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public void selectListItemByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public void selectListItemByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
	
	

	@DataProvider
	public Object[][] getLoginData() throws IOException {
		String filepath = ".//testdata//regTestData.xlsx";
		String sheet = "loginTestData";
		Object[][] obj1 = new Object[][] {};
		obj1 = getData(filepath, sheet);
		return obj1;
	}
	

	@DataProvider
	public Object[][] getregData() throws IOException {
		String filepath = ".//testdata//regTestData.xlsx";
		String sheet = "register";
		Object[][] obj1 = new Object[][] {};
		obj1 = getData(filepath, sheet);
		return obj1;
	}


	public Object[][] getData(String filepath, String sheet) throws IOException {

		FileInputStream inputStream = new FileInputStream(new File(filepath));
		// workbook connect
		Workbook wb = WorkbookFactory.create(inputStream);
		// sheet connect
		Sheet sh = wb.getSheet(sheet);
		// get the number of rows and columns
		int numberOfRows = sh.getLastRowNum();
		int numberOfCol = sh.getRow(numberOfRows).getLastCellNum();
		// get cell data
		Object[][] obj = new Object[numberOfRows][numberOfCol];
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfCol; j++) {
				DataFormatter df = new DataFormatter();
				obj[i][j] = df.formatCellValue(sh.getRow(i + 1).getCell(j));
				System.out.println(obj[i][j]);
			}
		}
		return obj;
	}

}
