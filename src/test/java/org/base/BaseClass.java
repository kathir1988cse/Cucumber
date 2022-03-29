package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	public void getOneDriver(String browserName, String url) {

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("Invalid Browser");
		}
		
		driver.get(url);

	}
	
	public int getNoOfRows() throws IOException {
		File file = new File("E:\\Selenium\\Cucumber\\Report\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		return rows;

	}
	
	public String getDataFromExcel(int rowNum, int cellNum) throws IOException {
		File file = new File("E:\\\\Selenium\\\\POM\\\\Report\\\\TestData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		String value = "";
		switch (type) {
		case STRING:
			value = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
				value = dateFormat.format(date);

			} else {
				double value2 = cell.getNumericCellValue();
				BigDecimal b = new BigDecimal(value2);
				value = b.toString();
			}

			break;

		default:
			System.out.println("Some unidentified data in Excel");
			break;
		}

		return value;

	}
	
	public void writeDataToExcel(int rowNum, int colNum, String value) throws IOException {
		
		File outfile = new File("E:\\Selenium\\Cucumber\\Report\\Output.xlsx");	
		Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet();
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue(value);
			FileOutputStream out = new FileOutputStream(outfile);
			workbook.write(out);

	}

}
