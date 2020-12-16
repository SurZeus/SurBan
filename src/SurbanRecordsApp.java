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

	private JFrame frmWelcome;
	private static  MainScreen main_xd;
	private static SurbanRecordsApp window;
	private JPanel OptionsContainer;
	private JPanel LoginCard;
	private JPanel LoginCardBottom;
	private JPanel LoginCardTop;
	private JPanel LeftInfoPanel;
	private JLabel lblNewLabel_2;
	private JTextField LoginField;
	private JLabel lblYourPassword;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JLabel SignInButton;
	private JLabel lblDontHaveAccount;
	private JLabel SignUpAlready;
	private JPasswordField textField;
	private JPanel RegisterCard;
	private JPanel panel_3;
	private JLabel lblSignUp;
	private JLabel lblAlreadyHaveAn;
	private JLabel SignInAlready;
	private JPanel panel_4;
	private JLabel lblRegister;
	private JTextField RegisterLogin;
	private JLabel lblRepeatYourPassword;
	private JPasswordField RegisterRepeatPassword;
	private JLabel RegisterShowPassword;
	private JLabel lblEmail;
	private JTextField RegisterEmail;
	private JLabel lblPassword;
	private JPasswordField RegisterPassword;
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
					window.frmWelcome.setVisible(true);
					main_xd.setVisible(true);
					
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
		
		SignInButton = new JLabel("Sign In");
		SignInButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		SignInButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		SignInButton.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_SignInButton = new GridBagConstraints();
		gbc_SignInButton.insets = new Insets(0, 0, 5, 0);
		gbc_SignInButton.gridx = 0;
		gbc_SignInButton.gridy = 0;
		LoginCardBottom.add(SignInButton, gbc_SignInButton);
		
		lblDontHaveAccount = new JLabel("Dont Have Account Yet?");
		lblDontHaveAccount.setForeground(Color.WHITE);
		lblDontHaveAccount.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDontHaveAccount = new GridBagConstraints();
		gbc_lblDontHaveAccount.insets = new Insets(0, 0, 5, 0);
		gbc_lblDontHaveAccount.gridx = 0;
		gbc_lblDontHaveAccount.gridy = 1;
		LoginCardBottom.add(lblDontHaveAccount, gbc_lblDontHaveAccount);
		
		SignUpAlready = new JLabel("Sign Up");
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
		
		JLabel lblYourUserName = new JLabel("Login");
		lblYourUserName.setForeground(Color.WHITE);
		lblYourUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblYourUserName = new GridBagConstraints();
		gbc_lblYourUserName.insets = new Insets(0, 0, 15, 5);
		gbc_lblYourUserName.gridx = 1;
		gbc_lblYourUserName.gridy = 0;
		LoginCardTop.add(lblYourUserName, gbc_lblYourUserName);
		
		LoginField = new JTextField();
		LoginField.setCaretColor(Color.LIGHT_GRAY);
		LoginField.setForeground(Color.LIGHT_GRAY);
		LoginField.setFont(new Font("Tahoma", Font.BOLD, 15));
		LoginField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		LoginField.setOpaque(false);
		LoginField.setHorizontalAlignment(SwingConstants.CENTER);
		LoginField.setPreferredSize(new Dimension(4, 25));
		LoginField.setMinimumSize(new Dimension(4, 20));
		GridBagConstraints gbc_LoginField = new GridBagConstraints();
		gbc_LoginField.fill = GridBagConstraints.HORIZONTAL;
		gbc_LoginField.insets = new Insets(0, 0, 5, 5);
		gbc_LoginField.gridx = 1;
		gbc_LoginField.gridy = 1;
		LoginCardTop.add(LoginField, gbc_LoginField);
		LoginField.setColumns(20);
		
		lblYourPassword = new JLabel(" Password");
		lblYourPassword.setForeground(Color.WHITE);
		lblYourPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblYourPassword = new GridBagConstraints();
		gbc_lblYourPassword.insets = new Insets(0, 0, 15, 5);
		gbc_lblYourPassword.gridx = 1;
		gbc_lblYourPassword.gridy = 3;
		LoginCardTop.add(lblYourPassword, gbc_lblYourPassword);
		
		textField = new JPasswordField();
		textField.setCaretColor(Color.LIGHT_GRAY);
		textField.setPreferredSize(new Dimension(4, 25));
		textField.setOpaque(false);
		textField.setMinimumSize(new Dimension(4, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setColumns(20);
		char Ec = textField.getEchoChar();
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		LoginCardTop.add(textField, gbc_textField);
		
		JLabel lblNewLabel_1 = new JLabel("Show Password");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			int statusIdentifier = 1;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(statusIdentifier == 0) {
				lblNewLabel_1.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye3.png")));
				lblNewLabel_1.setText("Hide Password");
				statusIdentifier = 1;
				textField.setEchoChar((char)0);
			}
				else {
					lblNewLabel_1.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye4.png")));
					lblNewLabel_1.setText("Show Password");
					statusIdentifier = 0;
					textField.setEchoChar(Ec);
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
		
		RegisterCard = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		RegisterCard.setLayout(null);
		RegisterCard.setOpaque(false);
		RegisterCard.setBackground(new Color(255, 255, 255, 1));
		OptionsContainer.add(RegisterCard, "RegisterCard1");
		
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
		
		lblSignUp = new JLabel("Sign Up");
		lblSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblSignUp.setForeground(Color.LIGHT_GRAY);
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblSignUp = new GridBagConstraints();
		gbc_lblSignUp.insets = new Insets(0, 0, 5, 0);
		gbc_lblSignUp.gridx = 0;
		gbc_lblSignUp.gridy = 0;
		panel_3.add(lblSignUp, gbc_lblSignUp);
		
		lblAlreadyHaveAn = new JLabel("Already Have An Account?");
		lblAlreadyHaveAn.setForeground(Color.WHITE);
		lblAlreadyHaveAn.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblAlreadyHaveAn = new GridBagConstraints();
		gbc_lblAlreadyHaveAn.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlreadyHaveAn.gridx = 0;
		gbc_lblAlreadyHaveAn.gridy = 1;
		panel_3.add(lblAlreadyHaveAn, gbc_lblAlreadyHaveAn);
		
		SignInAlready = new JLabel("Sign In");
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
		gbl_panel_4.rowHeights = new int[]{20, 50, 20, 50, 0, 50, 20, 50, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		lblRegister = new JLabel("Login");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblRegister = new GridBagConstraints();
		gbc_lblRegister.insets = new Insets(0, 0, 15, 5);
		gbc_lblRegister.gridx = 1;
		gbc_lblRegister.gridy = 0;
		panel_4.add(lblRegister, gbc_lblRegister);
		
		RegisterLogin = new JTextField();
		RegisterLogin.setPreferredSize(new Dimension(4, 25));
		RegisterLogin.setOpaque(false);
		RegisterLogin.setMinimumSize(new Dimension(4, 20));
		RegisterLogin.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterLogin.setForeground(Color.LIGHT_GRAY);
		RegisterLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		RegisterLogin.setColumns(20);
		RegisterLogin.setCaretColor(Color.LIGHT_GRAY);
		RegisterLogin.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_RegisterLogin = new GridBagConstraints();
		gbc_RegisterLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_RegisterLogin.insets = new Insets(0, 0, 5, 5);
		gbc_RegisterLogin.gridx = 1;
		gbc_RegisterLogin.gridy = 1;
		panel_4.add(RegisterLogin, gbc_RegisterLogin);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 2;
		panel_4.add(lblEmail, gbc_lblEmail);
		
		RegisterEmail = new JTextField();
		RegisterEmail.setPreferredSize(new Dimension(4, 25));
		RegisterEmail.setOpaque(false);
		RegisterEmail.setMinimumSize(new Dimension(4, 20));
		RegisterEmail.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterEmail.setForeground(Color.LIGHT_GRAY);
		RegisterEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		RegisterEmail.setColumns(20);
		RegisterEmail.setCaretColor(Color.LIGHT_GRAY);
		RegisterEmail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_RegisterEmail = new GridBagConstraints();
		gbc_RegisterEmail.insets = new Insets(0, 0, 5, 5);
		gbc_RegisterEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_RegisterEmail.gridx = 1;
		gbc_RegisterEmail.gridy = 3;
		panel_4.add(RegisterEmail, gbc_RegisterEmail);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 4;
		panel_4.add(lblPassword, gbc_lblPassword);
		
		RegisterPassword = new JPasswordField();
		RegisterPassword.setPreferredSize(new Dimension(4, 25));
		RegisterPassword.setOpaque(false);
		RegisterPassword.setMinimumSize(new Dimension(4, 20));
		RegisterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterPassword.setForeground(Color.LIGHT_GRAY);
		RegisterPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		RegisterPassword.setColumns(20);
		RegisterPassword.setCaretColor(Color.LIGHT_GRAY);
		RegisterPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_RegisterPassword = new GridBagConstraints();
		gbc_RegisterPassword.insets = new Insets(0, 0, 5, 5);
		gbc_RegisterPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_RegisterPassword.gridx = 1;
		gbc_RegisterPassword.gridy = 5;
		panel_4.add(RegisterPassword, gbc_RegisterPassword);
		
		lblRepeatYourPassword = new JLabel("Repeat Your Password");
		lblRepeatYourPassword.setForeground(Color.WHITE);
		lblRepeatYourPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblRepeatYourPassword = new GridBagConstraints();
		gbc_lblRepeatYourPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblRepeatYourPassword.gridx = 1;
		gbc_lblRepeatYourPassword.gridy = 6;
		panel_4.add(lblRepeatYourPassword, gbc_lblRepeatYourPassword);
		
		RegisterRepeatPassword = new JPasswordField();
		RegisterRepeatPassword.setPreferredSize(new Dimension(4, 25));
		RegisterRepeatPassword.setOpaque(false);
		RegisterRepeatPassword.setMinimumSize(new Dimension(4, 20));
		RegisterRepeatPassword.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterRepeatPassword.setForeground(Color.LIGHT_GRAY);
		RegisterRepeatPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		RegisterRepeatPassword.setColumns(20);
		RegisterRepeatPassword.setCaretColor(Color.LIGHT_GRAY);
		RegisterRepeatPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		GridBagConstraints gbc_RegisterRepeatPassword = new GridBagConstraints();
		gbc_RegisterRepeatPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_RegisterRepeatPassword.insets = new Insets(0, 0, 5, 5);
		gbc_RegisterRepeatPassword.gridx = 1;
		gbc_RegisterRepeatPassword.gridy = 7;
		panel_4.add(RegisterRepeatPassword, gbc_RegisterRepeatPassword);
		
		RegisterShowPassword = new JLabel("Show Password");
		RegisterShowPassword.setIconTextGap(8);
		RegisterShowPassword.setForeground(Color.LIGHT_GRAY);
		RegisterShowPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_RegisterShowPassword = new GridBagConstraints();
		gbc_RegisterShowPassword.anchor = GridBagConstraints.WEST;
		gbc_RegisterShowPassword.insets = new Insets(0, 0, 0, 5);
		gbc_RegisterShowPassword.gridx = 1;
		gbc_RegisterShowPassword.gridy = 8;
		panel_4.add(RegisterShowPassword, gbc_RegisterShowPassword);
		RegisterShowPassword.addMouseListener(new MouseAdapter() {
			int statusIdentifier = 1;
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(statusIdentifier == 0) {
					RegisterShowPassword.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye3.png")));
					RegisterShowPassword.setText("Hide Password");
				statusIdentifier = 1;
			RegisterPassword.setEchoChar((char)0);
			}
				else {
					RegisterShowPassword.setIcon(new ImageIcon(SurbanRecordsApp.class.getResource("/img/eye4.png")));
					RegisterShowPassword.setText("Show Password");
					statusIdentifier = 0;
					RegisterPassword.setEchoChar(Ec);
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
		
		JLabel lblWelcome = new JLabel("Hello There !");
		lblWelcome.setFont(new Font("Dubai Medium", Font.BOLD, 56));
		lblWelcome.setForeground(Color.DARK_GRAY);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(121, 177, 593, 316);
		panel_1.add(lblWelcome);
		
		JLabel LoginWindowBackgroundLabel = new JLabel("");
		LoginWindowBackgroundLabel.setBounds(412, 0, 872, 700);
		frmWelcome.getContentPane().add(LoginWindowBackgroundLabel);
		LoginWindowBackgroundLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgcart.png")).getImage().getScaledInstance(1000, 725, Image.SCALE_SMOOTH)));
		Mysql baza = new Mysql();
		ValidateAnEmail checkmail = new ValidateAnEmail();
		
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
