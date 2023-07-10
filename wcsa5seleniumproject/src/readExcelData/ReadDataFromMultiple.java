package readExcelData;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromMultiple {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		         // Read data from IPL Sheet..

				// implementation of read the data from excel
				//Read multiple values or data from excel sheet by using for loop
		
		for(int i=1;i<=10;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //Provide path of the File
			
			
			Workbook wb = WorkbookFactory.create(fis); //Make a file ready for read
			
			Sheet sheet = wb.getSheet("IPL"); //Get into the sheet
			
			Row row = sheet.getRow(i); //Get into desired the Row
			
			Cell cell = row.getCell(1); //Get into the 1st  Cell/column 
			
			String data = cell.getStringCellValue(); //Read the value present in the cell
			Thread.sleep(2000);
			System.out.println(data); //Print the fetched data
		}
	}

}
