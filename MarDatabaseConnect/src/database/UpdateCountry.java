package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateCountry {

	public static void main(String[] args) {
Connection connect;
		
		Statement stmt;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			connect= DriverManager.getConnection("jdbc:postgresql://localhost:5432/country","postgres","admin");
			
			String sql= "update into students(id,name,contact)values('supriya','+9779876543210') where id=2";
			
			
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
