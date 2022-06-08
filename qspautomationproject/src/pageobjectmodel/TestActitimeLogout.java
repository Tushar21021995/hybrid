package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestActitimeLogout extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		String validUsername = flib.readPropertyFile("./Data/config.properties", "username");
		String validPassword = flib.readPropertyFile("./Data/config.properties", "password");
		
		
		Loginpage lp = new Loginpage(driver);
		lp.actitimevalidLogin(validUsername, validPassword);
		Thread.sleep(3000);
		
		
		Homepage hp = new Homepage(driver);
		hp.clickLogout();
		
	}

}
