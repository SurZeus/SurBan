import dependencies.*;
import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import dependencies.ImagePanel;
import dependencies.Mysql;
import dependencies.RoundedBorder;
import dependencies.TransparentPanel;

import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.swing.JSlider;
import static javax.swing.JOptionPane.showMessageDialog;
public class SurbanRecordsApp {

	private JFrame frame;
	private JTextField loginLogin;
	private JPasswordField passwordLogin;
	private JTextField loginRegister;
	private JPasswordField passwordRegister;
	private JTextField emailRegister;
	private JPasswordField passwordRegister1;
	private static  MainScreen main_xd;
	private static SurbanRecordsApp window;
	/**
	 * @wbp.nonvisual location=272,359
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					
					window = new SurbanRecordsApp();
					main_xd = new MainScreen();
					//SwingUtilities.updateComponentTreeUI(window);
					SwingUtilities.updateComponentTreeUI(main_xd);
					window.frame.setVisible(true);
					main_xd.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SurbanRecordsApp() {
		initialize();
	}
    
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImagePanel backgroundImage = new ImagePanel();
		backgroundImage.setOpaque(false);
		backgroundImage.setImage(Toolkit.getDefaultToolkit().getImage(SurbanRecordsApp.class.getResource("/img/logoimage.jpg")));
		backgroundImage.setBounds(0, 0, 994, 629);
		frame.getContentPane().add(backgroundImage);
		backgroundImage.setLayout(null);
		
		TransparentPanel windowLogin = new TransparentPanel();
		windowLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		windowLogin.setBounds(247, 11, 500, 607);
		windowLogin.setBackground(new Color(0,0,0,128));
		backgroundImage.add(windowLogin);
		windowLogin.setLayout(null);
		
		loginLogin = new JTextField();
		loginLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginLogin.setOpaque(false);
		loginLogin.setForeground(Color.WHITE);
		loginLogin.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		loginLogin.setBounds(90, 179, 320, 51);
		windowLogin.add(loginLogin);
		loginLogin.setColumns(10);
		
		
		passwordLogin = new JPasswordField();
		passwordLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordLogin.setOpaque(false);
		passwordLogin.setForeground(Color.WHITE);
		passwordLogin.setBorder(new TitledBorder(null, "Has\u0142o", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		passwordLogin.setBounds(90, 276, 320, 51);
		windowLogin.add(passwordLogin);
		Mysql baza = new Mysql();
		ValidateAnEmail checkmail = new ValidateAnEmail();
		
		JButton buttonLogin = new JButton("Zaloguj si\u0119");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String login = loginLogin.getText();
				String haslo = String.valueOf(passwordLogin.getPassword());
				
				main_xd.lblUsername.setText(login);
				System.out.println(main_xd.UserLogin);
			
				
				
				try {
					ValidateLogin loginek = new ValidateLogin(login, haslo);
					if(loginek.id != -1)
					{
						main_xd.setVisible(true);
						window.frame.setVisible(false);
					}

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
	            /*
				try {
					baza.podajDane(login, haslo);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            */
				
			}
		});
		buttonLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonLogin.setForeground(Color.WHITE);
		buttonLogin.setBorder(new RoundedBorder(20));
		buttonLogin.setContentAreaFilled(false);
		buttonLogin.setBounds(90, 470, 320, 51);
		windowLogin.add(buttonLogin);
		windowLogin.show();
		
		TransparentPanel windowRegister = new TransparentPanel();
		windowRegister.setBounds(247, 11, 500, 607);
		backgroundImage.add(windowRegister);
		windowRegister.setLayout(null);
		windowRegister.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		windowRegister.setBackground(new Color(0, 0, 0, 128));
		
		JButton buttonRegister = new JButton("Zarejestruj si\u0119");
		
		buttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login = loginRegister.getText();
				String haslo = String.valueOf(passwordRegister.getPassword());
				String haslo1 = String.valueOf(passwordRegister1.getPassword());
				String email = emailRegister.getText(); 
			
				validatePass test = new validatePass(haslo, haslo1);
				
				try {
					System.out.println(test.validate());
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			try {
				checkmail.pobierzEmail(email);
				emailRegister.setText("");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				baza.podajDane(login, haslo, email);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
				
				
				
				/*	if (login.isEmpty() || haslo.isEmpty() || email.isEmpty()) {
					showMessageDialog(null, "Nie wype³ni³eœ wszystkich danych");
				}
				else if(Arrays.equals(passwordRegister.getPassword(),passwordRRegister.getPassword()))
	            {
					try {
						baza.podajDane(login, haslo, email);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                  
	            }else {
	            	    windowRegister.showMessageDialog(null, "Passwords do not match.");
	                    passwordRegister.setText(null);
	                    passwordRRegister.setText(null);
	                    showMessageDialog(null, "Has³a nie s¹ takie sme, spróbuj ponownie");
	            } */
			}

		});
		buttonRegister.setForeground(Color.WHITE);
		buttonRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonRegister.setContentAreaFilled(false);
		buttonRegister.setBorder(new RoundedBorder(20));
		buttonRegister.setBounds(90, 470, 320, 51);
		windowRegister.add(buttonRegister);
		
		passwordRegister = new JPasswordField();
		passwordRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordRegister.setOpaque(false);
		passwordRegister.setForeground(Color.WHITE);
		passwordRegister.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Has\u0142o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		passwordRegister.setBounds(90, 276, 320, 51);
		windowRegister.add(passwordRegister);
		
		passwordRegister1 = new JPasswordField();
		passwordRegister1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordRegister1.setBounds(90, 373, 320, 51);
		windowRegister.add(passwordRegister1);
		passwordRegister1.setOpaque(false);
		passwordRegister1.setForeground(Color.WHITE);
		passwordRegister1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Powt\u00F3rz has\u0142o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		
		emailRegister = new JTextField();
		emailRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailRegister.setOpaque(false);
		emailRegister.setForeground(Color.WHITE);
		emailRegister.setColumns(10);
		emailRegister.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "E-mail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		emailRegister.setBounds(90, 82, 320, 51);
		windowRegister.add(emailRegister);
		
		loginRegister = new JTextField();
		loginRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginRegister.setOpaque(false);
		loginRegister.setForeground(Color.WHITE);
		loginRegister.setColumns(10);
		loginRegister.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		loginRegister.setBounds(90, 179, 320, 51);
		windowRegister.add(loginRegister);
		windowRegister.hide();
		
		JToggleButton buttonSwitch = new JToggleButton("Logowanie");
		buttonSwitch.setForeground(Color.BLACK);
		buttonSwitch.setSelected(true);
		buttonSwitch.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonSwitch.setContentAreaFilled(false);
		buttonSwitch.setBounds(777, 11, 193, 48);
		buttonSwitch.setBorder(new RoundedBorder(20));
		buttonSwitch.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(buttonSwitch.isSelected())
				{
				buttonSwitch.setText("Rejestracja");
				windowRegister.hide();
				windowLogin.show();
				}
				else if(!buttonSwitch.isSelected())
				{
				buttonSwitch.setText("Logowanie");
				windowLogin.hide();
				windowRegister.show();
				}
				backgroundImage.add(buttonSwitch);
				
			}
		});	
		backgroundImage.add(buttonSwitch);
		
		
	}
}
