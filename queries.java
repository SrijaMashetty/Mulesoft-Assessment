package MS;
import java.sql.*;
public class queries {
	private static Statement selectStmt;
	private static Connection connection;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		connection = null;
        selectStmt = null;
	        try (Connection conn = DriverManager.getConnection(
		    		  "jdbc:mysql://localhost:3306/mulesoft","root","root");
			    ){
	        	System.out.println("Querying from the MOVIE table");
	        	Statement selectStmt = conn.createStatement();
	        	
	        	ResultSet rs = selectStmt.executeQuery("MOVIE_NAME,ACTOR,ACTRESS,DIRECTOR,YR_OF_REL");

	            while(rs.next()){
	            	System.out.println(rs.getString(1));    
	                System.out.println(rs.getString(2));    
	                System.out.println(rs.getString(3));    
	                System.out.println(rs.getString(4));   
	                System.out.println(rs.getString(5));  
	            }
	        }
	        catch (Exception e) {
	        	e.printStackTrace();
	        }
	        finally 
	        {
	            try {
	                selectStmt.close();
	                connection.close();
	            } 
	            catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	}
}
