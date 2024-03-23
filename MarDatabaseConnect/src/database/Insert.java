package database;

import java.sql.*;

public class Insert {

	public static void main(String[] args) {
//		connection connects to database
		Connection con;
//		statement
		Statement st;
		try {
			
		//1 load the driver class
			
//for oracle database		Class.forName("oracle:jdbc.driver.oracleDriver");
			Class.forName("org.postgresql.Driver");//for postgresql
			
		//2. establish the connection
		con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/nami","postgres","admin");
		
		//3.prepare the SQL STATEMENT
		String sql= "insert into teacher(Fullname,email)values('Priyancy','priyancy12@gmail.com')";// insert query for inserting in database
		
		//4. create a JDBC statement
		st = con.createStatement();
		
		//5. submit the statement() to database using JDBC;
		int a= st.executeUpdate(sql);

		if(a==1) {
		System.out.println("data sucessfully insterted");

		}else {
		System.out.println("failed");
		}

		}
		catch(Exception e) {
			System.out.println("something");
		}

	}

}
