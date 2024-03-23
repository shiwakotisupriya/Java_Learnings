package database;
import java.sql.*;
public class SelectCountry {

	public static void main(String[] args) {
		Connection join;
		ResultSet result;
		Statement statement;
			try {
			
				Class.forName("org.postgresql.Driver");
			
				join= DriverManager.getConnection("jdbc:postgresql://localhost:5432/country","postgres","admin");
				
				statement=join.createStatement();
				
				result= statement.executeQuery("select * from students");
				
				while(result.next()) {
					int id = result.getInt(1);
					String fullname = result.getString(2);
					String contact = result.getString(3);
					System.out.println(id+"\t"+fullname+"\t"+contact);
		
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
