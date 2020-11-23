import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Checklogin {


	private Connection connect=null;//uchwyt do polaczenia z baza
	private Statement statement=null;//tu bedzie trzymane zapytanie SELECT
	private ResultSet resultSet=null;//tu bedzie trzymany wynik tego zapytania
	

	private String user="surb";
	private String pass="zlRhOdY232..0";
	private String login = null;
	private String haslo = null;
	private String url;
	
public Checklogin() {
		
	}
	public void Pobierzlogin(String login, String haslo) throws Exception {
		this.login=login;
		this.haslo=haslo;
		
		readDataBase();
	}
	
	public void readDataBase() throws Exception {
		try {
			url="jdbc:mysql://192.166.219.220:3306/surban";
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url,user,pass);
			
			statement=connect.createStatement();
			
			resultSet=statement.executeQuery("SELECT imie, haslo FROM uzytkownik");
			writeResultSet(resultSet);
			
			System.out.println(login);
			System.out.println(haslo);
			
			connect.close();
			System.out.println("Connection closed");
			////INSERT//////////////////////////////////////
		}catch (Exception e) {
			System.out.println("Blad polaczenia z baza danych");
		}finally{
		      //closing ResultSet,PreparedStatement and Connection object
	    }
	}
	
	private void writeResultSet(ResultSet resultSet) throws SQLException
	{
		while (resultSet.next()) {
			String login=resultSet.getString("imie");
			String haslo=resultSet.getString("haslo");
		}
	}
	
	
	
}
