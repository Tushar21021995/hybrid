package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(3000);
		
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./Data/ActitimeTestData.xlsx", "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readData("./Data/ActitimeTestData.xlsx", "invalidcreds", i, 0);
			String password = flib.readData("./Data/ActitimeTestData.xlsx", "invalidcreds", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
		}
	}

}
