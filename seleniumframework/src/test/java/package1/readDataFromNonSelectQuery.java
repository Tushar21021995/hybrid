package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class readDataFromNonSelectQuery {

	public static void main(String[] args) throws SQLException 
	{

		Driver driverref = new Driver();

		DriverManager.registerDriver(driverref);


		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers_info","root","root");

		Statement stat = conn.createStatement();

		String Query = "insert into teachers(first_name,last_name,adress) values('ram','chandra','bangalore')";

		int result = stat.executeUpdate(Query);


		if(result==1)
		{
			System.out.println("user is created");
		}

		else
		{
			System.out.println("user is not created");
		}

		conn.close();




	}

}
