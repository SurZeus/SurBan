package dependencies;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import mainpackage.MainScreen;
import mainpackage.SurbanRecordsApp;

import java.awt.Color;
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
	public static ResourceBundle language = SurbanRecordsApp.language;
	//private String host="192.166.219.220";
	private String user="surb";
	private String pass="zlRhOdY232..0";
	private String url;
	private String login=null;
	private String haslo=null;
	private String email=null;

	public int checkresult=-1;
	public String username;
	public JOptionPane xd = null;
	
	public Mysql() {
		
	}
	
	public void podajDane(String login, String haslo, String email) throws Exception {
		this.login=login;
		this.haslo=haslo;
		this.email=email;
		if(this.login==null|this.haslo==null|this.email==null) {
			return;	
		}
		
		if(checkDataBase(login)==true) {
		
		readDataBase();
		
		}else {
			SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
			SurbanRecordsApp.incorrectReg.setText(language.getString("niezarejestrowano"));
			SurbanRecordsApp.incorrectReg.show();
		}
		
	}
	
	public void changePassDatebase(String oldPassHash, String newPassHash, String loginus) throws ClassNotFoundException {
	
	    
		if(!(checkPasswordChange(loginus, oldPassHash).equals(loginus)) || oldPassHash.isEmpty() || newPassHash.isEmpty()) {
			
			MainScreen.changePassCom.setForeground(Color.RED);
		    MainScreen.changePassCom.setText(language.getString("nieudalosie"));
		    MainScreen.changePassCom.show();
			
			return;
		}
		
		
		
		Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
		try {
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		//writeResultSet(resultSet);
	
		preparedStatement =connect.prepareStatement("UPDATE uzytkownik SET haslo=? WHERE login=?");
		
		preparedStatement.setString(1, newPassHash);
		preparedStatement.setString(2, loginus);
	
		
		preparedStatement.executeUpdate();
		connect.close();
	   
		MainScreen.changePassCom.setForeground(Color.GREEN);
	    MainScreen.changePassCom.setText(language.getString("udalosie"));
	    MainScreen.changePassCom.show();
		
		MainScreen.oldPass.setText("");
		MainScreen.newPass.setText("");
		MainScreen.newCPass.setText("");
		
		}
		catch(SQLException e1) {
			e1.getStackTrace();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		  
	}
	
	
	public String checkPasswordChange(String login,String haslo) throws ClassNotFoundException {
	
		
			Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
		try {
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		preparedStatement =connect.prepareStatement("SELECT login FROM `uzytkownik` WHERE login=? AND haslo=?");
		
		preparedStatement.setString(1, login);
		preparedStatement.setString(2, haslo);
		
		
		ResultSet rs;
		rs = preparedStatement.executeQuery();
		
		if (rs.next() == false) {

		}else {	
			String uzytkownik = rs.getString(1);
			connect.close();
			return uzytkownik;
		}
	
		}
		catch(SQLException e1) {
			e1.getStackTrace();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return "";
		
	}

	public void readDataBase() throws ClassNotFoundException {
		
		    Class.forName("com.mysql.jdbc.Driver");

			url="jdbc:mysql://192.166.219.220:3306/surban";
			try {
			connect = DriverManager.getConnection(url,user,pass);
			
			
			statement=connect.createStatement();
			//writeResultSet(resultSet);
		
			preparedStatement =connect.prepareStatement("INSERT INTO uzytkownik VALUES(default, ?, ?, ?, ?)");
			
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, haslo);
			preparedStatement.setString(3, email);
			preparedStatement.setInt(4, 0);
			
			preparedStatement.executeUpdate();
			connect.close();
			//System.out.println("Connection closed");
			SurbanRecordsApp.incorrectReg.setForeground(Color.GREEN);
			SurbanRecordsApp.incorrectReg.setText(language.getString("zarejestrowano"));
			SurbanRecordsApp.incorrectReg.show();
			SurbanRecordsApp.loginRegister.setText("");
			SurbanRecordsApp.emailRegister.setText("");
			SurbanRecordsApp.passwordRegister.setText("");
			SurbanRecordsApp.passwordRegister1.setText("");
			
			
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
		preparedStatement =connect.prepareStatement("SELECT id_uzytkownika,login FROM `uzytkownik` WHERE login=? AND haslo=?");
		
		preparedStatement.setString(1, login);
		preparedStatement.setString(2, haslo);
		
		
		ResultSet rs;
		rs = preparedStatement.executeQuery();
		
		if (rs.next() == false) {
			//JOptionPane.showMessageDialog(null, "User not found in database", "SurbanRecordsError", JOptionPane.ERROR_MESSAGE);
			
		}else {	
			int id = rs.getInt(1);
			String uzytkownik = rs.getString(2);
			this.checkresult = id;
			this.username = uzytkownik;
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
		
public boolean checkDataBase(String login) throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");

		url="jdbc:mysql://192.166.219.220:3306/surban";
		try {
		connect = DriverManager.getConnection(url,user,pass);
		
		statement=connect.createStatement();
		preparedStatement =connect.prepareStatement("SELECT id_uzytkownika FROM `uzytkownik` WHERE login=?");
		
		preparedStatement.setString(1, login);
		
	
		
		ResultSet rs;
		rs = preparedStatement.executeQuery();
		
		if (rs.next() == false) {
			connect.close();
			return true;
		}else {	
			
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
		return false;
	}
		

	
	}


