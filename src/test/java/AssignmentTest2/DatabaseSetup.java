package AssignmentTest2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSetup {

	public static void main(String[] args) {


		try {
			
			//source database
			Connection sourcrConnection=DriverManager.getConnection("DatabaeConnection");
			Statement sourStatement= sourcrConnection.createStatement();
			sourStatement.execute("CREATE TABLE Employee(id INT,name VARCHAR(255));");
			sourStatement.execute("INSERT INTO Employee(id,name)VALUS(1,'ayodhya'),(2,'arjun'),(3,'kashid')");
			
			//targateDatabase
			Connection targetConnection=DriverManager.getConnection("DatabaeConnection");
			Statement targetStatement= targetConnection.createStatement();
			targetStatement.execute("CREATE TABLE Employee(id INT,name VARCHAR(255));");
			targetStatement.execute("INSERT INTO Employee(id,name)VALUS(1,'ayodhya'),(2,'arjun'),(3,'kashid')");
		
			sourStatement.close();
			sourcrConnection.close();
			targetStatement.close();
			targetConnection.close();
	} catch(SQLException e) {
		e.printStackTrace();
	}

}
}
