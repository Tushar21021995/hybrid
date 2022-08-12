package package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
@Test(dataProvider="dataprovidertest")
	public void bookticket(String src,String dest)
	{
		System.out.println("Book ticket from  "+src+" to "+dest+"");
	}
	
	@DataProvider
	public Object[][] dataprovidertest()
	{
		
		Object[][] objArr = new Object[5][2];
		
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="Mysore";
		
		objArr[2][0]="Bangalore";
		objArr[2][1]="Mangalore";
		
		objArr[3][0]="Bangalore";
		objArr[3][1]="Kerala";
		
		objArr[4][0]="Bangalore";
		objArr[4][1]="Mumbai";
		
		return objArr;
		
	}
	
	
}
