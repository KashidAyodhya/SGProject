package AssignmentTest2;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testSourceToTargetCount() throws SQLException {
		
		try{
			//source database
		Connection sourcrConnection=DriverManager.getConnection("jdbc:sqlite:mydb.db");
		Statement sourStatement= sourcrConnection.createStatement();
		ResultSet sourceResultSet=sourStatement.executeQuery("SELECT COUNT(*)FROM Employee;");
		sourceResultSet.next();
		int sourceCount=sourceResultSet.getInt(1);
		
		//target Database
		Connection targetConnection=DriverManager.getConnection("jdbc:sqlite:mydb.db");
		Statement targetStatement= targetConnection.createStatement();
		ResultSet targetResultSet=targetStatement.executeQuery("SELECT COUNT(*)FROM Employee;");
		targetResultSet.next();
		int targetCount=sourceResultSet.getInt(1);
		
		//close connection
		sourceResultSet.close();
		sourStatement.close();
		sourcrConnection.close();
		targetResultSet.close();
		targetStatement.close();
		targetConnection.close();
		
		assertEquals(sourceCount, targetCount,"Source and target count not match");
	} catch(SQLException e) {
		e.printStackTrace();}
	}
		@Test
		public void testSourceToTargetData() throws SQLException {
			
			try{
				//source database
			Connection sourcrConnection=DriverManager.getConnection("DatabaeConnection");
			Statement sourStatement= sourcrConnection.createStatement();
			ResultSet sourceResultSet=sourStatement.executeQuery("SELECT*FROM Employee;");
		
			//target Database
			Connection targetConnection=DriverManager.getConnection("DatabaeConnection");
			Statement targetStatement= targetConnection.createStatement();
			ResultSet targetResultSet=targetStatement.executeQuery("SELECT*FROM Employee;");
			
			
			//compare data
			while(sourceResultSet.next()&&targetResultSet.next()) {
				int sourceId=sourceResultSet.getInt("id");
				String sourceName=sourceResultSet.getString("name");
				int targetId=sourceResultSet.getInt("id");
				String targetName=sourceResultSet.getString("name");
				
				assertEquals(sourceId, targetId,"source and target data not matched");
				assertEquals(sourceName, targetName,"source and target data not matched");
			}
			//close connection
			sourceResultSet.close();
			sourStatement.close();
			sourcrConnection.close();
			targetResultSet.close();
			targetStatement.close();
			targetConnection.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

}}
