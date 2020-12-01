package dependencies;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

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
	public int checkresult=-1;
	public JOptionPane xd = null;
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
	public void checkDataBase(String login,String haslo) throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
		try {
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		preparedStatement =connect.prepareStatement("SELECT id_uzytkownika FROM `uzytkownik` WHERE login=? AND haslo=?");
		
		preparedStatement.setString(1, login);
		preparedStatement.setString(2, haslo);
		
		
		ResultSet rs;
		rs = preparedStatement.executeQuery();
		
		if (rs.next() == false) {
			JOptionPane.showMessageDialog(null, "User not found in database", "SurbanRecordsError", JOptionPane.ERROR_MESSAGE);
			
		}else {	
			int id = rs.getInt(1);
			this.checkresult = id;
		}
	
		
		
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
/*public boolean checkUsername(String username)
{
    PreparedStatement ps;
    ResultSet rs;
    boolean checkUser = false;
    String query = "SELECT * FROM `the_app_users` WHERE `u_uname` =?";
    
    try {
        ps = MyConnection.getConnection().prepareStatement(query);
        ps.setString(1, username);
        
        rs = ps.executeQuery();
        
        if(rs.next())
        {
            checkUser = true;
        }
    } catch (SQLException ex) {
        Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
    }
     return checkUser;
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
