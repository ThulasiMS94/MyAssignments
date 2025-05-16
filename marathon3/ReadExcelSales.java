package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSales {
	
	public static String[][] readData() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./Data/NewOpportunity.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		int columnCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount];
		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				data[i - 1][j] = allData;
				System.out.println("All data are: " + allData);
			}
		}
		wb.close();
		return data;
	}
}
		
		



