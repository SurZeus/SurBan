package dependencies;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import mainpackage.SurbanRecordsApp;


public class ValidateLog {
	
	static String login = null;
	public String tested = null;
	public static ResourceBundle language = SurbanRecordsApp.language;
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
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vL_Err_0"));
	            	SurbanRecordsApp.incorrectReg.show();
	                isValid = false;
	                return isValid;
	            }
	            String specialchar = "(.*[ ,;].*$)";
	            if (login.matches(specialchar))
	            {
	            	SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	            	SurbanRecordsApp.incorrectReg.setText(language.getString("vL_Err_0"));
	            	SurbanRecordsApp.incorrectReg.show();
	                isValid = false;
	                return isValid;
	            }
				return isValid;
	    }
}
	            
	