package dataDrivenFramework;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// to store generic reusable methods
	// all the methods are non static
	
	//It is used to get data present in the Cell
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
	    Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
	    Sheet sheet = wb.getSheet(sheetName);// get into the sheet
	    Row row = sheet.getRow(rowCount); // get into the desired row
	    Cell cell = row.getCell(cellCount);//get into the desired cell/column
	    String data = cell.getStringCellValue();// read the value from cell
	    return data;
	}
	
	//It is used to get Last count of Row
	public int getLastRowCount(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	//It is used to write data into excel sheet
	
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
	    Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
	    Sheet sheet = wb.getSheet(sheetName);// get into the sheet
	    Row row = sheet.createRow(rowCount); // Create into the desired row
	    Cell cell = row.createCell(cellCount);//Create cell in new row
	    
	    cell.setCellValue(data);
	    
	    FileOutputStream fos=new FileOutputStream(excelPath);
	    wb.write(fos);
	}
  

}