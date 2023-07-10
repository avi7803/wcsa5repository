package readExcelData;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Write data into the excel
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("IPL");
		
		Row row = sheet.createRow(11);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("Pune");
		
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Dhoni");
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		
		wb.write(fos);
	}

}
