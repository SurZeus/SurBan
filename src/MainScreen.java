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
		gbl_TopCenterPanel.columnWidths = new int[]{205, 271, 164, 0};
		gbl_TopCenterPanel.rowHeights = new int[]{33, 0};
		gbl_TopCenterPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_TopCenterPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		TopCenterPanel.setLayout(gbl_TopCenterPanel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(18,18,18));
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 0, 5);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 0;
		TopCenterPanel.add(panel_12, gbc_panel_12);
		
		JLabel lblUtwory = new JLabel("Utwory");
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
		lblNewLabel_5.setIcon(new ImageIcon(MainScreen.class.getResource("/img/menu.png")));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 20);
		gbc_lblNewLabel_5.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_5.gridx = 2;
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
		gbl_panel_8.rowHeights = new int[]{20, 35, 35, 35, 35, 35, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JPanel SongButtonPanel = new JPanel();
	SongButtonPanel.setBackground(new Color(18,18,18));
		GridBagConstraints gbc_SongButtonPanel = new GridBagConstraints();
		gbc_SongButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_SongButtonPanel.gridx = 0;
		gbc_SongButtonPanel.gridy = 1;
		panel_8.add(SongButtonPanel, gbc_SongButtonPanel);
		
		SideBarButtonActions SideBarButtonSongs = new SideBarButtonActions();
		
		
		
		SideBarButtonSongs.setText("Utwory");
		
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
		
		lblAlbums.setText("Albumy");
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
		lblUlubione.setText("Ulubione");
		
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
		lblPlaylisty.setText("Playlisty");
		
		lblPlaylisty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaylisty.setForeground(new Color(179, 179, 179));
		lblPlaylisty.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		PlayListsPanel.add(lblPlaylisty);
		
		SideBarButtonActions lblWykonawcy = new SideBarButtonActions();
		lblWykonawcy.setText("Wykonawcy");
		lblWykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblWykonawcy.setForeground(new Color(179, 179, 179));
		lblWykonawcy.setFont(new Font("Dubai Medium", Font.BOLD, 14));
		GridBagConstraints gbc_lblWykonawcy = new GridBagConstraints();
		gbc_lblWykonawcy.insets = new Insets(0, 0, 5, 0);
		gbc_lblWykonawcy.gridx = 0;
		gbc_lblWykonawcy.gridy = 5;
		panel_8.add(lblWykonawcy, gbc_lblWykonawcy);
		
		SideBarButtonActions sideBarButtonActions = new SideBarButtonActions();
		GridBagConstraints gbc_sideBarButtonActions = new GridBagConstraints();
		gbc_sideBarButtonActions.insets = new Insets(0, 0, 5, 0);
		gbc_sideBarButtonActions.gridx = 0;
		gbc_sideBarButtonActions.gridy = 6;
		panel_8.add(sideBarButtonActions, gbc_sideBarButtonActions);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(18, 18, 18));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 7;
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

		Container.add(scrollPane_4, "Polak_Panel");

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
		SongsTabViewPort.setBackground(Color.DARK_GRAY);
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
		
		JLabel SongsRowTitle = new JLabel("Title");
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
		
		JLabel lblCreator = new JLabel("Creator");
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
		
		JLabel lblAlbum = new JLabel("Album");
		lblAlbum.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlbum.setForeground(Color.WHITE);
		lblAlbum.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblAlbum = new GridBagConstraints();
		gbc_lblAlbum.fill = GridBagConstraints.VERTICAL;
		gbc_lblAlbum.insets = new Insets(0, 0, 0, 5);
		gbc_lblAlbum.anchor = GridBagConstraints.WEST;
		gbc_lblAlbum.gridx = 4;
		gbc_lblAlbum.gridy = 0;
		SongsRowTemplate.add(lblAlbum, gbc_lblAlbum);
		
		JLabel lblDuration = new JLabel("Date Added");
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
		
		JLabel lblDuration_1 = new JLabel("Duration");
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

		Container.add(scrollPane_3, "Dev ADD");
		scrollPane_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		 scrollPane_3.getViewport().setBackground( new Color(36,36,36));
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBackground(new Color(40,40,40));
		LayoutManagmentMethods.addDevPanel(scrollPane_3,dbrowCount,10);
	*/
		
		
		/*gbl_panel_9.columnWidths = new int[]{90, 362, 216, 160, 160, 0};
		gbl_panel_9.rowHeights = rowHeights;
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);*/
		
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
		
		/*ClickableProgressBar progressBar = new ClickableProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 1;
		panel_1.add(progressBar, gbc_progressBar);
		progressBar.setEnabled(false);
		progressBar.setPreferredSize(new Dimension(139, 6));
		progressBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		progressBar.setMinimumSize(new Dimension(10, 2));
		progressBar.setBounds(440, 56, 350, 7);
		progressBar.setFocusable(false);
		progressBar.setBorder(null);
		progressBar.setForeground(new Color(105,105,105));
		progressBar.setValue(50);
		progressBar.setBackground(new Color(179, 179, 179));
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.gray);
		progressBar.setString("");
		*/
		
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
				lblUtwory.setText("Albumy");
			}
		});
		/*SideBarButtonSongs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Liczba wierszy przed aktualizacja: " + dbrowCount);
				 dbrowCount =ShowFormMusic.count;
				 System.out.println("Liczba wierszy po aktualizacja: " + dbrowCount);
				
				LayoutManagmentMethods.addSongs(scrollPane_1,dbrowCount,1);
				lblUtwory.setText("Utwory");
				cl.show(Container,"Songs");
			}
		});*/
		
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
			}
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
				lblUtwory.setText("LazaniaPolaka");
			}
		});
			
			
		Image img = new ImageIcon(this.getClass().getResource("/img/mainbg2.jpg")).getImage();
		LayoutManagmentMethods.addDevPanel(scrollPane_3,dbrowCount,3,SongsTabViewPort);
		
	}
}
