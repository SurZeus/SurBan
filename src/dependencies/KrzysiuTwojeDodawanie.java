package dependencies;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class KrzysiuTwojeDodawanie {
	
	private Connection connect=null;//uchwyt do polaczenia z baza
	private Statement statement=null;//tu bedzie trzymane zapytanie SELECT
	private ResultSet resultSet=null;//tu bedzie trzymany wynik tego zapytania
	private PreparedStatement preparedStatement=null;//do przygotowania INSERTA
	
	//private String host="192.166.219.220";
	private String user="surb";
	private String pass="zlRhOdY232..0";
	private String url;
	private String login=null;
	private String haslo=null;
	private String email=null;
	
	
   public KrzysiuTwojeDodawanie()
   {
	   
   }
   
	public void dodajbaza(String zmienna1, String zmienna2, String zmienna3) throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
		try {
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		//writeResultSet(resultSet);
		
		preparedStatement =connect.prepareStatement("INSERT INTO uzytkownik VALUES(default, ?, ?, ?)");
		// tutaj dodajesz funkcje z mysql np. DELTE FROM uzytkownik WHERE login="TWOJSTARYPIJANY"
		// obiekt se utwórz pajacu
		preparedStatement.setString(1, zmienna1);
		preparedStatement.setString(2, zmienna2);
		preparedStatement.setString(3, zmienna3);
		
		preparedStatement.executeUpdate();
		connect.close();
		System.out.println("Connection closed");
		}
		catch(SQLException e1) {
			e1.getStackTrace();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
}
}
