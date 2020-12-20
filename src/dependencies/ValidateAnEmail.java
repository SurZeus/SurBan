package dependencies;
import mainpackage.SurbanRecordsApp;

import java.awt.Color;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;


public class ValidateAnEmail {

	private String email;
	public String tested;
	public static ResourceBundle language = SurbanRecordsApp.language;
	
	public ValidateAnEmail() {
		
	}
	
	public void pobierzEmail(String email) throws Exception {
		this.email=email;
		
		if(!this.email.isEmpty()) {
			checkEmail();
		}
		return;
	}
	
	public void checkEmail()
	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher m = pattern.matcher(email);
	    System.out.println();
	       if (m.matches()==false) {
	    	   SurbanRecordsApp.incorrectReg.setForeground(Color.RED);
	    	   SurbanRecordsApp.incorrectReg.setText(language.getString("vE_Err_0"));
           	   SurbanRecordsApp.incorrectReg.show();
	    	   this.tested = null;
	       }
	       this.tested = email;
	       
	}
}

