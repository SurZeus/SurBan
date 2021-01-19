package mainpackage;
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

import javax.imageio.ImageIO;
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
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JSlider;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.BoxLayout;
public class SurbanRecordsApp {

	static JFrame frmWelcome;
	static  MainScreen main_xd;
	static SurbanRecordsApp window;
	private JPanel OptionsContainer;
	private JPanel LoginCard;
	private JPanel LoginCardBottom;
	private JPanel LoginCardTop;
	private JPanel LeftInfoPanel;
	private JLabel lblNewLabel_2;
	static JTextField loginLogin;
	private JLabel lblYourPassword;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JLabel buttonLogin;
	private JLabel lblDontHaveAccount;
	private JLabel SignUpAlready;
	static JPasswordField passwordLogin;
	private JPanel RegisterCard;
	private JPanel panel_3;
	private JLabel buttonRegister;
	private JLabel lblAlreadyHaveAn;
	private JLabel SignInAlready;
	private JPanel panel_4;
	private JLabel lblRegister;
	public static JTextField loginRegister;
	private JLabel lblRepeatYourPassword;
	public static JPasswordField passwordRegister1;
	private JLabel RegisterShowPassword;
	private JLabel lblEmail;
	public static JTextField emailRegister;
	private JLabel lblPassword;
	public static JPasswordField passwordRegister;
	public static JLabel incorrectReg;
	public static ResourceBundle language;
	public static ValidateLogin loginek;
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
					
					int lang = 2;
					String filename = null;
					language=null;
					Locale l = new Locale("en", "US");

					
					switch(lang)
					{
					    case 1:
						filename = "pl";
						break;

						case 2:
						filename = "en";
						break;

						case 3:
						filename = "de";
						break;
					}

					language = ResourceBundle.getBundle("langs//"+filename, l);
					
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					
					window = new SurbanRecordsApp();
					//main_xd = new MainScreen();
					//SwingUtilities.updateComponentTreeUI(window);
					//SwingUtilities.updateComponentTreeUI(main_xd);
					window.frmWelcome.setVisible(true);
					//main_xd.setVisible(false);
					
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
		
		
		
		frmWelcome = new JFrame();
		frmWelcome.setTitle("Welcome");
		frmWelcome.getContentPane().setBackground(Color.DARK_GRAY);
		frmWelcome.setIconImage(Toolkit.getDefaultToolkit().getImage(SurbanRecordsApp.class.getResource("/img/logoph.png")));
		frmWelcome.setBackground(Color.GRAY);
		frmWelcome.setAlwaysOnTop(true);
		frmWelcome.setBounds(100, 100, 1300, 725);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		frmWelcome.setLocationRelativeTo(null) ;
		
		
		
		LeftInfoPanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		LeftInfoPanel.setOpaque(false);
		LeftInfoPanel.setBackground(new Color(36,36,36,50));
		LeftInfoPanel.setBounds(0, 0, 410, 686);
		frmWelcome.getContentPane().add(LeftInfoPanel);
		LeftInfoPanel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 410, 174);
		lblNewLabel_2.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/sw2.png")));
		LeftInfoPanel.add(lblNewLabel_2);
		
		OptionsContainer = new JPanel() {
			protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		OptionsContainer.setOpaque(false);
		OptionsContainer.setBounds(0, 172, 410, 514);
		LeftInfoPanel.add(OptionsContainer);
		OptionsContainer.setBackground(new Color(36,36,36,1));
		CardLayout loginFormLayout = new CardLayout(0,0);
		OptionsContainer.setLayout(loginFormLayout);
		
		LoginCard = new JPanel() {
				protected void paintComponent(Graphics g)
	    {
	        g.setColor( getBackground() );
	        g.fillRect(0, 0, getWidth(), getHeight());
	        super.paintComponent(g);
	    }
	};
		LoginCard.setOpaque(false);
		OptionsContainer.add(LoginCard, "LoginCard1");
		LoginCard.setBackground(new Color(255,255,255,1));
		LoginCard.setLayout(null);
		
		LoginCardBottom = new JPanel() {
		protected void paintComponent(Graphics g)
	    {
	        g.setColor( getBackground() );
	        g.fillRect(0, 0, getWidth(), getHeight());
	        super.paintComponent(g);
	    }
	};
		LoginCardBottom.setBackground(new Color(255,255,255,1));
		LoginCardBottom.setOpaque(false);
		LoginCardBottom.setBounds(0, 353, 410, 150);
		LoginCard.add(LoginCardBottom);
		GridBagLayout gbl_LoginCardBottom = new GridBagLayout();
		gbl_LoginCardBottom.columnWidths = new int[]{410, 0};
		gbl_LoginCardBottom.rowHeights = new int[]{56, 0, 0, 0};
		gbl_LoginCardBottom.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_LoginCardBottom.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		LoginCardBottom.setLayout(gbl_LoginCardBottom);
		
		RegisterCard = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		RegisterCard.setLayout(null);
		RegisterCard.setOpaque(false);
		RegisterCard.setBackground(new Color(255, 255, 255, 1));
		OptionsContainer.add(RegisterCard, "RegisterCard1");
		
		JLabel incorrectPass = new JLabel(language.getString("incpass"));
		incorrectPass.setForeground(Color.RED);
		incorrectPass.setFont(new Font("Tahoma", Font.BOLD, 12));
		incorrectPass.setBounds(55, 310, 311, 44);
		LoginCard.add(incorrectPass);
		incorrectPass.hide();
		
		 
		buttonLogin = new JLabel(language.getString("zalogujsie"));
		buttonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String login = loginLogin.getText();
				String haslo = String.valueOf(passwordLogin.getPassword());
				
				
				//main_xd.lblUsername.setText(login);
				
			
				
				
				try {
					loginek = new ValidateLogin(login, haslo);
					if(loginek.id == -1) //skip login
					{
						incorrectPass.hide();
						
						main_xd = new MainScreen();
						SwingUtilities.updateComponentTreeUI(main_xd);
						main_xd.setVisible(true);
						window.frmWelcome.setVisible(false);
					}
					else
					{
						passwordLogin.setText("");
						incorrectPass.show();
					}

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonLogin.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buttonLogin.setForeground(Color.LIGHT_GRAY);
			}
		});
		buttonLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		buttonLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonLogin.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_buttonLogin = new GridBagConstraints();
		gbc_buttonLogin.insets = new Insets(0, 0, 5, 0);
		gbc_buttonLogin.gridx = 0;
		gbc_buttonLogin.gridy = 0;
		LoginCardBottom.add(buttonLogin, gbc_buttonLogin);
		
		lblDontHaveAccount = new JLabel(language.getString("dhac"));
		lblDontHaveAccount.setForeground(Color.WHITE);
		lblDontHaveAccount.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDontHaveAccount = new GridBagConstraints();
		gbc_lblDontHaveAccount.insets = new Insets(0, 0, 5, 0);
		gbc_lblDontHaveAccount.gridx = 0;
		gbc_lblDontHaveAccount.gridy = 1;
		LoginCardBottom.add(lblDontHaveAccount, gbc_lblDontHaveAccount);
		
		SignUpAlready = new JLabel(language.getString("zarejestrujsie"));
		SignUpAlready.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SignUpAlready.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				SignUpAlready.setForeground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				SignUpAlready.setForeground(Color.WHITE);
			}
		});
		SignUpAlready.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SignUpAlready.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_SignUpAlready = new GridBagConstraints();
		gbc_SignUpAlready.gridx = 0;
		gbc_SignUpAlready.gridy = 2;
		LoginCardBottom.add(SignUpAlready, gbc_SignUpAlready);
		
		LoginCardTop = new JPanel() {
		protected void paintComponent(Graphics g)
	    {
	        g.setColor( getBackground() );
	        g.fillRect(0, 0, getWidth(), getHeight());
	        super.paintComponent(g);
	    }
	};
		LoginCardTop.setOpaque(false);
		LoginCardTop.setBackground(new Color(255,255,255,1));
		LoginCardTop.setToolTipText("fdgdf");
		LoginCardTop.setBounds(0, 50, 410, 260);
		LoginCard.add(LoginCardTop);
		GridBagLayout gbl_LoginCardTop = new GridBagLayout();
		gbl_LoginCardTop.columnWidths = new int[]{50, 217, 50, 0};
		gbl_LoginCardTop.rowHeights = new int[]{50, 50, 20, 50, 50, 0, 0};
		gbl_LoginCardTop.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_LoginCardTop.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		LoginCardTop.setLayout(gbl_LoginCardTop);
		
		JLabel lblYourUserName = new JLabel(language.getString("login"));
		lblYourUserName.setForeground(Color.WHITE);
		lblYourUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblYourUserName = new GridBagConstraints();
		gbc_lblYourUserName.insets = new Insets(0, 0, 5, 5);
		gbc_lblYourUserName.gridx = 1;
		gbc_lblYourUserName.gridy = 0;
		LoginCardTop.add(lblYourUserName, gbc_lblYourUserName);
		
		loginLogin = new JTextField();
		loginLogin.setCaretColor(Color.LIGHT_GRAY);
		loginLogin.setForeground(Color.LIGHT_GRAY);
		loginLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		loginLogin.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		loginLogin.setOpaque(false);
		loginLogin.setHorizontalAlignment(SwingConstants.CENTER);
		loginLogin.setPreferredSize(new Dimension(4, 25));
		loginLogin.setMinimumSize(new Dimension(4, 20));
		GridBagConstraints gbc_loginLogin = new GridBagConstraints();
		gbc_loginLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_loginLogin.insets = new Insets(0, 0, 5, 5);
		gbc_loginLogin.gridx = 1;
		gbc_loginLogin.gridy = 1;
		LoginCardTop.add(loginLogin, gbc_loginLogin);
		loginLogin.setColumns(20);
		
		lblYourPassword = new JLabel(language.getString("haslo"));
		lblYourPassword.setForeground(Color.WHITE);
		lblYourPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblYourPassword = new GridBagConstraints();
		gbc_lblYourPassword.insets = new Insets(0, 0, 15, 5);
		gbc_lblYourPassword.gridx = 1;
		gbc_lblYourPassword.gridy = 3;
		LoginCardTop.add(lblYourPassword, gbc_lblYourPassword);
		
		passwordLogin = new JPasswordField();
		passwordLogin.setCaretColor(Color.LIGHT_GRAY);
		passwordLogin.setPreferredSize(new Dimension(4, 25));
		passwordLogin.setOpaque(false);
		passwordLogin.setMinimumSize(new Dimension(4, 20));
		passwordLogin.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLogin.setForeground(Color.LIGHT_GRAY);
		passwordLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordLogin.setColumns(20);
		char Ec = passwordLogin.getEchoChar();
		passwordLogin.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_passwordLogin = new GridBagConstraints();
		gbc_passwordLogin.insets = new Insets(0, 0, 5, 5);
		gbc_passwordLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordLogin.gridx = 1;
		gbc_passwordLogin.gridy = 4;
		LoginCardTop.add(passwordLogin, gbc_passwordLogin);
		
		JLabel lblNewLabel_1 = new JLabel(language.getString("ph"));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			int statusIdentifier = 1;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(statusIdentifier == 0) {
				lblNewLabel_1.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye3.png")));
				lblNewLabel_1.setText(language.getString("sh"));
				statusIdentifier = 1;
				passwordLogin.setEchoChar((char)0);
			}
				else {
					lblNewLabel_1.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye4.png")));
					lblNewLabel_1.setText(language.getString("ph"));
					statusIdentifier = 0;
					passwordLogin.setEchoChar(Ec);
				}
			};
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_1.setIconTextGap(8);
		lblNewLabel_1.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye4.png")));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		LoginCardTop.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		panel_3 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panel_3.setOpaque(false);
		panel_3.setBackground(new Color(255, 255, 255, 1));
		panel_3.setBounds(0, 353, 410, 150);
		RegisterCard.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{410, 0};
		gbl_panel_3.rowHeights = new int[]{56, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		
		
		buttonRegister = new JLabel(language.getString("zarejestrujsie"));
		buttonRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mysql baza = new Mysql();
				ValidateAnEmail checkmail = new ValidateAnEmail();
				
				String login = loginRegister.getText();
				String haslo = String.valueOf(passwordRegister.getPassword());
				String haslo1 = String.valueOf(passwordRegister1.getPassword());
				String email = emailRegister.getText(); 
			
				validatePass test = new validatePass(haslo, haslo1);
				ValidateLog log = new ValidateLog(login);

				
				try {
					test.validate();
					log.validate();
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			try {
				checkmail.pobierzEmail(email);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				baza.podajDane(log.tested, test.hashcode, checkmail.tested);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}	
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonRegister.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buttonRegister.setForeground(Color.LIGHT_GRAY);
			}
			
		
		});
		buttonRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		buttonRegister.setForeground(Color.LIGHT_GRAY);
		buttonRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_buttonRegister = new GridBagConstraints();
		gbc_buttonRegister.insets = new Insets(0, 0, 5, 0);
		gbc_buttonRegister.gridx = 0;
		gbc_buttonRegister.gridy = 0;
		panel_3.add(buttonRegister, gbc_buttonRegister);
		
		lblAlreadyHaveAn = new JLabel(language.getString("ahac"));
		lblAlreadyHaveAn.setForeground(Color.WHITE);
		lblAlreadyHaveAn.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblAlreadyHaveAn = new GridBagConstraints();
		gbc_lblAlreadyHaveAn.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlreadyHaveAn.gridx = 0;
		gbc_lblAlreadyHaveAn.gridy = 1;
		panel_3.add(lblAlreadyHaveAn, gbc_lblAlreadyHaveAn);
		
		SignInAlready = new JLabel(language.getString("zalogujsie"));
		SignInAlready.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SignInAlready.setForeground(Color.LIGHT_GRAY);
		SignInAlready.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_SignInAlready = new GridBagConstraints();
		gbc_SignInAlready.gridx = 0;
		gbc_SignInAlready.gridy = 2;
		panel_3.add(SignInAlready, gbc_SignInAlready);
		
		panel_4 = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panel_4.setToolTipText("fdgdf");
		panel_4.setOpaque(false);
		panel_4.setBackground(new Color(255, 255, 255, 1));
		panel_4.setBounds(0, 0, 410, 353);
		RegisterCard.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{50, 217, 50, 0};
		gbl_panel_4.rowHeights = new int[]{20, 50, 20, 50, 0, 50, 20, 50, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		lblRegister = new JLabel(language.getString("login"));
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblRegister = new GridBagConstraints();
		gbc_lblRegister.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegister.gridx = 1;
		gbc_lblRegister.gridy = 0;
		panel_4.add(lblRegister, gbc_lblRegister);
		
		loginRegister = new JTextField();
		loginRegister.setPreferredSize(new Dimension(4, 25));
		loginRegister.setOpaque(false);
		loginRegister.setMinimumSize(new Dimension(4, 20));
		loginRegister.setHorizontalAlignment(SwingConstants.CENTER);
		loginRegister.setForeground(Color.LIGHT_GRAY);
		loginRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		loginRegister.setColumns(20);
		loginRegister.setCaretColor(Color.LIGHT_GRAY);
		loginRegister.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_loginRegister = new GridBagConstraints();
		gbc_loginRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_loginRegister.insets = new Insets(0, 0, 5, 5);
		gbc_loginRegister.gridx = 1;
		gbc_loginRegister.gridy = 1;
		panel_4.add(loginRegister, gbc_loginRegister);
		
		lblEmail = new JLabel(language.getString("email"));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 2;
		panel_4.add(lblEmail, gbc_lblEmail);
		
		emailRegister = new JTextField();
		emailRegister.setPreferredSize(new Dimension(4, 25));
		emailRegister.setOpaque(false);
		emailRegister.setMinimumSize(new Dimension(4, 20));
		emailRegister.setHorizontalAlignment(SwingConstants.CENTER);
		emailRegister.setForeground(Color.LIGHT_GRAY);
		emailRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		emailRegister.setColumns(20);
		emailRegister.setCaretColor(Color.LIGHT_GRAY);
		emailRegister.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_emailRegister = new GridBagConstraints();
		gbc_emailRegister.insets = new Insets(0, 0, 5, 5);
		gbc_emailRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailRegister.gridx = 1;
		gbc_emailRegister.gridy = 3;
		panel_4.add(emailRegister, gbc_emailRegister);
		
		lblPassword = new JLabel(language.getString("haslo"));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 4;
		panel_4.add(lblPassword, gbc_lblPassword);
		
		passwordRegister = new JPasswordField();
		passwordRegister.setPreferredSize(new Dimension(4, 25));
		passwordRegister.setOpaque(false);
		passwordRegister.setMinimumSize(new Dimension(4, 20));
		passwordRegister.setHorizontalAlignment(SwingConstants.CENTER);
		passwordRegister.setForeground(Color.LIGHT_GRAY);
		passwordRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordRegister.setColumns(20);
		passwordRegister.setCaretColor(Color.LIGHT_GRAY);
		passwordRegister.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_passwordRegister = new GridBagConstraints();
		gbc_passwordRegister.insets = new Insets(0, 0, 5, 5);
		gbc_passwordRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordRegister.gridx = 1;
		gbc_passwordRegister.gridy = 5;
		panel_4.add(passwordRegister, gbc_passwordRegister);
		
		lblRepeatYourPassword = new JLabel(language.getString("powtorzhaslo"));
		lblRepeatYourPassword.setForeground(Color.WHITE);
		lblRepeatYourPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblRepeatYourPassword = new GridBagConstraints();
		gbc_lblRepeatYourPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepeatYourPassword.gridx = 1;
		gbc_lblRepeatYourPassword.gridy = 6;
		panel_4.add(lblRepeatYourPassword, gbc_lblRepeatYourPassword);
		
		passwordRegister1 = new JPasswordField();
		passwordRegister1.setPreferredSize(new Dimension(4, 25));
		passwordRegister1.setOpaque(false);
		passwordRegister1.setMinimumSize(new Dimension(4, 20));
		passwordRegister1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordRegister1.setForeground(Color.LIGHT_GRAY);
		passwordRegister1.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordRegister1.setColumns(20);
		passwordRegister1.setCaretColor(Color.LIGHT_GRAY);
		passwordRegister1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_passwordRegister1 = new GridBagConstraints();
		gbc_passwordRegister1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordRegister1.insets = new Insets(0, 0, 5, 5);
		gbc_passwordRegister1.gridx = 1;
		gbc_passwordRegister1.gridy = 7;
		panel_4.add(passwordRegister1, gbc_passwordRegister1);
		
		RegisterShowPassword = new JLabel(language.getString("ph"));
		RegisterShowPassword.setIconTextGap(8);
		RegisterShowPassword.setForeground(Color.LIGHT_GRAY);
		RegisterShowPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_RegisterShowPassword = new GridBagConstraints();
		gbc_RegisterShowPassword.anchor = GridBagConstraints.WEST;
		gbc_RegisterShowPassword.insets = new Insets(0, 0, 5, 5);
		gbc_RegisterShowPassword.gridx = 1;
		gbc_RegisterShowPassword.gridy = 8;
		panel_4.add(RegisterShowPassword, gbc_RegisterShowPassword);
		RegisterShowPassword.addMouseListener(new MouseAdapter() {
			int statusIdentifier = 1;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(statusIdentifier == 0) {
					RegisterShowPassword.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye3.png")));
					RegisterShowPassword.setText(language.getString("sh"));
				statusIdentifier = 1;
			passwordRegister.setEchoChar((char)0);
			}
				else {
					RegisterShowPassword.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye4.png")));
					RegisterShowPassword.setText(language.getString("ph"));
					statusIdentifier = 0;
					passwordRegister.setEchoChar(Ec);
				}
			};
			@Override
			public void mouseExited(MouseEvent e) {
				RegisterShowPassword.setForeground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				RegisterShowPassword.setForeground(Color.WHITE);
			}
		});
		RegisterShowPassword.setIconTextGap(8);
		RegisterShowPassword.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye4.png")));
		
		incorrectReg = new JLabel(language.getString("incpass"));
		GridBagConstraints gbc_incorrectReg = new GridBagConstraints();
		gbc_incorrectReg.anchor = GridBagConstraints.NORTH;
		gbc_incorrectReg.fill = GridBagConstraints.HORIZONTAL;
		gbc_incorrectReg.insets = new Insets(0, 0, 0, 5);
		gbc_incorrectReg.gridx = 1;
		gbc_incorrectReg.gridy = 9;
		panel_4.add(incorrectReg, gbc_incorrectReg);
		incorrectReg.setForeground(Color.RED);
		incorrectReg.setFont(new Font("Tahoma", Font.BOLD, 12));
		incorrectReg.hide();
		
		JPanel panel_1 = new JPanel() {
		protected void paintComponent(Graphics g)
	    {
	        g.setColor( getBackground() );
	        g.fillRect(0, 0, getWidth(), getHeight());
	        super.paintComponent(g);
	    }
		};
		panel_1.setOpaque(false);
		panel_1.setBackground(new Color(179,179,179,150));
		panel_1.setBounds(412, 0, 872, 686);
		frmWelcome.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(793, 654, 79, 32);
		panel_1.add(panel_2);
		
		lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/settings.png")));
		
		JLabel lblWelcome = new JLabel("SurbanRecords");
		lblWelcome.setFont(new Font("Dubai Medium", Font.BOLD, 56));
		lblWelcome.setForeground(Color.DARK_GRAY);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(121, 177, 593, 316);
		panel_1.add(lblWelcome);
		
		JLabel LoginWindowBackgroundLabel = new JLabel("");
		LoginWindowBackgroundLabel.setBounds(412, 0, 872, 700);
		frmWelcome.getContentPane().add(LoginWindowBackgroundLabel);
		LoginWindowBackgroundLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgcart.png")).getImage().getScaledInstance(1000, 725, Image.SCALE_SMOOTH)));
		
		
		SignUpAlready.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				SignUpAlready.setForeground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				SignUpAlready.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			loginFormLayout.show(OptionsContainer, "RegisterCard1");
			}
		});
		SignInAlready.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				SignInAlready.setForeground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				SignInAlready.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			loginFormLayout.show(OptionsContainer, "LoginCard1");
			}
		});
		
	}
}
