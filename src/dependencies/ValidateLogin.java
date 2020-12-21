package dependencies;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ValidateLogin {
   public Mysql baza = null;
   public String hashcode = null;
   public String username;
   public int id = -1;
 
   
 public ValidateLogin(String login, String haslo) throws ClassNotFoundException, NoSuchAlgorithmException{
	 baza = new Mysql();
	 
	 if(haslo=="")
	 {
		 return;
	 }
	 
	 
	 hashcode = hash(hash(haslo));
	 if(hashcode.isEmpty())
	 {
		 return;
	 }
	 baza.checkDataBase(login, hashcode);
	 this.id = baza.checkresult;
	 this.username = baza.username;
 }
 
 public String hash(String tohash) throws NoSuchAlgorithmException
 {
	  if(tohash=="")
	  {
		  return null;
	  }
	  MessageDigest md = MessageDigest.getInstance("MD5");
	  md.update(tohash.getBytes());
	  byte[] digest = md.digest();
	  hashcode = Base64.getEncoder().encodeToString(digest);
	  return hashcode;
 }

}
