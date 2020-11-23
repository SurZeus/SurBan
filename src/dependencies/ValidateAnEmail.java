package dependencies;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnEmail {
	private static String email;
	public ValidateAnEmail() {
		
	}
	public void podajEmail(String email) {
		
			this.email=email;
			boolean a = isValid(email);
			if (a == true) {
				
			}else {
				
				showMessageDialog(null, "Nieprawid³owy email, spróbuj ponownie");
			}
		}
	   
	static boolean isValid(String email) {
		  
	      String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	      return email.matches(regex);
	   }

	  
	   public static void main(String[] args) {
		    
		   
	   }
	   
	}
