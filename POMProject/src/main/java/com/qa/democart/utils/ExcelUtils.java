package com.qa.democart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public static String TEST_DATA_SHEET = "./src/test/resources/testdata/testdataExcel.xlsx";
	public static Workbook book;
	public static Sheet sheet1;

	public static Object[][] getTestData(String Sheetname) {

		Object[][] data = null;
		try {
			FileInputStream td = new FileInputStream(TEST_DATA_SHEET);
			book = WorkbookFactory.create(td);
			sheet1 = book.getSheet(Sheetname);

			data = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];

			for (int i = 0; i < sheet1.getLastRowNum(); i++) {
				for (int j = 0; j < sheet1.getRow(0).getLastCellNum(); j++) {
					data[i][j] = sheet1.getRow(i + 1).getCell(j).toString();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}
}