package mainpackage;
import dependencies.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;

import dependencies.ClickableProgressBar;
import dependencies.LayoutManagmentMethods;
import dependencies.MainContentCardsMethods;
import dependencies.Mysql;

/*import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.GraphiteGlassSkin;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;
*/
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Insets;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.JSeparator;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Scrollbar;
import java.awt.TextField;
import dependencies.RoundedJTextField;
import dependencies.ShowFormMusic;
import dependencies.SideBarButtonActions;
import dependencies.SongsScrollPane;
import dependencies.ValidateLogin;
//xD
public class MainScreen extends JFrame {
//xD2master
	private JPanel contentPane;
	public static String UserLogin;
	/**
	 * Launch the application.
	 */
	static int IsPlayButton =1;
	static int IsButtonWhite =0; //0 = grey/1 = whiter
public static int dbrowCount;
public static ResourceBundle language = SurbanRecordsApp.language;
public static JTextField oldPass;
public static JTextField newPass;
public static JTextField newCPass;
private JTextField newEmail;
private JTextField changeEmailPass;
private ValidateLogin loginek = SurbanRecordsApp.loginek;
public static JLabel changePassCom;

	/**
	 * Create the frame.
	 * @param SongsTabViewPort 
	 * @throws Exception 
	 */
	public MainScreen(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/img/polack.png")));
		setBackground(Color.PINK);
		
		setMinimumSize(new Dimension(1100, 400));
		setTitle("SurBan Studio");
		MainScreen.setDefaultLookAndFeelDecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 700);
	
		this.setLocationRelativeTo(null);
		contentPane = new JPanel() {
		
		  public void paintComponent(Graphics g)
		  {
			  
		
	
	
	
		  /*g.setColor( getBackground() );
		  g.fillRect(0, 0, getWidth(), getHeight());
		  super.paintComponent(g);*/
		    
		};
		  
		 
		  
		  
			   
		  };
		contentPane.setOpaque(false);
		 
	
		contentPane.setRequestFocusEnabled(false);
		contentPane.setFocusable(false);
		contentPane.setForeground(SystemColor.activeCaptionBorder);
		
		
		
		//tempMusic.displayMusic();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{387, 0};
		gbl_contentPane.rowHeights = new int[]{30, 580, 53, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel TopCenterPanel = new JPanel();
		TopCenterPanel.setBorder(null);
		TopCenterPanel.setBackground(new Color(40,40,40));
		GridBagConstraints gbc_TopCenterPanel = new GridBagConstraints();
		gbc_TopCenterPanel.fill = GridBagConstraints.BOTH;
		gbc_TopCenterPanel.gridx = 0;
		gbc_TopCenterPanel.gridy = 0;
		contentPane.add(TopCenterPanel, gbc_TopCenterPanel);
		GridBagLayout gbl_TopCenterPanel = new GridBagLayout();
		gbl_TopCenterPanel.columnWidths = new int[]{205, 271, 0, 164, 0};
		gbl_TopCenterPanel.rowHeights = new int[]{33, 0};
		gbl_TopCenterPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_TopCenterPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		TopCenterPanel.setLayout(gbl_TopCenterPanel);
		
		JLabel lblNewLabel_5 = new JLabel(language.getString("wyloguj"));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				SurbanRecordsApp.loginLogin.setText("");
				SurbanRecordsApp.passwordLogin.setText("");
				SurbanRecordsApp.window.frmWelcome.setVisible(true);
				SurbanRecordsApp.main_xd.dispose();
				
				
				
			}
		});
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		/*lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final SurbanRecordsApp window = new SurbanRecordsApp();
			
			}
		});*/
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(18,18,18));
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 0, 5);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 0;
		TopCenterPanel.add(panel_12, gbc_panel_12);
		
		JLabel lblUtwory = new JLabel(language.getString("utwory"));
		lblUtwory.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUtwory.setHorizontalTextPosition(SwingConstants.LEFT);
		lblUtwory.setHorizontalAlignment(SwingConstants.LEFT);
		lblUtwory.setForeground(Color.WHITE);
		lblUtwory.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblUtwory = new GridBagConstraints();
		gbc_lblUtwory.anchor = GridBagConstraints.SOUTH;
		gbc_lblUtwory.insets = new Insets(0, 20, 0, 5);
		gbc_lblUtwory.gridx = 1;
		gbc_lblUtwory.gridy = 0;
		TopCenterPanel.add(lblUtwory, gbc_lblUtwory);
		JLabel lblUsername = new JLabel(loginek.username);
		
		
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 0, 5);
		gbc_lblUsername.gridx = 2;
		gbc_lblUsername.gridy = 0;
		TopCenterPanel.add(lblUsername, gbc_lblUsername);
		lblNewLabel_5.setIcon(null);
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 20);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 0;
		TopCenterPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JPanel CenterContent = new JPanel(){
		protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		
		CenterContent.setOpaque(false);
		CenterContent.setBackground(new Color(18,18,18));
		GridBagConstraints gbc_CenterContent = new GridBagConstraints();
		gbc_CenterContent.fill = GridBagConstraints.BOTH;
		gbc_CenterContent.gridx = 0;
		gbc_CenterContent.gridy = 1;
		contentPane.add(CenterContent, gbc_CenterContent);
		GridBagLayout gbl_CenterContent = new GridBagLayout();
		gbl_CenterContent.columnWidths = new int[]{110, 616, 0};
		gbl_CenterContent.rowHeights = new int[]{0, 0};
		gbl_CenterContent.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_CenterContent.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		CenterContent.setLayout(gbl_CenterContent);
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBorder(null);
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		panel_6.setBackground(new Color(18,18,18));
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 0;
		CenterContent.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{200, 0};
		gbl_panel_6.rowHeights = new int[]{60, 85, 272, 60, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		UIManager.put("ScrollBar.thumb", new ColorUIResource(Color.RED));
	
		JScrollPane scrollPane = new JScrollPane();
	
	
		 
		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() );
		scrollPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI());
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 0, 15);
		gbc_panel_10.anchor = GridBagConstraints.NORTH;
		panel_10.setBackground(new Color(18,18,18));
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 0;
		panel_6.add(panel_10, gbc_panel_10);
		panel_10.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_2 = new JLabel("");
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/homeFilledWhite32.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/home1.png")));
			}
			
		});
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/home1.png")));
		panel_10.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_7.setBackground(new Color(18, 18, 18));
		panel_7.setLayout(null);
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 1;
		panel_6.add(panel_7, gbc_panel_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 200, 85);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		//lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acdc.jpg")).getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH)));
		panel_7.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/themeWhite.png")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/themeSet.png")));
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/themeSet.png")));
		lblNewLabel_2.setBounds(82, 11, 24, 24);
		panel_7.add(lblNewLabel_2);

		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel_6.add(scrollPane, gbc_scrollPane);
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(18,18,18));
		panel_8.setBorder(null);
		panel_8.setPreferredSize(new Dimension(10, 1000));
		scrollPane.setViewportView(panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{133, 0};
		gbl_panel_8.rowHeights = new int[]{20, 35, 35, 35, 35, 35, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JPanel SongButtonPanel = new JPanel();
	SongButtonPanel.setBackground(new Color(18,18,18));
		GridBagConstraints gbc_SongButtonPanel = new GridBagConstraints();
		gbc_SongButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_SongButtonPanel.gridx = 0;
		gbc_SongButtonPanel.gridy = 1;
		panel_8.add(SongButtonPanel, gbc_SongButtonPanel);
		
		SideBarButtonActions SideBarButtonSongs = new SideBarButtonActions();
		
		
		
		SideBarButtonSongs.setText(language.getString("utwory"));
		
		SideBarButtonSongs.setHorizontalAlignment(SwingConstants.CENTER);
		SideBarButtonSongs.setForeground(new Color(179,179,179));
		SideBarButtonSongs.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		SongButtonPanel.add(SideBarButtonSongs);
		
		JPanel AlbumsButtonPanel = new JPanel();
		AlbumsButtonPanel.setBackground(new Color(18, 18, 18));
		GridBagConstraints gbc_AlbumsButtonPanel = new GridBagConstraints();
		gbc_AlbumsButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_AlbumsButtonPanel.gridx = 0;
		gbc_AlbumsButtonPanel.gridy = 2;
		panel_8.add(AlbumsButtonPanel, gbc_AlbumsButtonPanel);
		
		SideBarButtonActions lblAlbums = new SideBarButtonActions();
		
		lblAlbums.setText(language.getString("albumy"));
		lblAlbums.setBackground(Color.RED);
	
		
		lblAlbums.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlbums.setForeground(new Color(179, 179, 179));
		lblAlbums.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		AlbumsButtonPanel.add(lblAlbums);
		
		
		JPanel FavouritesButtonPanel = new JPanel();
		FavouritesButtonPanel.setBackground(new Color(18, 18, 18));
		GridBagConstraints gbc_FavouritesButtonPanel = new GridBagConstraints();
		gbc_FavouritesButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_FavouritesButtonPanel.gridx = 0;
		gbc_FavouritesButtonPanel.gridy = 3;
		panel_8.add(FavouritesButtonPanel, gbc_FavouritesButtonPanel);
		
		SideBarButtonActions lblUlubione = new SideBarButtonActions();
		lblUlubione.setText(language.getString("ulubione"));
		
		lblUlubione.setHorizontalAlignment(SwingConstants.CENTER);
		lblUlubione.setForeground(new Color(179, 179, 179));
		lblUlubione.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		FavouritesButtonPanel.add(lblUlubione);
		
		JPanel PlayListsPanel = new JPanel();
		PlayListsPanel.setBackground(new Color(18, 18, 18));
		GridBagConstraints gbc_PlayListsPanel = new GridBagConstraints();
		gbc_PlayListsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_PlayListsPanel.gridx = 0;
		gbc_PlayListsPanel.gridy = 4;
		panel_8.add(PlayListsPanel, gbc_PlayListsPanel);
		
		SideBarButtonActions lblPlaylisty = new SideBarButtonActions();
		lblPlaylisty.setText(language.getString("playlisty"));
		
		lblPlaylisty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaylisty.setForeground(new Color(179, 179, 179));
		lblPlaylisty.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		PlayListsPanel.add(lblPlaylisty);
		
		SideBarButtonActions lblWykonawcy = new SideBarButtonActions();
		lblWykonawcy.setText(language.getString("wykonawcy"));
		lblWykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblWykonawcy.setForeground(new Color(179, 179, 179));
		lblWykonawcy.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		GridBagConstraints gbc_lblWykonawcy = new GridBagConstraints();
		gbc_lblWykonawcy.insets = new Insets(0, 0, 5, 0);
		gbc_lblWykonawcy.gridx = 0;
		gbc_lblWykonawcy.gridy = 5;
		panel_8.add(lblWykonawcy, gbc_lblWykonawcy);
		
		JLabel lblSettings = new JLabel(language.getString("ustawienia"));
		lblSettings.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		
		lblSettings.setForeground(new Color(179, 179, 179));
		GridBagConstraints gbc_lblSettings = new GridBagConstraints();
		gbc_lblSettings.insets = new Insets(0, 0, 5, 0);
		gbc_lblSettings.gridx = 0;
		gbc_lblSettings.gridy = 6;
		panel_8.add(lblSettings, gbc_lblSettings);
		
		SideBarButtonActions sideBarButtonActions = new SideBarButtonActions();
		GridBagConstraints gbc_sideBarButtonActions = new GridBagConstraints();
		gbc_sideBarButtonActions.insets = new Insets(0, 0, 5, 0);
		gbc_sideBarButtonActions.gridx = 0;
		gbc_sideBarButtonActions.gridy = 7;
		panel_8.add(sideBarButtonActions, gbc_sideBarButtonActions);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(18, 18, 18));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 8;
		panel_8.add(panel_5, gbc_panel_5);
		
		SideBarButtonActions sdbrbtnctnsDevpanel = new SideBarButtonActions();
		
		sdbrbtnctnsDevpanel.setText("Dev_Panel");
		sdbrbtnctnsDevpanel.setHorizontalAlignment(SwingConstants.CENTER);
		sdbrbtnctnsDevpanel.setForeground(new Color(179, 179, 179));
		sdbrbtnctnsDevpanel.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		panel_5.add(sdbrbtnctnsDevpanel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(18, 18, 18));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		panel_6.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(MainScreen.class.getResource("/img/lside.png")));
		panel_3.add(label_1);
		
		JPanel Container = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		CardLayout cl = new CardLayout(0,0);
		Container.setLayout(cl);
		
		JPanel SongsTab =new JPanel();
		SongsTab.setBackground(new Color(255, 255, 255));
		
		Container.setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagConstraints gbc_Container = new GridBagConstraints();
		gbc_Container.fill = GridBagConstraints.BOTH;
		gbc_Container.gridx = 1;
		gbc_Container.gridy = 0;
	Container.setBackground(Color.ORANGE);
		CenterContent.add(Container, gbc_Container);
		cl.show(Container,"Songs");
		
		JScrollPane scrollPane_2 = new JScrollPane(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};

		Container.add(scrollPane_2, "Albums");

		scrollPane_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		 scrollPane_2.getViewport().setBackground( new Color(36,36,36));
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBackground(new Color(40,40,40));
		LayoutManagmentMethods.addAlbums(scrollPane_2,dbrowCount,2);
		
		
		JScrollPane scrollPane_3 = new JScrollPane(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};

		Container.add(scrollPane_3, "Dev_Panel");

		scrollPane_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		 scrollPane_3.getViewport().setBackground( new Color(36,36,36));
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBackground(new Color(40,40,40));
	
		
		
		JScrollPane scrollPane_4 = new JScrollPane(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};


		scrollPane_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		 scrollPane_4.getViewport().setBackground( new Color(36,36,36));
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBackground(new Color(40,40,40));
		LayoutManagmentMethods.addPolak(scrollPane_4,2,2);
		/*int dbRowCountOld;
		ShowFormMusic tempMusic = new ShowFormMusic();
		dbRowCountOld =ShowFormMusic.count;
		
		
		try {
			tempMusic.displayMusic();
		}catch(Exception e){
			e.getStackTrace();
		}
		dbRowCountOld =ShowFormMusic.count;*/
		JScrollPane SongsTab_1 = new JScrollPane();
		SongsTab_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		Container.add(SongsTab_1, "SongsTab");
		
		JPanel SongsTabViewPort = new JPanel();
		SongsTabViewPort.setBackground(new Color(36,36,36));
		SongsTab_1.setViewportView(SongsTabViewPort);
		Dimension SongsDim = new Dimension();
		SongsDim = SongsTabViewPort.getSize();
		System.out.println("Dim" +SongsDim.height);
		SongsTabViewPort.setLayout(new BoxLayout(SongsTabViewPort, BoxLayout.Y_AXIS));
		
		JPanel SongsRowTemplate = new JPanel();
		SongsRowTemplate.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		SongsRowTemplate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SongsRowTemplate.setBackground(new Color(50,50,50));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SongsRowTemplate.setBackground(new Color(36,36,36));
			}
		});
		SongsRowTemplate.setBackground(new Color(36,36,36));
		SongsRowTemplate.setMaximumSize(new Dimension(32767, 40));
		SongsTabViewPort.add(SongsRowTemplate);
		GridBagLayout gbl_SongsRowTemplate = new GridBagLayout();
		gbl_SongsRowTemplate.columnWidths = new int[]{64, 30, 250, 250, 250, 0, 0, 0};
		gbl_SongsRowTemplate.rowHeights = new int[]{40, 0};
		gbl_SongsRowTemplate.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_SongsRowTemplate.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		SongsRowTemplate.setLayout(gbl_SongsRowTemplate);
		
		JLabel SongsRowPlayButton = new JLabel("");
		
		SongsRowPlayButton.setHorizontalAlignment(SwingConstants.CENTER);
		SongsRowPlayButton.setPreferredSize(new Dimension(64, 40));
		SongsRowPlayButton.setIcon(null);

		GridBagConstraints gbc_SongsRowPlayButton = new GridBagConstraints();
		gbc_SongsRowPlayButton.fill = GridBagConstraints.BOTH;
		gbc_SongsRowPlayButton.insets = new Insets(0, 0, 0, 5);
		gbc_SongsRowPlayButton.gridx = 0;
		gbc_SongsRowPlayButton.gridy = 0;
		SongsRowTemplate.add(SongsRowPlayButton, gbc_SongsRowPlayButton);
		
		JLabel SongsRowFavoriteButton = new JLabel("");
		SongsRowFavoriteButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/favIcon2.png")));
		GridBagConstraints gbc_SongsRowFavoriteButton = new GridBagConstraints();
		gbc_SongsRowFavoriteButton.fill = GridBagConstraints.VERTICAL;
		gbc_SongsRowFavoriteButton.insets = new Insets(0, 0, 0, 5);
		gbc_SongsRowFavoriteButton.gridx = 1;
		gbc_SongsRowFavoriteButton.gridy = 0;
		SongsRowTemplate.add(SongsRowFavoriteButton, gbc_SongsRowFavoriteButton);
		
		JLabel SongsRowTitle = new JLabel(language.getString("tytul"));
		SongsRowTitle.setForeground(Color.WHITE);
		SongsRowTitle.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		SongsRowTitle.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_SongsRowTitle = new GridBagConstraints();
		gbc_SongsRowTitle.fill = GridBagConstraints.VERTICAL;
		gbc_SongsRowTitle.insets = new Insets(0, 0, 0, 5);
		gbc_SongsRowTitle.anchor = GridBagConstraints.WEST;
		gbc_SongsRowTitle.gridx = 2;
		gbc_SongsRowTitle.gridy = 0;
		SongsRowTemplate.add(SongsRowTitle, gbc_SongsRowTitle);
		
		JLabel lblCreator = new JLabel(language.getString("wykonawca"));
		lblCreator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreator.setForeground(Color.WHITE);
		lblCreator.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCreator = new GridBagConstraints();
		gbc_lblCreator.fill = GridBagConstraints.VERTICAL;
		gbc_lblCreator.insets = new Insets(0, 0, 0, 5);
		gbc_lblCreator.anchor = GridBagConstraints.WEST;
		gbc_lblCreator.gridx = 3;
		gbc_lblCreator.gridy = 0;
		SongsRowTemplate.add(lblCreator, gbc_lblCreator);
		


		JLabel label = new JLabel(language.getString("album"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.gridx = 4;
		gbc_label.gridy = 0;
		SongsRowTemplate.add(label, gbc_label);

		
		JLabel lblDuration = new JLabel(language.getString("data"));
		lblDuration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration.setForeground(Color.WHITE);
		lblDuration.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDuration = new GridBagConstraints();
		gbc_lblDuration.fill = GridBagConstraints.VERTICAL;
		gbc_lblDuration.anchor = GridBagConstraints.WEST;
		gbc_lblDuration.insets = new Insets(0, 0, 0, 5);
		gbc_lblDuration.gridx = 5;
		gbc_lblDuration.gridy = 0;
		SongsRowTemplate.add(lblDuration, gbc_lblDuration);
		
		JLabel lblDuration_1 = new JLabel(language.getString("czas"));
		lblDuration_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration_1.setForeground(Color.WHITE);
		lblDuration_1.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDuration_1 = new GridBagConstraints();
		gbc_lblDuration_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblDuration_1.gridx = 6;
		gbc_lblDuration_1.gridy = 0;
		SongsRowTemplate.add(lblDuration_1, gbc_lblDuration_1);
		//MainContentCardsMethods.SongsCardAddContent(SongsTabViewPort,0,dbRowCountOld,0);
		MainContentCardsMethods.SongsCardAddContent(SongsTabViewPort, 0, 1,0);
		SongsRowPlayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SongsRowPlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/playWhite24.png")));
				SongsRowTemplate.setBackground(new Color(50,50,50));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SongsRowPlayButton.setIcon(null);
				SongsRowTemplate.setBackground(new Color(36,36,36));
			}
		});
		cl.show(Container,"SongsTab");
		//cl.show(Container,"SongsTab");
		JPanel SongsHeader = new JPanel();
		SongsHeader.setBackground(new Color(40,40,40));
		SongsHeader.setPreferredSize(new Dimension(10, 60));
		SongsTab_1.setColumnHeaderView(SongsHeader);

		
		/*JScrollPane scrollPane_3 = new JScrollPane(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};

*/

		JPanel BottomUI = new JPanel();
		BottomUI.setBackground(new Color(40,40,40));
		GridBagConstraints gbc_BottomUI = new GridBagConstraints();
		gbc_BottomUI.anchor = GridBagConstraints.SOUTH;
		gbc_BottomUI.fill = GridBagConstraints.HORIZONTAL;
		gbc_BottomUI.gridx = 0;
		gbc_BottomUI.gridy = 2;
		contentPane.add(BottomUI, gbc_BottomUI);
		GridBagLayout gbl_BottomUI = new GridBagLayout();
		gbl_BottomUI.columnWidths = new int[]{250, 0, 200, 0};
		gbl_BottomUI.rowHeights = new int[]{53, 0};
		gbl_BottomUI.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_BottomUI.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		BottomUI.setLayout(gbl_BottomUI);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(40,40,40));
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		BottomUI.add(panel, gbc_panel);
		
		JLabel SongInfoPanel_AlbumCover = new JLabel("");
		SongInfoPanel_AlbumCover.setBounds(10, 9, 56, 52);
		panel.add(SongInfoPanel_AlbumCover);
		SongInfoPanel_AlbumCover.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dkac2.jpg")).getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH)));
		
		JLabel lblAcdc = new JLabel("Hans Zimmer");
		lblAcdc.setBounds(64, 34, 117, 15);
		panel.add(lblAcdc);
		lblAcdc.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcdc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAcdc.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblShookMeAll = new JLabel("Dark Knight ");
		lblShookMeAll.setVerticalAlignment(SwingConstants.BOTTOM);
		lblShookMeAll.setBounds(64, 11, 117, 15);
		panel.add(lblShookMeAll);
		lblShookMeAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblShookMeAll.setForeground(Color.WHITE);
		lblShookMeAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblShookMeAll.setBackground(Color.DARK_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainScreen.class.getResource("/img/favIconWhite.png")));
		lblNewLabel.setBounds(177, 11, 16, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(40,40,40));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		BottomUI.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{60, -5, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(4);
		flowLayout.setHgap(16);
		panel_4.setBackground(new Color(40,40,40));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_1.add(panel_4, gbc_panel_4);
		
		
		JLabel RandomButton = new JLabel("");
		RandomButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				RandomButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/randomWhite.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				RandomButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/randomGray.png")));
			}
		});
		panel_4.add(RandomButton);
		RandomButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/randomGray.png")));
		
		JLabel PrevButton = new JLabel("");
		PrevButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PrevButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/previousWhite.png")));
			};
			@Override
			public void mouseExited(MouseEvent e) {
				PrevButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/previouseGray.png")));
			}
		});
		panel_4.add(PrevButton);
		PrevButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/previouseGray.png")));
		
		JLabel PlayButton = new JLabel("");
		PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/playGray32.png")));
		PlayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				IsButtonWhite = 1;
				if(IsPlayButton == 1) {
					PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/playWhite32.png")));
					
				}
				else if(IsPlayButton == 0) {
					PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/pauseWhite32.png")));
					
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if( IsPlayButton ==1) {
					PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/pauseWhite32.png")));
					IsPlayButton = 0;
				}
				else {
					PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/playWhite32.png")));
					IsPlayButton = 1;
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				IsButtonWhite =0;
				if(IsPlayButton ==1) {
					PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/playGray32.png")));
				}
				else {
					PlayButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/pauseGray32.png")));
				}
			}
		});
		
		panel_4.add(PlayButton);
		PlayButton.setHorizontalAlignment(SwingConstants.CENTER);
	
		
		
		JLabel NextButton = new JLabel("");
		NextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				NextButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/nextWhite.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				NextButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/nextGray.png")));
			}
		});
		panel_4.add(NextButton);
		NextButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/nextGray.png")));
		
		JLabel LoopButton = new JLabel("");
		LoopButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				LoopButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/loopWhite.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LoopButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/loopGray.png")));
			}
		});
		panel_4.add(LoopButton);
		LoopButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/loopGray.png")));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setPreferredSize(new Dimension(146, 5));
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.anchor = GridBagConstraints.NORTH;
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.insets = new Insets(0, 100, 0, 100);
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 1;
		panel_1.add(progressBar, gbc_progressBar);
		
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		panel_2.setBackground(new Color(40,40,40));
		panel_2.setLayout(null);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 0;
		BottomUI.add(panel_2, gbc_panel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(47, 26, 16, 16);
		lblNewLabel_6.setIcon(new ImageIcon(MainScreen.class.getResource("/img/volumeMute.png")));
		panel_2.add(lblNewLabel_6);
		
		ClickableProgressBar clickableProgressBar = new ClickableProgressBar();
		clickableProgressBar.setBounds(73, 31, 100, 6);
		clickableProgressBar.setValue(50);
		clickableProgressBar.setStringPainted(true);
		clickableProgressBar.setString("");
		clickableProgressBar.setPreferredSize(new Dimension(139, 6));
		clickableProgressBar.setMinimumSize(new Dimension(10, 2));
		clickableProgressBar.setForeground(SystemColor.controlDkShadow);
		clickableProgressBar.setFocusable(false);
		clickableProgressBar.setBorderPainted(false);
		clickableProgressBar.setBorder(null);
		clickableProgressBar.setBackground(new Color(179, 179, 179));
		panel_2.add(clickableProgressBar);
			
			//Mouse Listeners
		
		
		lblAlbums.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(Container,"Albums");
				lblUtwory.setText(language.getString("albumy"));
			}
		});
		
		
		SideBarButtonSongs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			
			
				//System.out.println("Row count: " +dbRowCount);
				//System.out.println("Row count: " +dbRowCount);
				//MainContentCardsMethods.SongsCardAddContent(SongsTabViewPort,0);
		
				//check if oldRowCount is up to date;
				/*int tempDbRow = ShowFormMusic.count;
				if(dbRowCountOld != tempDbRow) {
					MainContentCardsMethods.addSongsRow(SongsTabViewPort, 2,temP);*/
				//}
				//MainContentCardsMethods.SongsCardAddContent(SongsTabViewPort, 0, 1,0);
	

				cl.show(Container,"SongsTab");
			};
		});

		sdbrbtnctnsDevpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cl.show(Container,"Dev_Panel");
				lblUtwory.setText("Dev_Panel");
				
			}
		});
		
		
		lblUlubione.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cl.show(Container,"Polak_Panel");
			}
		});
		lblSettings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cl.show(Container,"SettingsTab");
				lblUtwory.setText("Manage");
			}
		});
			
		Image img = new ImageIcon(this.getClass().getResource("/img/mainbg2.jpg")).getImage();
		LayoutManagmentMethods.addDevPanel(scrollPane_3,dbrowCount,3,SongsTabViewPort);
		
		JScrollPane SettingsTab = new JScrollPane();
		SettingsTab.setBorder(new EmptyBorder(0, 0, 0, 0));
		Container.add(SettingsTab, "SettingsTab");
		
		JPanel SettingsTabViewPort = new JPanel();
		SettingsTabViewPort.setBackground(new Color(36,36,36));
		SettingsTab.setViewportView(SettingsTabViewPort);
		
		JPanel SettingsMenu = new JPanel();
		SettingsMenu.setBackground(SettingsTabViewPort.getBackground());
		SettingsMenu.setPreferredSize(new Dimension(800, 800));
		SettingsMenu.setMinimumSize(new Dimension(300, 10));
		SettingsTabViewPort.add(SettingsMenu);
		SettingsMenu.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_9.setBounds(0, 99, 800, 310);
		SettingsMenu.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel();
	
		lblNewLabel_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dkac2.jpg")).getImage().getScaledInstance(182, 182, Image.SCALE_SMOOTH)));
		lblNewLabel_4.setBounds(0, 11, 182, 182);
		panel_9.add(lblNewLabel_4);
		
		JPanel UserSettingsContainer = new JPanel();
		UserSettingsContainer.setOpaque(false);
		UserSettingsContainer.setBackground(SettingsTabViewPort.getBackground());
		UserSettingsContainer.setBounds(265, 0, 535, 310);
		panel_9.add(UserSettingsContainer);
		CardLayout SL = new CardLayout();
		UserSettingsContainer.setLayout(SL);
		
		JPanel SettingsButtonsCard = new JPanel();
		SettingsButtonsCard.setOpaque(false);
		UserSettingsContainer.add(SettingsButtonsCard, "SettingsButtonsCard");
		SettingsButtonsCard.setLayout(new BoxLayout(SettingsButtonsCard, BoxLayout.Y_AXIS));
		
		JLabel lblAddFounds = new JLabel(language.getString("dodajsrodki"));
		lblAddFounds.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddFounds.setIconTextGap(10);
		lblAddFounds.setIcon(new ImageIcon(MainScreen.class.getResource("/img/hajsGray.png")));
		lblAddFounds.setMaximumSize(new Dimension(700, 35));
		lblAddFounds.setForeground(Color.LIGHT_GRAY);
		lblAddFounds.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		SettingsButtonsCard.add(lblAddFounds);
		
		JLabel ChangePasswordButton = new JLabel(language.getString("zmienhaslo"));
		
		ChangePasswordButton.setHorizontalAlignment(SwingConstants.LEFT);
		ChangePasswordButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/passwordGray.png")));
		ChangePasswordButton.setMaximumSize(new Dimension(700, 35));
		ChangePasswordButton.setIconTextGap(10);
		ChangePasswordButton.setForeground(Color.LIGHT_GRAY);
		ChangePasswordButton.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		SettingsButtonsCard.add(ChangePasswordButton);
		
		JLabel lblChangeEmail = new JLabel(language.getString("zmienemail"));
		
		lblChangeEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblChangeEmail.setIcon(new ImageIcon(MainScreen.class.getResource("/img/emailGray.png")));
		lblChangeEmail.setMaximumSize(new Dimension(700, 35));
		lblChangeEmail.setIconTextGap(10);
		lblChangeEmail.setForeground(Color.LIGHT_GRAY);
		lblChangeEmail.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		SettingsButtonsCard.add(lblChangeEmail);
		
		JPanel ChangePasswordCard = new JPanel();
		ChangePasswordCard.setOpaque(false);
		UserSettingsContainer.add(ChangePasswordCard, "ChangePasswordCard");
		GridBagLayout gbl_ChangePasswordCard = new GridBagLayout();
		gbl_ChangePasswordCard.columnWidths = new int[]{171, 193, 169, 0};
		gbl_ChangePasswordCard.rowHeights = new int[]{60, 60, 60, 32, 0, 0};
		gbl_ChangePasswordCard.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_ChangePasswordCard.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ChangePasswordCard.setLayout(gbl_ChangePasswordCard);
		
		JLabel lblOldPassword = new JLabel(language.getString("zmienhaslo"));
		lblOldPassword.setVerticalAlignment(SwingConstants.TOP);
		lblOldPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblOldPassword.setForeground(Color.LIGHT_GRAY);
		lblOldPassword.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		GridBagConstraints gbc_lblOldPassword = new GridBagConstraints();
		gbc_lblOldPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblOldPassword.gridx = 0;
		gbc_lblOldPassword.gridy = 0;
		ChangePasswordCard.add(lblOldPassword, gbc_lblOldPassword);
		
		oldPass = new JTextField();
		oldPass.setCaretColor(Color.LIGHT_GRAY);
		oldPass.setHorizontalAlignment(SwingConstants.CENTER);
		oldPass.setForeground(Color.LIGHT_GRAY);
		oldPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		oldPass.setBorder(new EmptyBorder(0, 0, 0, 0));
		oldPass.setBackground(Color.DARK_GRAY);
		oldPass.setPreferredSize(new Dimension(5, 30));
		oldPass.setMinimumSize(new Dimension(5, 30));
		GridBagConstraints gbc_oldPass = new GridBagConstraints();
		gbc_oldPass.insets = new Insets(0, 0, 5, 5);
		gbc_oldPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_oldPass.gridx = 1;
		gbc_oldPass.gridy = 0;
		ChangePasswordCard.add(oldPass, gbc_oldPass);
		oldPass.setColumns(10);
		
		JLabel lblNewPassword = new JLabel(language.getString("nowehaslo"));
		lblNewPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewPassword.setForeground(Color.LIGHT_GRAY);
		lblNewPassword.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewPassword = new GridBagConstraints();
		gbc_lblNewPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewPassword.gridx = 0;
		gbc_lblNewPassword.gridy = 1;
		ChangePasswordCard.add(lblNewPassword, gbc_lblNewPassword);
		
		newPass = new JTextField();
		newPass.setCaretColor(Color.LIGHT_GRAY);
		newPass.setHorizontalAlignment(SwingConstants.CENTER);
		newPass.setForeground(Color.LIGHT_GRAY);
		newPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		newPass.setBorder(new EmptyBorder(0, 0, 0, 0));
		newPass.setPreferredSize(new Dimension(5, 30));
		newPass.setMinimumSize(new Dimension(5, 30));
		newPass.setColumns(10);
		newPass.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_newPass = new GridBagConstraints();
		gbc_newPass.insets = new Insets(0, 0, 5, 5);
		gbc_newPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_newPass.gridx = 1;
		gbc_newPass.gridy = 1;
		ChangePasswordCard.add(newPass, gbc_newPass);
		
		JLabel lblConfirmPassword = new JLabel(language.getString("potwierdzhaslo"));
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmPassword.setForeground(Color.LIGHT_GRAY);
		lblConfirmPassword.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		GridBagConstraints gbc_lblConfirmPassword = new GridBagConstraints();
		gbc_lblConfirmPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblConfirmPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmPassword.gridx = 0;
		gbc_lblConfirmPassword.gridy = 2;
		ChangePasswordCard.add(lblConfirmPassword, gbc_lblConfirmPassword);
		
		newCPass = new JTextField();
		newCPass.setCaretColor(Color.LIGHT_GRAY);
		newCPass.setHorizontalAlignment(SwingConstants.CENTER);
		newCPass.setForeground(Color.LIGHT_GRAY);
		newCPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		newCPass.setBorder(new EmptyBorder(0, 0, 0, 0));
		newCPass.setPreferredSize(new Dimension(5, 30));
		newCPass.setMinimumSize(new Dimension(5, 30));
		newCPass.setColumns(10);
		newCPass.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_newCPass = new GridBagConstraints();
		gbc_newCPass.insets = new Insets(0, 0, 5, 5);
		gbc_newCPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_newCPass.gridx = 1;
		gbc_newCPass.gridy = 2;
		ChangePasswordCard.add(newCPass, gbc_newCPass);
		
		JLabel PassApply = new JLabel(language.getString("zastosuj"));
		PassApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String oldPassword = oldPass.getText();
				String newPassword = newPass.getText();
				String newCPassword = newCPass.getText();
				
				validatePass newpass = new validatePass(newPassword, newCPassword);
				try {
					newpass.validate();
				} catch (NoSuchAlgorithmException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
				
				Mysql urbanski = new Mysql();
				
				
				try {
					urbanski.changePassDatebase(newpass.simplehash(newpass.simplehash(oldPassword)), newpass.hashcode, loginek.username);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block 
					e1.printStackTrace();
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		PassApply.setHorizontalAlignment(SwingConstants.CENTER);
		PassApply.setIconTextGap(10);
		PassApply.setForeground(Color.LIGHT_GRAY);
		PassApply.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_PassApply = new GridBagConstraints();
		gbc_PassApply.fill = GridBagConstraints.VERTICAL;
		gbc_PassApply.insets = new Insets(0, 0, 5, 5);
		gbc_PassApply.gridx = 1;
		gbc_PassApply.gridy = 3;
		ChangePasswordCard.add(PassApply, gbc_PassApply);
		
		changePassCom = new JLabel();
		GridBagConstraints gbc_changePassCom = new GridBagConstraints();
		gbc_changePassCom.gridwidth = 3;
		gbc_changePassCom.insets = new Insets(0, 0, 0, 5);
		gbc_changePassCom.gridx = 0;
		gbc_changePassCom.gridy = 4;
		ChangePasswordCard.add(changePassCom, gbc_changePassCom);
		
		JPanel ChangeEmailCard = new JPanel();
		ChangeEmailCard.setOpaque(false);
		UserSettingsContainer.add(ChangeEmailCard, "ChangeEmailCard");
		GridBagLayout gbl_ChangeEmailCard = new GridBagLayout();
		gbl_ChangeEmailCard.columnWidths = new int[]{171, 193, 169, 0};
		gbl_ChangeEmailCard.rowHeights = new int[]{60, 60, 32, 0};
		gbl_ChangeEmailCard.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_ChangeEmailCard.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		ChangeEmailCard.setLayout(gbl_ChangeEmailCard);
		
		JLabel lblNewEmail = new JLabel(language.getString("nowyemail"));
		lblNewEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewEmail.setForeground(Color.LIGHT_GRAY);
		lblNewEmail.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewEmail = new GridBagConstraints();
		gbc_lblNewEmail.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewEmail.gridx = 0;
		gbc_lblNewEmail.gridy = 0;
		ChangeEmailCard.add(lblNewEmail, gbc_lblNewEmail);
		
		newEmail = new JTextField();
		newEmail.setPreferredSize(new Dimension(5, 30));
		newEmail.setMinimumSize(new Dimension(5, 30));
		newEmail.setHorizontalAlignment(SwingConstants.CENTER);
		newEmail.setForeground(Color.LIGHT_GRAY);
		newEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		newEmail.setColumns(10);
		newEmail.setCaretColor(Color.LIGHT_GRAY);
		newEmail.setBorder(new EmptyBorder(0, 0, 0, 0));
		newEmail.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_newEmail = new GridBagConstraints();
		gbc_newEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_newEmail.insets = new Insets(0, 0, 5, 5);
		gbc_newEmail.gridx = 1;
		gbc_newEmail.gridy = 0;
		ChangeEmailCard.add(newEmail, gbc_newEmail);
		
		JLabel lblConfirmEmail = new JLabel(language.getString("haslo"));
		lblConfirmEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmEmail.setForeground(Color.LIGHT_GRAY);
		lblConfirmEmail.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		GridBagConstraints gbc_lblConfirmEmail = new GridBagConstraints();
		gbc_lblConfirmEmail.fill = GridBagConstraints.VERTICAL;
		gbc_lblConfirmEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmEmail.gridx = 0;
		gbc_lblConfirmEmail.gridy = 1;
		ChangeEmailCard.add(lblConfirmEmail, gbc_lblConfirmEmail);
		
		changeEmailPass = new JTextField();
		changeEmailPass.setPreferredSize(new Dimension(5, 30));
		changeEmailPass.setMinimumSize(new Dimension(5, 30));
		changeEmailPass.setHorizontalAlignment(SwingConstants.CENTER);
		changeEmailPass.setForeground(Color.LIGHT_GRAY);
		changeEmailPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		changeEmailPass.setColumns(10);
		changeEmailPass.setCaretColor(Color.LIGHT_GRAY);
		changeEmailPass.setBorder(new EmptyBorder(0, 0, 0, 0));
		changeEmailPass.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_changeEmailPass = new GridBagConstraints();
		gbc_changeEmailPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_changeEmailPass.insets = new Insets(0, 0, 5, 5);
		gbc_changeEmailPass.gridx = 1;
		gbc_changeEmailPass.gridy = 1;
		ChangeEmailCard.add(changeEmailPass, gbc_changeEmailPass);
		
		JLabel EmailApply = new JLabel(language.getString("zastosuj"));
		EmailApply.setIconTextGap(10);
		EmailApply.setHorizontalAlignment(SwingConstants.CENTER);
		EmailApply.setForeground(Color.LIGHT_GRAY);
		EmailApply.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_EmailApply = new GridBagConstraints();
		gbc_EmailApply.fill = GridBagConstraints.VERTICAL;
		gbc_EmailApply.insets = new Insets(0, 0, 0, 5);
		gbc_EmailApply.gridx = 1;
		gbc_EmailApply.gridy = 2;
		ChangeEmailCard.add(EmailApply, gbc_EmailApply);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(SettingsTabViewPort.getBackground());
		panel_11.setBounds(0, 460, 800, 192);
		SettingsMenu.add(panel_11);
		panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.Y_AXIS));
		
		JPanel panel_14 = new JPanel();
		panel_14.setOpaque(false);
		panel_11.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblMode = new JLabel(language.getString("tryb"));
		lblMode.setBounds(0, 63, 174, 45);
		panel_14.add(lblMode);
		lblMode.setIcon(new ImageIcon(MainScreen.class.getResource("/img/modeGray.png")));
		lblMode.setVerticalTextPosition(SwingConstants.TOP);
		lblMode.setMaximumSize(new Dimension(4000, 50));
		lblMode.setHorizontalAlignment(SwingConstants.LEFT);
		lblMode.setForeground(Color.LIGHT_GRAY);
		lblMode.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		
		JLabel lblLanguage = new JLabel(language.getString("jezyk"));
		lblLanguage.setBounds(0, 0, 97, 52);
		panel_14.add(lblLanguage);
		lblLanguage.setIcon(new ImageIcon(MainScreen.class.getResource("/img/languageGray.png")));
		lblLanguage.setVerticalTextPosition(SwingConstants.TOP);
		lblLanguage.setMaximumSize(new Dimension(4000, 50));
		lblLanguage.setHorizontalAlignment(SwingConstants.LEFT);
		lblLanguage.setForeground(Color.LIGHT_GRAY);
		lblLanguage.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		
		JLabel lblchangeLanguage = new JLabel("//Change Language");
		lblchangeLanguage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblchangeLanguage.setVerticalTextPosition(SwingConstants.TOP);
		lblchangeLanguage.setMaximumSize(new Dimension(4000, 50));
		lblchangeLanguage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblchangeLanguage.setForeground(Color.LIGHT_GRAY);
		lblchangeLanguage.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		lblchangeLanguage.setBounds(254, 0, 536, 52);
		panel_14.add(lblchangeLanguage);
		
		JLabel lblChangeApplicationMode = new JLabel("//Change Application Mode");
		lblChangeApplicationMode.setVerticalTextPosition(SwingConstants.TOP);
		lblChangeApplicationMode.setMaximumSize(new Dimension(4000, 50));
		lblChangeApplicationMode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChangeApplicationMode.setForeground(Color.LIGHT_GRAY);
		lblChangeApplicationMode.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		lblChangeApplicationMode.setBounds(254, 56, 536, 52);
		panel_14.add(lblChangeApplicationMode);
		
		JLabel GoBackButton = new JLabel(language.getString("powrot"));
		GoBackButton.setBackground(Color.DARK_GRAY);
		GoBackButton.setOpaque(true);
		GoBackButton.setBounds(718, 0, 82, 40);
		SettingsMenu.add(GoBackButton);
		GoBackButton.setHorizontalTextPosition(SwingConstants.LEFT);
		GoBackButton.setHorizontalAlignment(SwingConstants.CENTER);
		GoBackButton.setForeground(Color.LIGHT_GRAY);
		GoBackButton.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		
		JLabel lblChangePassword = new JLabel(language.getString("uzytkownik"));
		lblChangePassword.setBackground(Color.DARK_GRAY);
		lblChangePassword.setOpaque(true);
		lblChangePassword.setBorder(null);
		lblChangePassword.setBounds(0, -1, 719, 41);
		SettingsMenu.add(lblChangePassword);
		lblChangePassword.setPreferredSize(new Dimension(64, 30));
		lblChangePassword.setMinimumSize(new Dimension(64, 18));
		lblChangePassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblChangePassword.setMaximumSize(new Dimension(4000, 50));
		lblChangePassword.setVerticalTextPosition(SwingConstants.TOP);
		lblChangePassword.setForeground(Color.LIGHT_GRAY);
		lblChangePassword.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		
		JLabel lblLoggedAs = new JLabel(language.getString("zalogowanyjako"));
		lblLoggedAs.setBounds(0, 53, 140, 14);
		SettingsMenu.add(lblLoggedAs);
		lblLoggedAs.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		lblLoggedAs.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_3 = new JLabel(loginek.username);
		lblNewLabel_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		lblNewLabel_3.setBounds(0, 67, 800, 34);
		SettingsMenu.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.WHITE);
		
		JLabel lblAppearance = new JLabel(language.getString("wyglad"));
		lblAppearance.setBounds(0, 420, 261, 40);
		SettingsMenu.add(lblAppearance);
		lblAppearance.setOpaque(true);
		lblAppearance.setBackground(Color.DARK_GRAY);
		lblAppearance.setVerticalTextPosition(SwingConstants.TOP);
		lblAppearance.setPreferredSize(new Dimension(64, 40));
		lblAppearance.setMinimumSize(new Dimension(64, 40));
		lblAppearance.setMaximumSize(new Dimension(4000, 50));
		lblAppearance.setHorizontalAlignment(SwingConstants.LEFT);
		lblAppearance.setForeground(Color.LIGHT_GRAY);
		lblAppearance.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		lblAppearance.setBorder(null);
		
		JLabel lblDescription = new JLabel(language.getString("opis"));
		lblDescription.setBounds(260, 420, 540, 40);
		SettingsMenu.add(lblDescription);
		lblDescription.setBackground(Color.DARK_GRAY);
		lblDescription.setOpaque(true);
		lblDescription.setVerticalTextPosition(SwingConstants.TOP);
		lblDescription.setPreferredSize(new Dimension(64, 40));
		lblDescription.setMinimumSize(new Dimension(64, 40));
		lblDescription.setMaximumSize(new Dimension(4000, 50));
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescription.setForeground(Color.LIGHT_GRAY);
		lblDescription.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		lblDescription.setBorder(null);
		
		JLabel lblBalance = new JLabel(language.getString("saldo"));
		lblBalance.setBounds(647, 74, 99, 14);
		SettingsMenu.add(lblBalance);
		lblBalance.setIcon(new ImageIcon(MainScreen.class.getResource("/img/BalanceGray.png")));
		lblBalance.setForeground(Color.LIGHT_GRAY);
		lblBalance.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		
		JLabel label_3 = new JLabel("ILOSC HAJSU DO POPRAWY 3000");
		label_3.setBounds(737, 74, 53, 14);
		SettingsMenu.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.LIGHT_GRAY);
		label_3.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		ChangePasswordButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SL.show(UserSettingsContainer, "ChangePasswordCard");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				ChangePasswordButton.setForeground(Color.WHITE);
				ChangePasswordButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/passwordWhite.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ChangePasswordButton.setForeground(Color.LIGHT_GRAY);
				ChangePasswordButton.setIcon(new ImageIcon(MainScreen.class.getResource("/img/passwordGray.png")));
			}
		});
		GoBackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SL.show(UserSettingsContainer, "SettingsButtonsCard");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				GoBackButton.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				GoBackButton.setForeground(Color.LIGHT_GRAY);
			}
		});
		lblChangeEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SL.show(UserSettingsContainer, "ChangeEmailCard");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblChangeEmail.setForeground(Color.WHITE);
				lblChangeEmail.setIcon(new ImageIcon(MainScreen.class.getResource("/img/emailWhite.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblChangeEmail.setForeground(Color.LIGHT_GRAY);
				lblChangeEmail.setIcon(new ImageIcon(MainScreen.class.getResource("/img/emailGray.png")));
			}
		});
		lblUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(Container,"SettingsTab");
				lblUtwory.setText("Manage");
				
				
			}
		});
	}
}
