package dependencies;
import  mainpackage.SurbanRecordsApp;

import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;


public class validatePass {
	
	static String pass = null;
	static String pass1 = null;
	public static String hashcode = null;
	public static ResourceBundle language = SurbanRecordsApp.language;
	
	public validatePass(String password, String password1)
	{
		this.pass = password;
		this.pass1 = password1;
	}
	public validatePass()
	{
	
	}
	
	public String validate() throws NoSuchAlgorithmException
	{
		 String first_hash;
		 String hashcode = null;
		 String password = this.pass;
		
		 if(this.pass.isEmpty() || this.pass1.isEmpty())
		  {
			  SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
        	  SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_7"));
        	  SurbanRecordsApp.incorrectReg.show();
			  return null;
		  }
		 
	
		boolean validPassword = isValidPassword();
		
		
        if(validPassword)
        {
        	first_hash = hashPass(password);
        	
        	if(!first_hash.isEmpty())
        	{
        		hashcode = hashPass(first_hash);
        	}
        	else
        	{
        		//System.out.println("Second hashing failed.");
        		return null;
        	}
        	
        }
        else
        {
        	//System.out.println("Password hashing or verification failed.");
        	return null;
        }
        
        SurbanRecordsApp.incorrectReg.setForeground(Color.GREEN);
        SurbanRecordsApp.incorrectReg.setText("Pomyœlnie zarejestrowano!");
		return hashcode;
		
	}
	
	  private boolean isValidPassword()
	    {
	            boolean isValid = true;
	            if (pass.length() > 20 || pass.length() < 8)
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	 SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_0"));
	            	 SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            String upperCaseChars = "(.*[A-Z].*)";
	            if (!pass.matches(upperCaseChars ))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_1"));
	            	SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            String lowerCaseChars = "(.*[a-z].*)";
	            if (!pass.matches(lowerCaseChars ))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_2"));
	            	SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            String numbers = "(.*[0-9].*)";
	            if (!pass.matches(numbers ))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_3"));
	            	SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            String specialChars = "(.*[@,#,$,%].*$)";
	            if (!pass.matches(specialChars ))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_4"));
	            	SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            if(!pass.equals(pass1))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_5"));
	            	SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            String specialchar = "(.*[ ].*$)";
	            if (pass.matches(specialchar))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vP_Err_6"));
	            	SurbanRecordsApp.incorrectReg.show();
	                 isValid = false;
	                 return isValid;
	            }
	            
	            return isValid; 
	    }
	
	  public String hashPass(String password) throws NoSuchAlgorithmException
	  {
		  
		   if(this.pass.isEmpty() || this.pass1.isEmpty())
		  {
			  //System.out.println("Haslo nie zostalo wprowadzone w konstruktorze");
			  return null;
			 
		  }
		  
		  String hashcode = null;
		  MessageDigest md = MessageDigest.getInstance("MD5");
		  md.update(password.getBytes());
		  byte[] digest = md.digest();
		  hashcode = Base64.getEncoder().encodeToString(digest);
		  
		  
		  
		  
		  this.hashcode = hashcode;
		  return hashcode;
	  }
	  
	  public String simplehash(String password) throws NoSuchAlgorithmException
	  {
		  
		   if(password.isEmpty())
		  {
			  //System.out.println("Haslo nie zostalo wprowadzone w konstruktorze");
			  return null;
			 
		  }
		  
		  String hashcode = null;
		  MessageDigest md = MessageDigest.getInstance("MD5");
		  md.update(password.getBytes());
		  byte[] digest = md.digest();
		  hashcode = Base64.getEncoder().encodeToString(digest);
		  
		  
		  return hashcode;
	  }
	  
	  
}
