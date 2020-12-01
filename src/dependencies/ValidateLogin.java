package dependencies;


public class ValidateLogin {
   public Mysql baza = null;
   public int id = -1;
 
   
 public ValidateLogin(String login, String haslo) throws ClassNotFoundException{
	 baza = new Mysql();
	 baza.checkDataBase(login, haslo);
	 this.id = baza.checkresult;
 }

}
