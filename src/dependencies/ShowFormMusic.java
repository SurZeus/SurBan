package dependencies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowFormMusic {
	
		private Connection connect=null;
		private Statement statement=null;
		private ResultSet resultSet=null;
		

		private String user="surb";
		private String pass="zlRhOdY232..0";
		private String login = null;
		private String haslo = null;
		private String url;
		
	public ShowFormMusic() {
		
		}
			
		
		public void displayMusic() throws Exception {
			try {
				url="jdbc:mysql://192.166.219.220:3306/surban";
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager.getConnection(url,user,pass);
				
				statement=connect.createStatement();
				
				resultSet=statement.executeQuery("SELECT nazwa_utworu, typ_utworu, data_wydania FROM utwor");
				writeResultSet(resultSet);

				
				
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
				String nazwa_utworu=resultSet.getString("nazwa_utworu");
				String typ_utworu=resultSet.getString("typ_utworu");
				String data_wydania=resultSet.getString("dawa_wydania");
			}
		}
		
		
		
	

}
