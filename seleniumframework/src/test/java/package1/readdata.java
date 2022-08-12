package package1;

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

public class readdata {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");


		FileInputStream fis = new  FileInputStream("./data/ReadData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(2);
		Cell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println(value);

	}

}
