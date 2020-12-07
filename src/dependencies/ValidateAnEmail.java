package dependencies;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;


public class ValidateAnEmail {

	private String email;
	public String tested;
	
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
	    	   JOptionPane.showMessageDialog(null, "Email is not valid! Try again.", "SurbanRecordsError", JOptionPane.ERROR_MESSAGE);
	    	   this.tested = null;
	       }
	       this.tested = email;
	       
	}
}

