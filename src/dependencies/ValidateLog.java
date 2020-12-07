package dependencies;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.swing.JOptionPane;


public class ValidateLog {
	
	static String login = null;
	public String tested = null;
	
	public static String hashcode = null;
	
	public ValidateLog(String login)
	{
		this.login=login;
	}
	
	public String validate() throws NoSuchAlgorithmException
	{
		if(!isValidLogin())
		{
			return null;
		}
		this.tested = this.login;
		return null;
	}
		
		
	
		
	  private boolean isValidLogin()
	    {
	            boolean isValid = true;
	            if (login.length() > 12 || login.length() < 4)
	            {
	            	 JOptionPane.showMessageDialog(null, "Login  must be less than 12 and more than 4 characters in length.", "SurbanRecordsError", JOptionPane.ERROR_MESSAGE);
	                 isValid = false;
	                 return isValid;
	            }
	            String specialchar = "(.*[ ,;].*$)";
	            if (login.matches(specialchar))
	            {
	            	JOptionPane.showMessageDialog(null, "There's space in login", "SurbanRecordsError", JOptionPane.ERROR_MESSAGE);
	                 isValid = false;
	                 return isValid;
	            }
				return isValid;
	    }
}
	            
	