package database;
import java.sql.*;
public class InsertCountry {

	public static void main(String[] args) {
		Connection connect;
		
		Statement stmt;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			connect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/country","postgres","admin");
			
			String sql= "insert into students(id,name,contact)values('2','priyancy','+9779876543210')";
			
			
			stmt = connect.createStatement();
			int reg = stmt.executeUpdate(sql);
			
//			if reg is true or inserted 
			if(reg==1) {
				System.out.println("inserted");
			}
			else {
				System.out.println("Please check your query");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
