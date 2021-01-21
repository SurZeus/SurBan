package dependencies;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RemoveSongFromDb {
	
	private Connection connect=null;//uchwyt do polaczenia z baza
	private Statement statement=null;//tu bedzie trzymane zapytanie SELECT
	private ResultSet resultSet=null;//tu bedzie trzymany wynik tego zapytania
	private PreparedStatement preparedStatement=null;//do przygotowania INSERTA
	
	//private String host="192.166.219.220";
	private String user="surb";
	private String pass="zlRhOdY232..0";
	private String url;

	
   public RemoveSongFromDb()
   {
	   
   }
   
	
	public void DeleteUser( int id) throws ClassNotFoundException, Throwable {
	    
		
		
	    
	  
		Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
	
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		//writeResultSet(resultSet);
	
		preparedStatement =connect.prepareStatement("DELETE FROM utwor WHERE id_utworu=?");
		
		preparedStatement.setInt(1,id);
		
		
		preparedStatement.executeUpdate();
		connect.close();
	   
	    	Class.forName("com.mysql.jdbc.Driver");

			url="jdbc:mysql://192.166.219.220:3306/surban";
		
			connect = DriverManager.getConnection(url,user,pass);
			
			statement=connect.createStatement();
			//writeResultSet(resultSet);
		
			preparedStatement =connect.prepareStatement("DELETE FROM utwor WHERE id_utworu=? ");
			
			preparedStatement.setInt(1,id);
			
			
			preparedStatement.executeUpdate();
			connect.close();
	    }

		
	
		  
	}

