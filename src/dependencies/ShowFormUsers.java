package dependencies;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowFormUsers {
	
		private Connection connect=null;
		private Statement statement=null;
		private ResultSet resultSet=null;
		public static String[][] Users ;
		private String user="surb";
		private String pass="zlRhOdY232..0";
		private String login = null;
		private String haslo = null;
		private String url;
		public static int count;
	public ShowFormUsers() {
		
		}
			

		public void displayMusic() throws Exception {
			try {
				url="jdbc:mysql://192.166.219.220:3306/surban";
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager.getConnection(url,user,pass);
				
				statement=connect.createStatement();
				Statement stmt = connect.createStatement();
				ResultSet rs;
				rs=stmt.executeQuery("SELECT COUNT(login) FROM uzytkownik");
			
				if(rs.next()) 
				count = rs.getInt(1);
				
				System.out.println("Liczba albumow");
				System.out.println(count);
			Users = new String[count][3];
			 resultSet=statement.executeQuery("SELECT id_uzytkownika,login,uprawnienia  FROM uzytkownik");
			 writeResultSet(resultSet,count,Users);
				connect.close();
				System.out.println("Connection closed");
				////INSERT//////////////////////////////////////
			}catch (Exception e) {
				System.out.println("Blad polaczenia z baza danych(arttysci)");
			}finally{
			      //closing ResultSet,PreparedStatement and Connection object
		    }
		}
		
		public void writeResultSet(ResultSet resultSet,int ct,String[][] tb) throws SQLException
		{
			
		
			int i =0;
			while (resultSet.next()) {
				tb[i][0]=resultSet.getString("id_uzytkownika");
				tb[i][1]=resultSet.getString("login");
				tb[i][2]=resultSet.getString("uprawnienia");
			
				i++;
			
			}
			System.out.println(tb[2][0]);
		}
		
		
		
		
	

}
