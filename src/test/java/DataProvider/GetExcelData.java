package DataProvider;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class GetExcelData {

	@DataProvider
	public static Object[][] getData() throws Exception {
		FileInputStream file = new FileInputStream("D:\\UserData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Login");
		int rowSize = sheet.getLastRowNum();
		int colSize = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Number : "+rowSize+ "Column Number : "+colSize);
	
		
		Object[][] data =  new Object[colSize][rowSize];
		for(int i =0;i<colSize;i++) {
			for(int j=0; j <rowSize; j++) {
		
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		
		return data;
		
	}

}
