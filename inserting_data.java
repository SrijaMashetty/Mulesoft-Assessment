package MS;
import java.sql.*;
public class inserting_data {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/mulesoft";
	   static final String USERNAME = "root";
	   static final String PASSWORD = "root";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {	
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft","root","root");
	         Statement stmt = conn.createStatement();
	         System.out.println("Inserting records into the table");   
	         
	         String sql = "INSERT INTO MOVIE(Movie_name,Actor,Actress,Director,yr_of_rel) VALUES ('Bahubali','Prabhas','Anushka','Rajamouli','2015')";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE(Movie_name,Actor,Actress,Director,yr_of_rel) VALUES ('Major','Adivisesh','Manjrekar','SaShi Kiran Tikka',2022)";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE(Movie_name,Actor,Actress,Director,yr_of_rel) VALUES ('Magadheera','Ramcharan','Kajal','S.S.Rajamouli',2009)";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE(Movie_name,Actor,Actress,Director,yr_of_rel) VALUES ('K.G.F:1','Yash','Srindhi Shetty','Prashanth Neel',2018)";
	         stmt.executeUpdate(sql);
	         
	         sql = "INSERT INTO MOVIE(Movie_name,Actor,Actress,Director,yr_of_rel) VALUES ('Hyper','Ram','Rashi Khanna','Santosh Srinivas',2016)";
	         stmt.executeUpdate(sql);
	         
	         System.out.println("Inserted records into the table...");
	         
		 } catch (Exception e) {
			 System.out.print(e);
	 }
		
	}
	
}
