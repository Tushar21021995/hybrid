package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{

		BaseTest bt = new BaseTest();
		bt.setUp();
		Thread.sleep(2000);


		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile("./data/config.properties", "username");
		String validPassword = flib.readPropertyFile("./data/config.properties", "password");



		Loginpage lp = new Loginpage(driver);
		lp.actitimevalidLogin(validUsername, validPassword);


	}

}
