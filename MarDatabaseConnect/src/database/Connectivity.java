package database;


import java.sql.*;

public class Connectivity {

	public static void main(String[] args) {
		Connection con;
		ResultSet rs;
		Statement st;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nami","postgres","admin");
			st=con.createStatement();
			rs= st.executeQuery("select * from teacher");
			while(rs.next()) {
				
				String fullname = rs.getString(1);
				String email = rs.getString(2);
				System.out.println(fullname+"\t"+email);
	
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
