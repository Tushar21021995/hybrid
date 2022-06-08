package practiceofDATADRIVENFRAMEWORK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteexceldataAmazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./Data/AmazonTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("validamazoncreds");
		Row row = sh.getRow(0);

		//...............................//

		Cell cell = row.createCell(2);
		cell.setCellValue("CEO");


		// we can add multiple cell
		Cell cell1 = row.createCell(3);
		cell1.setCellValue("ProjectManager");

		//....................................//

		FileOutputStream fos = new FileOutputStream("./Data/AmazonTestData.xlsx");
		wb.write(fos);



	}

}
