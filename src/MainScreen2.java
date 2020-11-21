
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
import javax.swing.border.CompoundBorder;
import javax.swing.JSeparator;
import java.awt.Window.Type;
//xD
public class MainScreen2 extends JFrame {
//xD2master
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				
					//UIManager.setLookAndFeel(new SubstanceGraphiteLookAndFeel());
					MainScreen2 frame = new MainScreen2();
					frame.setVisible(true);

				
				


					 
					 
					 
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

					SwingUtilities.updateComponentTreeUI(frame);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public MainScreen2() throws FontFormatException, IOException {
		setResizable(false);
		setTitle("SurBan Studio");
		MainScreen2.setDefaultLookAndFeelDecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1236, 633);
		
		this.setLocationRelativeTo(null);
		contentPane = new JPanel() {
		
		  public void paintComponent(Graphics g) { Image img =
		 Toolkit.getDefaultToolkit().getImage(
		  MainScreen2.class.getResource("/img/rwd.jpg")); g.drawImage(img, 0,
		  0, this.getWidth(), this.getHeight(), this); }
		  
		 
		  };
		 
		BufferedImage myPicture = ImageIO.read(this.getClass().getResource("/img/maxresdefault.jpg"));
		contentPane.setRequestFocusEnabled(false);
		contentPane.setFocusable(false);
		contentPane.setForeground(SystemColor.activeCaptionBorder);
		
		
		
		
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BottomInterface = new JPanel();
		BottomInterface.setBorder(null);
		BottomInterface.setBounds(0, 520, 1230, 84);
		BottomInterface.setBackground(new Color(40, 40, 40,255));
		contentPane.add(BottomInterface);
		BottomInterface.setLayout(null);
		
		JPanel ButtonsPanel = new JPanel();
		ButtonsPanel.setBounds(485, 5, 260, 45);
		ButtonsPanel.setBackground(new Color(40, 40, 40,255));
		ButtonsPanel.setPreferredSize( new Dimension(500, 70) );
		BottomInterface.add(ButtonsPanel);
		ButtonsPanel.setLayout(null);
		
		JPanel ButtonsPanelButtons = new JPanel();
		ButtonsPanelButtons.setBounds(0, 5, 260, 40);
		ButtonsPanel.add(ButtonsPanelButtons);
		ButtonsPanelButtons.setBackground(new Color(40, 40, 40,255));
		ButtonsPanelButtons.setPreferredSize( new Dimension(500, 40) );
		ButtonsPanelButtons.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(50, 12, 16, 16);
		lblNewLabel_2_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/iconmonstr-media-control-42-16.png")));
		ButtonsPanelButtons.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(82, 12, 16, 16);
		lblNewLabel_2.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/iconmonstr-media-control-52-16.png")));
		ButtonsPanelButtons.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(114, 4, 32, 32);
		lblNewLabel.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/iconmonstr-media-control-4-32.png")));
		ButtonsPanelButtons.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(162, 12, 16, 16);
		lblNewLabel_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/iconmonstr-media-control-53-16.png")));
		ButtonsPanelButtons.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/iconmonstr-media-control-39-16.png")));
		lblNewLabel_1_1.setBounds(194, 12, 16, 16);
		ButtonsPanelButtons.add(lblNewLabel_1_1);
		
		JPanel CurrentSongInfo = new JPanel();
		CurrentSongInfo.setBounds(0, 5, 284, 70);
		CurrentSongInfo.setBackground(new Color(40, 40, 40,255));
		CurrentSongInfo.setForeground(new Color(40, 40, 40,255));
		BottomInterface.add(CurrentSongInfo);
		CurrentSongInfo.setLayout(null);
		
		JLabel CoverLabel = new JLabel("");
		CoverLabel.setBounds(10, 0, 60, 60);
		CoverLabel.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/acdc.jpg")));
		
		CurrentSongInfo.add(CoverLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Shook Me All Night Long");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(80, 11, 152, 14);
		CurrentSongInfo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("AC/DC");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(80, 36, 162, 14);
		CurrentSongInfo.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(258, 11, 16, 16);
		CurrentSongInfo.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/favIcon2.png")));
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(10, 37, 46, 14);
		CurrentSongInfo.add(lblNewLabel_10);
		
		ClickableProgressBar progressBar = new ClickableProgressBar();
		progressBar.setBounds(440, 56, 350, 4);
		BottomInterface.add(progressBar);
		progressBar.setFocusable(false);
		progressBar.setBorder(null);
		progressBar.setForeground(new Color(105,105,105));
		progressBar.setValue(50);
		progressBar.setBorderPainted(false);
		progressBar.setBackground(new Color(179, 179, 179));
		
		JLabel lblNewLabel_6 = new JLabel("00:00");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(384, 52, 46, 14);
		BottomInterface.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("03:00");
		lblNewLabel_6_1.setBounds(800, 52, 46, 14);
		BottomInterface.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JPanel VolumeControlPanel = new JPanel();
		VolumeControlPanel.setBounds(1016, 10, 204, 40);
		VolumeControlPanel.setBackground(new Color(40, 40, 40,255));
		BottomInterface.add(VolumeControlPanel);
		VolumeControlPanel.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(94, 15, 100, 10);
		slider.setBackground(new Color(40, 40, 40,255));
		slider.setForeground(new Color(179,179,179,255));
		VolumeControlPanel.add(slider);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\winte\\Documents\\oyszne\\volumeMute.png"));
		lblNewLabel_1_1_1.setBorder(new EmptyBorder(0, 6, 0, 0));
		lblNewLabel_1_1_1.setBounds(62, 12, 22, 16);
		VolumeControlPanel.add(lblNewLabel_1_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(281, 71, 115, -53);
		BottomInterface.add(scrollPane_2);
		
		JPanel SideBar = new JPanel();
		SideBar.setBounds(0, 30, 191, 490);
		SideBar.setBackground(new Color(255, 255, 255,0));
		
		contentPane.add(SideBar);
		SideBar.setLayout(null);
		
		JPanel RandomAlbumPanel = new JPanel();
		RandomAlbumPanel.setBorder(null);
		RandomAlbumPanel.setBounds(0, 0, 168, 67);
		RandomAlbumPanel.setBackground(new Color(31, 31, 31));
		SideBar.add(RandomAlbumPanel);
		RandomAlbumPanel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setToolTipText("Previous Album");
		lblNewLabel_8.setBounds(23, 25, 16, 16);
		RandomAlbumPanel.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/next.png")));
		
		JLabel PlayRandom = new JLabel("");
		PlayRandom.setToolTipText("AlbumCover");
		PlayRandom.setHorizontalAlignment(SwingConstants.CENTER);
		PlayRandom.setBounds(52, 0, 64, 64);
		RandomAlbumPanel.add(PlayRandom);
		PlayRandom.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/acdc.jpg")));
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setToolTipText("Next Album");
		lblNewLabel_8_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/next1.png")));
		lblNewLabel_8_1.setBounds(129, 25, 16, 16);
		RandomAlbumPanel.add(lblNewLabel_8_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setAutoscrolls(true);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 67, 191, 423);
		SideBar.add(scrollPane);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(null);
			panel_1.setPreferredSize(new Dimension(192, 600));
			scrollPane.setViewportView(panel_1);
			panel_1.setBackground(new Color(36, 36, 36));
			panel_1.setLayout(null);
			
			JPanel Home_Button = new JPanel();
			Home_Button.setBounds(0, 0, 168, 50);
			panel_1.add(Home_Button);
			Home_Button.setBackground(new Color(36, 36, 36,255));
			Home_Button.setLayout(null);
			
			JLabel lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/home1.png")));
			lblNewLabel_7.setBounds(10, 13, 24, 24);
			Home_Button.add(lblNewLabel_7);
			
			JLabel homeLabel = new JLabel("HOME");
			homeLabel.setHorizontalAlignment(SwingConstants.CENTER);
			homeLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			homeLabel.setForeground(new Color(179,179,179,255));
			homeLabel.setBounds(62, 13, 44, 24);
			Home_Button.add(homeLabel);
			
			JPanel Songs_Button = new JPanel();
			Songs_Button.setBounds(0, 49, 168, 50);
			panel_1.add(Songs_Button);
			Songs_Button.setLayout(null);
			Songs_Button.setBackground(new Color(36, 36, 36));
			
			JLabel lblNewLabel_7_1_1 = new JLabel("");
			lblNewLabel_7_1_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/playbt.png")));
			lblNewLabel_7_1_1.setBounds(9, 13, 24, 24);
			Songs_Button.add(lblNewLabel_7_1_1);
			
			JLabel lblUtwory = new JLabel("UTWORY");
			lblUtwory.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory.setForeground(new Color(179, 179, 179));
			lblUtwory.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUtwory.setBounds(52, 13, 63, 24);
			Songs_Button.add(lblUtwory);
			
			JPanel Albums_Buttom = new JPanel();
			Albums_Buttom.setBounds(0, 98, 168, 50);
			panel_1.add(Albums_Buttom);
			Albums_Buttom.setLayout(null);
			Albums_Buttom.setBackground(new Color(36, 36, 36));
			
			JLabel lblNewLabel_7_1 = new JLabel("");
			lblNewLabel_7_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/songs.png")));
			lblNewLabel_7_1.setBounds(9, 13, 24, 24);
			Albums_Buttom.add(lblNewLabel_7_1);
			
			JLabel lblMelina = new JLabel("ALBUMY");
			lblMelina.setHorizontalAlignment(SwingConstants.CENTER);
			lblMelina.setForeground(new Color(179, 179, 179));
			lblMelina.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblMelina.setBounds(52, 13, 63, 24);
			Albums_Buttom.add(lblMelina);
			
			JPanel Albums_Buttom_1 = new JPanel();
			Albums_Buttom_1.setLayout(null);
			Albums_Buttom_1.setBackground(new Color(36, 36, 36));
			Albums_Buttom_1.setBounds(0, 147, 168, 50);
			panel_1.add(Albums_Buttom_1);
			
			JLabel lblNewLabel_7_1_2 = new JLabel("");
			lblNewLabel_7_1_2.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/iconmonstr-text-27-32.png")));
			lblNewLabel_7_1_2.setBounds(9, 13, 24, 24);
			Albums_Buttom_1.add(lblNewLabel_7_1_2);
			
			JLabel lblPlaylisty = new JLabel("PLAYLISTY");
			lblPlaylisty.setHorizontalAlignment(SwingConstants.CENTER);
			lblPlaylisty.setForeground(new Color(179, 179, 179));
			lblPlaylisty.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPlaylisty.setBounds(33, 13, 106, 24);
			Albums_Buttom_1.add(lblPlaylisty);
			
			
			
			
			
		
			
			JPanel TopMenu_1 = new JPanel();
			TopMenu_1.setBounds(1110, 0, 120, 30);
			TopMenu_1.setLayout(null);
			TopMenu_1.setBackground(new Color(40, 40, 40));
			contentPane.add(TopMenu_1);
			
			JLabel lblNewLabel_5_1 = new JLabel("");
			lblNewLabel_5_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/menu.png")));
			lblNewLabel_5_1.setBounds(72, 3, 24, 24);
			TopMenu_1.add(lblNewLabel_5_1);
			
			JPanel TopMenu_1_1 = new JPanel();
			TopMenu_1_1.setBounds(0, 0, 168, 30);
			TopMenu_1_1.setLayout(null);
			TopMenu_1_1.setBackground(new Color(40, 40, 40));
			contentPane.add(TopMenu_1_1);
			
			JLabel lblNewLabel_5_1_1_1 = new JLabel("");
			lblNewLabel_5_1_1_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/logoph.png")));
			lblNewLabel_5_1_1_1.setBounds(72, 3, 24, 24);
			TopMenu_1_1.add(lblNewLabel_5_1_1_1);
			
			JPanel TopMenu_1_2 = new JPanel();
			TopMenu_1_2.setBounds(167, 0, 944, 30);
			TopMenu_1_2.setLayout(null);
			TopMenu_1_2.setBackground(new Color(40,40,40,255));
			contentPane.add(TopMenu_1_2);
			
			JLabel lblNewLabel_5_1_1 = new JLabel("");
			lblNewLabel_5_1_1.setBounds(72, 3, 24, 24);
			TopMenu_1_2.add(lblNewLabel_5_1_1);
			
			JPanel Songs_Button_1_1 = new JPanel();
			Songs_Button_1_1.setBounds(167, 30, 1063, 68);
			contentPane.add(Songs_Button_1_1);
			Songs_Button_1_1.setLayout(null);
			Songs_Button_1_1.setBackground(new Color(31, 31, 31));
			
			JLabel lblNewLabel_7_1_1_1_1 = new JLabel("");
			lblNewLabel_7_1_1_1_1.setBounds(9, 13, 24, 24);
			Songs_Button_1_1.add(lblNewLabel_7_1_1_1_1);
			
			JLabel lblUtwory_1_1 = new JLabel("OK\u0141ADKA");
			lblUtwory_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_1.setForeground(new Color(179, 179, 179));
			lblUtwory_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUtwory_1_1.setBounds(145, 27, 126, 14);
			Songs_Button_1_1.add(lblUtwory_1_1);
			
			JLabel lblUtwory_1_1_1 = new JLabel("TYTU\u0141");
			lblUtwory_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_1_1.setForeground(new Color(179, 179, 179));
			lblUtwory_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUtwory_1_1_1.setBounds(418, 27, 63, 14);
			Songs_Button_1_1.add(lblUtwory_1_1_1);
			
			JLabel lblUtwory_1_1_1_1 = new JLabel("CZAS TRWANIA");
			lblUtwory_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_1_1_1.setForeground(new Color(179, 179, 179));
			lblUtwory_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUtwory_1_1_1_1.setBounds(846, 27, 161, 14);
			Songs_Button_1_1.add(lblUtwory_1_1_1_1);
			
			JLabel lblUtwory_1_1_1_2 = new JLabel("WYKONAWCA");
			lblUtwory_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_1_1_2.setForeground(new Color(179, 179, 179));
			lblUtwory_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUtwory_1_1_1_2.setBounds(640, 27, 104, 14);
			Songs_Button_1_1.add(lblUtwory_1_1_1_2);
			
			JPanel panel = new JPanel();
			panel.setBorder(null);
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(0);
			flowLayout.setHgap(0);
			panel.setBackground(new Color(179, 179, 179,0));
		
			
			JScrollPane scrollPane_1 = new JScrollPane(panel);
			scrollPane_1.setBorder(null);
			  scrollPane_1.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){
			        @Override
			        public void adjustmentValueChanged(AdjustmentEvent e) {
			            repaint();
			        }
			    });
				scrollPane_1.setViewportView(panel);
			scrollPane_1.setViewportBorder(null);
			scrollPane_1.setBackground(new Color(179, 179, 179,0));
			scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_1.setBounds(191, 97, 1029, 423);
			contentPane.add(scrollPane_1);
			
			
			
			JPanel SongDetails_1 = new JPanel();
			SongDetails_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			SongDetails_1.setBorder(null);
			SongDetails_1.setPreferredSize(new Dimension(1029, 800));
			SongDetails_1.setBackground(new Color(36, 36, 36,170));
			SongDetails_1.setMinimumSize(new Dimension(5, 500));
	
		
			panel.add(SongDetails_1);
			GridBagLayout gbl_SongDetails_1 = new GridBagLayout();
			gbl_SongDetails_1.columnWidths = new int[] {0, 170, 193, 188, 179, 1};
			gbl_SongDetails_1.rowHeights = new int[]{0, 50, 0, 50, 0, 50, 0, 0, 0};
			gbl_SongDetails_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_SongDetails_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			SongDetails_1.setLayout(gbl_SongDetails_1);
			
			JSeparator separator_1_1 = new JSeparator();
			separator_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(36,36,36)));
			separator_1_1.setBackground(Color.RED);
			GridBagConstraints gbc_separator_1_1 = new GridBagConstraints();
			gbc_separator_1_1.gridwidth = 5;
			gbc_separator_1_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_1_1.insets = new Insets(0, 0, 5, 0);
			gbc_separator_1_1.gridx = 0;
			gbc_separator_1_1.gridy = 0;
			SongDetails_1.add(separator_1_1, gbc_separator_1_1);
			
			JLabel lblNewLabel_4_1 = new JLabel("");
			lblNewLabel_4_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/favIcon2.png")));
			GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
			gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4_1.gridx = 0;
			gbc_lblNewLabel_4_1.gridy = 1;
			SongDetails_1.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
			
			JLabel lblUtwory_1_2_2_1_2 = new JLabel("Shook Me All Night Long");
			lblUtwory_1_2_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_2.setForeground(Color.LIGHT_GRAY);
			lblUtwory_1_2_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_2 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblUtwory_1_2_2_1_2.gridx = 2;
			gbc_lblUtwory_1_2_2_1_2.gridy = 1;
			SongDetails_1.add(lblUtwory_1_2_2_1_2, gbc_lblUtwory_1_2_2_1_2);
			
			JLabel lblUtwory_1_2_2_1 = new JLabel("AC/DC");
			GridBagConstraints gbc_lblUtwory_1_2_2_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblUtwory_1_2_2_1.gridx = 3;
			gbc_lblUtwory_1_2_2_1.gridy = 1;
			SongDetails_1.add(lblUtwory_1_2_2_1, gbc_lblUtwory_1_2_2_1);
			lblUtwory_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1.setForeground(Color.LIGHT_GRAY);
			lblUtwory_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			
			JLabel lblUtwory_1_2_2_1_1 = new JLabel("2:30");
			lblUtwory_1_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_1.setForeground(Color.WHITE);
			lblUtwory_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_1.insets = new Insets(0, 0, 5, 0);
			gbc_lblUtwory_1_2_2_1_1.gridx = 4;
			gbc_lblUtwory_1_2_2_1_1.gridy = 1;
			SongDetails_1.add(lblUtwory_1_2_2_1_1, gbc_lblUtwory_1_2_2_1_1);
			
			JSeparator separator = new JSeparator();
			separator.setBackground(Color.RED);
			separator.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
			GridBagConstraints gbc_separator = new GridBagConstraints();
			gbc_separator.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator.gridwidth = 5;
			gbc_separator.insets = new Insets(0, 0, 5, 0);
			gbc_separator.gridx = 0;
			gbc_separator.gridy = 2;
			SongDetails_1.add(separator, gbc_separator);
			
			JLabel lblNewLabel_4_1_1 = new JLabel("");
			lblNewLabel_4_1_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/favIcon2.png")));
			GridBagConstraints gbc_lblNewLabel_4_1_1 = new GridBagConstraints();
			gbc_lblNewLabel_4_1_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4_1_1.gridx = 0;
			gbc_lblNewLabel_4_1_1.gridy = 3;
			SongDetails_1.add(lblNewLabel_4_1_1, gbc_lblNewLabel_4_1_1);
			
			JLabel lblNewLabel_5_2 = new JLabel("");
			lblNewLabel_5_2.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/350x350.jpg")));
			GridBagConstraints gbc_lblNewLabel_5_2 = new GridBagConstraints();
			gbc_lblNewLabel_5_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5_2.gridx = 1;
			gbc_lblNewLabel_5_2.gridy = 3;
			SongDetails_1.add(lblNewLabel_5_2, gbc_lblNewLabel_5_2);
			
			JLabel lblUtwory_1_2_2_1_2_1 = new JLabel("Highway To Hell");
			lblUtwory_1_2_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_2_1.setForeground(Color.LIGHT_GRAY);
			lblUtwory_1_2_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_2_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_2_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblUtwory_1_2_2_1_2_1.gridx = 2;
			gbc_lblUtwory_1_2_2_1_2_1.gridy = 3;
			SongDetails_1.add(lblUtwory_1_2_2_1_2_1, gbc_lblUtwory_1_2_2_1_2_1);
			
			JLabel lblUtwory_1_2_2_1_3 = new JLabel("AC/DC");
			lblUtwory_1_2_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_3.setForeground(Color.LIGHT_GRAY);
			lblUtwory_1_2_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_3 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblUtwory_1_2_2_1_3.gridx = 3;
			gbc_lblUtwory_1_2_2_1_3.gridy = 3;
			SongDetails_1.add(lblUtwory_1_2_2_1_3, gbc_lblUtwory_1_2_2_1_3);
			
			JLabel lblUtwory_1_2_2_1_1_1 = new JLabel("3:00");
			lblUtwory_1_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_1_1.setForeground(Color.WHITE);
			lblUtwory_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_1_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_1_1.insets = new Insets(0, 0, 5, 0);
			gbc_lblUtwory_1_2_2_1_1_1.gridx = 4;
			gbc_lblUtwory_1_2_2_1_1_1.gridy = 3;
			SongDetails_1.add(lblUtwory_1_2_2_1_1_1, gbc_lblUtwory_1_2_2_1_1_1);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setForeground(Color.LIGHT_GRAY);
			separator_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
			separator_1.setBackground(Color.RED);
			GridBagConstraints gbc_separator_1 = new GridBagConstraints();
			gbc_separator_1.gridwidth = 5;
			gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_1.insets = new Insets(0, 0, 5, 0);
			gbc_separator_1.gridx = 0;
			gbc_separator_1.gridy = 4;
			SongDetails_1.add(separator_1, gbc_separator_1);
			
			JLabel lblNewLabel_4_1_2 = new JLabel("");
			lblNewLabel_4_1_2.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/favIcon2.png")));
			GridBagConstraints gbc_lblNewLabel_4_1_2 = new GridBagConstraints();
			gbc_lblNewLabel_4_1_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4_1_2.gridx = 0;
			gbc_lblNewLabel_4_1_2.gridy = 5;
			SongDetails_1.add(lblNewLabel_4_1_2, gbc_lblNewLabel_4_1_2);
			
			JLabel lblNewLabel_5_2_1 = new JLabel("");
		
			lblNewLabel_5_2_1.setIcon(new ImageIcon(MainScreen2.class.getResource("/img/R-4125665-1562874043-9309.jpeg.jpg")));
			GridBagConstraints gbc_lblNewLabel_5_2_1 = new GridBagConstraints();
			gbc_lblNewLabel_5_2_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5_2_1.gridx = 1;
			gbc_lblNewLabel_5_2_1.gridy = 5;
			SongDetails_1.add(lblNewLabel_5_2_1, gbc_lblNewLabel_5_2_1);
			
			JLabel lblUtwory_1_2_2_1_2_1_1 = new JLabel("Jurassic Park");
			lblUtwory_1_2_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_2_1_1.setForeground(Color.LIGHT_GRAY);
			lblUtwory_1_2_2_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_2_1_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_2_1_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblUtwory_1_2_2_1_2_1_1.gridx = 2;
			gbc_lblUtwory_1_2_2_1_2_1_1.gridy = 5;
			SongDetails_1.add(lblUtwory_1_2_2_1_2_1_1, gbc_lblUtwory_1_2_2_1_2_1_1);
			
			JLabel lblUtwory_1_2_2_1_3_1 = new JLabel("John Williams");
			lblUtwory_1_2_2_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_3_1.setForeground(Color.LIGHT_GRAY);
			lblUtwory_1_2_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_3_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_3_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblUtwory_1_2_2_1_3_1.gridx = 3;
			gbc_lblUtwory_1_2_2_1_3_1.gridy = 5;
			SongDetails_1.add(lblUtwory_1_2_2_1_3_1, gbc_lblUtwory_1_2_2_1_3_1);
			
			JLabel lblUtwory_1_2_2_1_1_1_1 = new JLabel("3:00");
			lblUtwory_1_2_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblUtwory_1_2_2_1_1_1_1.setForeground(Color.WHITE);
			lblUtwory_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblUtwory_1_2_2_1_1_1_1 = new GridBagConstraints();
			gbc_lblUtwory_1_2_2_1_1_1_1.insets = new Insets(0, 0, 5, 0);
			gbc_lblUtwory_1_2_2_1_1_1_1.gridx = 4;
			gbc_lblUtwory_1_2_2_1_1_1_1.gridy = 5;
			SongDetails_1.add(lblUtwory_1_2_2_1_1_1_1, gbc_lblUtwory_1_2_2_1_1_1_1);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
			separator_2.setBackground(Color.RED);
			GridBagConstraints gbc_separator_2 = new GridBagConstraints();
			gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_2.gridwidth = 5;
			gbc_separator_2.insets = new Insets(0, 0, 5, 0);
			gbc_separator_2.gridx = 0;
			gbc_separator_2.gridy = 6;
			SongDetails_1.add(separator_2, gbc_separator_2);
			
			
		
			
			
			
		
			
			
		Image img = new ImageIcon(this.getClass().getResource("/img/mainbg2.jpg")).getImage();
		
		
	}
}
