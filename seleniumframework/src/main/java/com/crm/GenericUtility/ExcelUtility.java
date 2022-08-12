package com.crm.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String ReadExcelData(String Path,String SheetName,int RowNum,int CellNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/ReadData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowNum);
		Cell cell = row.getCell(CellNum);
		String value = cell.getStringCellValue();
		return value;
		
		
	

	}

}
