package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class redDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");// PROVIDE THE EXTENTION
		Workbook wb = WorkbookFactory.create(fis);//MAKE THE FILE READY FOR READ OEPRATION
		Sheet sh = wb.getSheet("Sheet1");//GET INTO THE SHEET
		Row row = sh.getRow(5);// GET THE DESRIED ROW
		Cell cell = row.getCell(1); //DET THE DESIRED COL/CELL
		String data = cell.getStringCellValue();   //READ THE DATA FROM THE CELL
		System.out.println(data);    // print the data
		
		
		
	}

}
