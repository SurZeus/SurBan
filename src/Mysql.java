import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql {

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
	public Mysql() {
		
	}
	public void podajDane(String login, String haslo, String email) throws Exception {
		this.login=login;
		this.haslo=haslo;
		this.email=email;
		
		readDataBase();
	}
	public void readDataBase() throws ClassNotFoundException {
		
			Class.forName("com.mysql.jdbc.Driver");
			//connect=DriverManager.getConnection("jdbc:mysql://)"
			//		+host+"/surban?"+"user="+user+"&password"+pass);
			//jdbc:mysql://localhost/firma?user=root&password=
			url="jdbc:mysql://192.166.219.220:3306/surban";
			try {
			connect = DriverManager.getConnection(url,user,pass);
			
			statement=connect.createStatement();
			//writeResultSet(resultSet);

			preparedStatement =connect.prepareStatement("INSERT INTO uzytkownik VALUES(default, ?, ?, ?)");
			
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, haslo);
			preparedStatement.setString(3, email);
			
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
	
	/*private void writeResultSet(ResultSet resultSet) throws SQLException
	{
		while (resultSet.next()) {
			String login=resultSet.getString("login");
			String city=resultSet.getString("city");
		}
	}
	
	
	
}
*/
