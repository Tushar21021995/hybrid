package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestActitiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();
		
		
		
		Loginpage lp = new Loginpage(driver);
		
		// get the row count 
		Flib flib = new Flib();
		int rc = flib.getRowCount("./Data/ActitimeTestData.xlsx", "invalidcreds");
		
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readData("./Data/ActitimeTestData.xlsx", "invalidcreds", i, 0);
			String invalidPassword = flib.readData("./Data/ActitimeTestData.xlsx", "invalidcreds", i, 1);
			
			// perform invalid login
			lp.actitimeInvalidLogin(invalidUsername, invalidPassword);
		}
		
		// close the browser
		
		bt.tearDown();
		
	}

}
