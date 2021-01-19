package dependencies;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AddArtistToDb {
	
	private Connection connect=null;//uchwyt do polaczenia z baza
	private Statement statement=null;//tu bedzie trzymane zapytanie SELECT
	private ResultSet resultSet=null;//tu bedzie trzymany wynik tego zapytania
	private PreparedStatement preparedStatement=null;//do przygotowania INSERTA
	
	//private String host="192.166.219.220";
	private String user="surb";
	private String pass="zlRhOdY232..0";
	private String url;

	
   public AddArtistToDb()
   {
	   
   }
   
	public void dodajbaza(String artist) throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
		try {
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		//writeResultSet(resultSet);
		
		preparedStatement =connect.prepareStatement("INSERT INTO wykonawca VALUES (	NULL,?);");
		
		// tutaj dodajesz funkcje z mysql np. DELTE FROM uzytkownik WHERE login="TWOJSTARYPIJANY"
		// obiekt se utwórz pajacu
		preparedStatement.setString(1, artist);
	
		
		preparedStatement.executeUpdate();
		connect.close();
		//System.out.println("Connection clossed");
		}
		catch(SQLException e1) {
			e1.getStackTrace();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
}
}
