package MS;
import java.sql.*;
public class connecttoDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/mulesoft","root","root");
		System.out.println("Connection established");
		Statement st = conn.createStatement();
		
		String query = " CREATE TABLE MOVIE(" + " MOVIE_NAME TEXT NOT NULL , "+ " ACTOR TEXT, "+" ACTRESS TEXT," + " DIRECTOR TEXT, " + " YEAR_OF_REL INT)" ;
		st.execute(query);
		conn.close();
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/mulesoft","root","root");
		return conn;
	}
}
