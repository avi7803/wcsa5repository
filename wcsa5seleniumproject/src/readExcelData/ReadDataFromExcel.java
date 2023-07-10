package readExcelData;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Read data from IPL sheet
		
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //Provide path of the File
			
			Workbook wb = WorkbookFactory.create(fis); //make the file ready to read
			
	        Sheet sheet = wb.getSheet("IPL"); //Get into the sheet
			
			Row row = sheet.getRow(3); //Get into the 2nd Row and "2" bcoz index starts with "0"
			
			Cell cell = row.getCell(1); //Get into the 1st  Cell/column 
			
			String data = cell.getStringCellValue(); //Read the value present in the cell
			System.out.println(data);

	}

}
