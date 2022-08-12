package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writedata {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		FileInputStream fis = new FileInputStream("./data/ReadData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.createRow(0);
		Cell cell = rw.createCell(2);

		cell.setCellValue("TestYantra");
		
		
		FileOutputStream fos = new FileOutputStream("./data/ReadData.xlsx");
		wb.write(fos);
		wb.close();
		
		

	}

}
