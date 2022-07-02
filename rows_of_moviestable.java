package MS;
import java.sql.*;
public class rows_of_moviestable {

	public static void main(String[] args) throws Exception{
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft","root","root");)
		
		{
				Statement selectStmt = con.createStatement();

				ResultSet rs=selectStmt
						.executeQuery("SELECT * FROM MOVIE");

				while(rs.next())
				System.out.println(rs.getString(1)+"\t "+rs.getString(2)+"\t "+rs.getString(3)+"\t "+rs.getString(4)+"\t "+rs.getInt(5));
				con.close();
		}
		catch(Exception e) { 
				System.out.println(e);}
	}

}
