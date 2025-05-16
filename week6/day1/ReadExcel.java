package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData() throws IOException {

		// To open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");

		// Locate the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		// To count the number of rows without header
		int rowCount = ws.getLastRowNum();
		System.out.println("The row count is: " + rowCount);

		// To count the number of rows with header
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The column count is: " + columnCount);

		// To retrieve the data
		String row1Cell1Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The data is: " + row1Cell1Data);

		// To retrive the entire data
		String[][] data = new String[rowCount][columnCount];
		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				// String allData=row(1).getCell(2).getStringCellValue
				data[i - 1][j] = allData;
				System.out.println("All data are: " + allData);
			}
		}
		wb.close();
		return data;
	}

}
