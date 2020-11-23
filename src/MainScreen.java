
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

import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;

import dependencies.ClickableProgressBar;

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
//xD
public class MainScreen extends JFrame {
//xD2master
	private JPanel contentPane;
	public static String UserLogin;
	public static JLabel lblUsername;
	/**
	 * Launch the application.
	 */
	static int IsPlayButton =1;
	static int IsButtonWhite =0; //0 = grey/1 = whiter


	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public MainScreen() throws FontFormatException, IOException {
		
		setMinimumSize(new Dimension(700, 400));
		setTitle("SurBan Studio");
		MainScreen.setDefaultLookAndFeelDecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1236, 633);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel() {
		
		  public void paintComponent(Graphics g)
		  {
			  
		 Image img = Toolkit.getDefaultToolkit().getImage(
		  MainScreen.class.getResource("/img/pianobg.jpg")); g.drawImage(img, 0,
		  0, this.getWidth(), this.getHeight(), this);
	
		  /*g.setColor( getBackground() );
		  g.fillRect(0, 0, getWidth(), getHeight());
		  super.paintComponent(g);*/
		    
		};
		  
		 
		  
		  
			   
		  };
		contentPane.setOpaque(false);
		 
		BufferedImage myPicture = ImageIO.read(this.getClass().getResource("/img/rwd.jpg"));
		contentPane.setRequestFocusEnabled(false);
		contentPane.setFocusable(false);
		contentPane.setForeground(SystemColor.activeCaptionBorder);
		
		
		
		
		contentPane.setBackground(new Color(30,30,30));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{387, 0};
		gbl_contentPane.rowHeights = new int[]{30, 326, 80, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel TopCenterPanel = new JPanel();
		TopCenterPanel.setBorder(null);
		TopCenterPanel.setBackground(new Color(36,36,36));
		GridBagConstraints gbc_TopCenterPanel = new GridBagConstraints();
		gbc_TopCenterPanel.fill = GridBagConstraints.BOTH;
		gbc_TopCenterPanel.gridx = 0;
		gbc_TopCenterPanel.gridy = 0;
		contentPane.add(TopCenterPanel, gbc_TopCenterPanel);
		GridBagLayout gbl_TopCenterPanel = new GridBagLayout();
		gbl_TopCenterPanel.columnWidths = new int[]{16, 207, 271, 309, 164, 0};
		gbl_TopCenterPanel.rowHeights = new int[]{33, 0};
		gbl_TopCenterPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_TopCenterPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		TopCenterPanel.setLayout(gbl_TopCenterPanel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		RoundedJTextField rndjtxtfldWyszukaj = new RoundedJTextField(0);
		GridBagConstraints gbc_rndjtxtfldWyszukaj = new GridBagConstraints();
		gbc_rndjtxtfldWyszukaj.fill = GridBagConstraints.HORIZONTAL;
		gbc_rndjtxtfldWyszukaj.insets = new Insets(0, 0, 0, 5);
		gbc_rndjtxtfldWyszukaj.gridx = 2;
		gbc_rndjtxtfldWyszukaj.gridy = 0;
		TopCenterPanel.add(rndjtxtfldWyszukaj, gbc_rndjtxtfldWyszukaj);
		rndjtxtfldWyszukaj.setForeground(Color.GRAY);
		rndjtxtfldWyszukaj.setFont(new Font("Tahoma", Font.BOLD, 14));
		rndjtxtfldWyszukaj.setHorizontalAlignment(SwingConstants.LEFT);
		rndjtxtfldWyszukaj.setText("Wyszukaj");
		
		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 3;
		gbc_panel_11.gridy = 0;
		panel_11.setBackground(new Color(36,36,36));
		TopCenterPanel.add(panel_11, gbc_panel_11);
		
		lblUsername = new JLabel();
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBackground(Color.WHITE);
		panel_11.add(lblUsername);
		lblNewLabel_5.setIcon(new ImageIcon(MainScreen.class.getResource("/img/menu.png")));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 20);
		gbc_lblNewLabel_5.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 0;
		TopCenterPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JPanel CenterContent = new JPanel(); 
		 /*protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};*/
		CenterContent.setOpaque(false);
		CenterContent.setBackground(new Color(40,40,40));
		GridBagConstraints gbc_CenterContent = new GridBagConstraints();
		gbc_CenterContent.fill = GridBagConstraints.BOTH;
		gbc_CenterContent.gridx = 0;
		gbc_CenterContent.gridy = 1;
		contentPane.add(CenterContent, gbc_CenterContent);
		GridBagLayout gbl_CenterContent = new GridBagLayout();
		gbl_CenterContent.columnWidths = new int[]{182, 0, 0};
		gbl_CenterContent.rowHeights = new int[]{0, 0};
		gbl_CenterContent.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_CenterContent.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		CenterContent.setLayout(gbl_CenterContent);
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBorder(null);
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		panel_6.setBackground(new Color(36,36,36));
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 0;
		CenterContent.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{232, 0};
		gbl_panel_6.rowHeights = new int[]{60, 60, 272, 60, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		UIManager.put("ScrollBar.thumb", new ColorUIResource(Color.RED));
	
		JScrollPane scrollPane = new JScrollPane();
	
	
		 
		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() );
		scrollPane.getHorizontalScrollBar().setUI(new BasicScrollBarUI());
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		panel_10.setBackground(new Color(25,25,25));
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 0;
		panel_6.add(panel_10, gbc_panel_10);
		panel_10.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/home1.png")));
		panel_10.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_7.setBackground(new Color(25, 25, 25));
		panel_7.setLayout(null);
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 1;
		panel_6.add(panel_7, gbc_panel_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 232, 60);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JPAlbum.jpg")).getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH)));
		panel_7.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainScreen.class.getResource("/img/next.png")));
		lblNewLabel_2.setBounds(30, 24, 16, 16);
		panel_7.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainScreen.class.getResource("/img/next1.png")));
		label.setBounds(186, 24, 16, 16);
		panel_7.add(label);

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
		panel_8.setBackground(new Color(25,25,25));
		panel_8.setBorder(null);
		panel_8.setPreferredSize(new Dimension(10, 1000));
		scrollPane.setViewportView(panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0};
		gbl_panel_8.rowHeights = new int[]{20, 40, 40, 40, 40, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JPanel SongButtonPanel = new JPanel();
	SongButtonPanel.setBackground(new Color(25,25,25));
		GridBagConstraints gbc_SongButtonPanel = new GridBagConstraints();
		gbc_SongButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_SongButtonPanel.gridx = 0;
		gbc_SongButtonPanel.gridy = 1;
		panel_8.add(SongButtonPanel, gbc_SongButtonPanel);
		
		JLabel lblNewLabel_3 = new JLabel("UTWORY");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_3.setForeground(new Color(179,179,179));
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_3.setForeground(new Color(255,255,255));
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(179,179,179));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		SongButtonPanel.add(lblNewLabel_3);
		
		JPanel AlbumsButtonPanel = new JPanel();
		AlbumsButtonPanel.setBackground(new Color(25, 25, 25));
		GridBagConstraints gbc_AlbumsButtonPanel = new GridBagConstraints();
		gbc_AlbumsButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_AlbumsButtonPanel.gridx = 0;
		gbc_AlbumsButtonPanel.gridy = 2;
		panel_8.add(AlbumsButtonPanel, gbc_AlbumsButtonPanel);
		
		JLabel lblAlbums = new JLabel("ALBUMY");
		lblAlbums.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAlbums.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAlbums.setForeground(new Color(179, 179, 179));
			}
		});
		lblAlbums.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlbums.setForeground(new Color(179, 179, 179));
		lblAlbums.setFont(new Font("Tahoma", Font.BOLD, 14));
		AlbumsButtonPanel.add(lblAlbums);
		
		
		JPanel FavouritesButtonPanel = new JPanel();
		FavouritesButtonPanel.setBackground(new Color(25, 25, 25));
		GridBagConstraints gbc_FavouritesButtonPanel = new GridBagConstraints();
		gbc_FavouritesButtonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_FavouritesButtonPanel.gridx = 0;
		gbc_FavouritesButtonPanel.gridy = 3;
		panel_8.add(FavouritesButtonPanel, gbc_FavouritesButtonPanel);
		
		JLabel lblUlubione = new JLabel("ULUBIONE");
		lblUlubione.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblUlubione.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblUlubione.setForeground(new Color(179, 179, 179));
			}
		});
		lblUlubione.setHorizontalAlignment(SwingConstants.CENTER);
		lblUlubione.setForeground(new Color(179, 179, 179));
		lblUlubione.setFont(new Font("Tahoma", Font.BOLD, 14));
		FavouritesButtonPanel.add(lblUlubione);
		
		JPanel PlayListsPanel = new JPanel();
		PlayListsPanel.setBackground(new Color(25, 25, 25));
		GridBagConstraints gbc_PlayListsPanel = new GridBagConstraints();
		gbc_PlayListsPanel.gridx = 0;
		gbc_PlayListsPanel.gridy = 4;
		panel_8.add(PlayListsPanel, gbc_PlayListsPanel);
		
		JLabel lblPlaylisty = new JLabel("PLAYLISTY");
		lblPlaylisty.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPlaylisty.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPlaylisty.setForeground(new Color(179, 179, 179));
			}
		});
		lblPlaylisty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaylisty.setForeground(new Color(179, 179, 179));
		lblPlaylisty.setFont(new Font("Tahoma", Font.BOLD, 14));
		PlayListsPanel.add(lblPlaylisty);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(25, 25, 25));
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
		
		JPanel panel_5 = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		panel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_5.setOpaque(false);
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 0;
	panel_5.setBackground(new Color(40,40,40,1));
		CenterContent.add(panel_5, gbc_panel_5);
		
		JScrollPane scrollPane_1 = new JScrollPane(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setOpaque(false);
		 scrollPane_1.getViewport().setBackground( new Color(255,255,255,0));
		panel_5.setLayout(new BorderLayout(0, 0));
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBackground(new Color(40,40,40,0));
		panel_5.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		panel_9.setPreferredSize(new Dimension(10, 1000));
		panel_9.setOpaque(false);
		panel_9.setBackground(new Color(255,255,255,50));
		scrollPane_1.setViewportView(panel_9);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{1020, 0};
		gbl_panel_9.rowHeights = new int[]{1000, 0};
		gbl_panel_9.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JLabel label_3 = new JLabel("New label");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 0;
		panel_9.add(label_3, gbc_label_3);
	
		JPanel BottomUI = new JPanel();
		BottomUI.setBackground(new Color(36,36,36));
		GridBagConstraints gbc_BottomUI = new GridBagConstraints();
		gbc_BottomUI.fill = GridBagConstraints.BOTH;
		gbc_BottomUI.gridx = 0;
		gbc_BottomUI.gridy = 2;
		contentPane.add(BottomUI, gbc_BottomUI);
		GridBagLayout gbl_BottomUI = new GridBagLayout();
		gbl_BottomUI.columnWidths = new int[]{250, 0, 200, 0};
		gbl_BottomUI.rowHeights = new int[]{80, 0};
		gbl_BottomUI.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_BottomUI.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		BottomUI.setLayout(gbl_BottomUI);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36,36,36));
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		BottomUI.add(panel, gbc_panel);
		
		JLabel SongInfoPanel_AlbumCover = new JLabel("");
		SongInfoPanel_AlbumCover.setBounds(10, 11, 56, 56);
		panel.add(SongInfoPanel_AlbumCover);
		SongInfoPanel_AlbumCover.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JPAlbum.jpg")).getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH)));
		
		JLabel lblAcdc = new JLabel("John Williams");
		lblAcdc.setBounds(64, 41, 117, 15);
		panel.add(lblAcdc);
		lblAcdc.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcdc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAcdc.setForeground(Color.LIGHT_GRAY);
		
		JLabel lblShookMeAll = new JLabel("Jurassic Park");
		lblShookMeAll.setBounds(64, 15, 117, 15);
		panel.add(lblShookMeAll);
		lblShookMeAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblShookMeAll.setForeground(Color.WHITE);
		lblShookMeAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblShookMeAll.setBackground(Color.DARK_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainScreen.class.getResource("/img/favIcon2.png")));
		lblNewLabel.setBounds(177, 14, 16, 16);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(36,36,36));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		BottomUI.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{80, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setHgap(16);
		panel_4.setBackground(new Color(36,36,36));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
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
		panel_2.setBackground(new Color(36,36,36));
		panel_2.setLayout(null);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 0;
		BottomUI.add(panel_2, gbc_panel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(42, 31, 16, 16);
		lblNewLabel_6.setIcon(new ImageIcon(MainScreen.class.getResource("/img/volumeMute.png")));
		panel_2.add(lblNewLabel_6);
		
		ClickableProgressBar clickableProgressBar = new ClickableProgressBar();
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
		clickableProgressBar.setBounds(69, 38, 100, 6);
		panel_2.add(clickableProgressBar);
			
			
		
			
			
			
		
			
			
		Image img = new ImageIcon(this.getClass().getResource("/img/mainbg2.jpg")).getImage();
	
		
	}
}
