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
		public static String[][] Utwory ;
		private String user="surb";
		private String pass="zlRhOdY232..0";
		private String login = null;
		private String haslo = null;
		private String url;
		public static int count;
	public ShowFormMusic() {
		
		}
			

		public void displayMusic() throws Exception {
			try {
				url="jdbc:mysql://192.166.219.220:3306/surban";
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager.getConnection(url,user,pass);
				
				statement=connect.createStatement();
				Statement stmt = connect.createStatement();
				ResultSet rs;
				rs=stmt.executeQuery("SELECT COUNT(nazwa_utworu) FROM utwor");
			
				if(rs.next()) 
				count = rs.getInt(1);
				
				
			
				System.out.println(count);
			 Utwory = new String[count][4];
			 resultSet=statement.executeQuery("SELECT nazwa_utworu, nazwa_wykonawcy, album, czas_trwania FROM utwor");
			 writeResultSet(resultSet,count,Utwory);
				connect.close();
				System.out.println("Connection closed");
				////INSERT//////////////////////////////////////
			}catch (Exception e) {
				System.out.println("Blad polaczenia z baza danych");
			}finally{
			      //closing ResultSet,PreparedStatement and Connection object
		    }
		}
		
		public void writeResultSet(ResultSet resultSet,int ct,String[][] tb) throws SQLException
		{
			
		
			int i =0;
			while (resultSet.next()) {
				tb[i][0]=resultSet.getString("nazwa_utworu");
				tb[i][1]=resultSet.getString("nazwa_wykonawcy");
				tb[i][2]=resultSet.getString("album");
				tb[i][3]=resultSet.getString("czas_trwania");
				i++;
			
			}
			System.out.println(tb[1]);
		}
		
		
		
		
	

}
