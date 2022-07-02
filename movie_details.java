package MS;
import java.sql.*;
public class movie_details {

	public static void main(String[] args, String Movie_name,String Actor,String Actress,String Director,String yr_of_rel )  {
		
		try (Connection conn = DriverManager.getConnection(
	    		  "jdbc:mysql://localhost:3306/mulesoft","root","root");
		    ) {
				Statement selectStmt = conn.createStatement();

				ResultSet rs=selectStmt
						.executeQuery("SELECT * FROM movie");

				while(rs.next())
				System.out.println(rs.getString(Movie_name)+" "+rs.getString(Actor)+"\t "+rs.getString(Actress)+"\t "+rs.getString(Director)+"\t "+rs.getInt(yr_of_rel));
				conn.close();
			 }catch(Exception e) { 
				System.out.println(e);}
	}

}
