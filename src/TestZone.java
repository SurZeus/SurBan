import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.CardLayout;

public class TestZone {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestZone window = new TestZone();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestZone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.MAGENTA);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 1288, 908);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel FlowTest = new JPanel();
		FlowTest.setBackground(Color.GRAY);
		FlowTest.setBounds(288, 11, 828, 493);
		frame.getContentPane().add(FlowTest);
		FlowTest.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel LeftDevPanel = new JPanel();
		LeftDevPanel.setBackground(Color.ORANGE);
		LeftDevPanel.setPreferredSize(new Dimension(300, 400));
		FlowTest.add(LeftDevPanel);
		LeftDevPanel.setLayout(null);
		
		JPanel LeftDevPanelButtons = new JPanel();
		LeftDevPanelButtons.setBackground(Color.LIGHT_GRAY);
		LeftDevPanelButtons.setBounds(0, 341, 300, 59);
		LeftDevPanel.add(LeftDevPanelButtons);
		LeftDevPanelButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_4 = new JButton("AddAlbum");
		LeftDevPanelButtons.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("AddSong");
		LeftDevPanelButtons.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("AddAuthor");
		LeftDevPanelButtons.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("TBS1");
		LeftDevPanelButtons.add(btnNewButton_5);
		
		JButton btnNewButton_1 = new JButton("TBS2");
		LeftDevPanelButtons.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("TBS3");
		LeftDevPanelButtons.add(btnNewButton_6);
		
		JPanel SettingsCardsContainer = new JPanel();
		SettingsCardsContainer.setBackground(Color.DARK_GRAY);
		SettingsCardsContainer.setBounds(0, 0, 300, 341);
		LeftDevPanel.add(SettingsCardsContainer);
		SettingsCardsContainer.setLayout(new CardLayout(0, 0));
		
		
		CardLayout cl = new CardLayout(0,0);
		SettingsCardsContainer.setLayout(cl);

		
		JScrollPane DB_View = new JScrollPane();
		DB_View.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		DB_View.setPreferredSize(new Dimension(300, 400));
		DB_View.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		FlowTest.add(DB_View);
		
		JPanel DB_viewPort = new JPanel();
		DB_View.setViewportView(DB_viewPort);
		DB_viewPort.setPreferredSize(new Dimension(300, 3000));
		DB_viewPort.setBackground(Color.DARK_GRAY);
											
											JPanel TileBackground = new JPanel();
											TileBackground.setBounds(0, 0, 232, 300);
											frame.getContentPane().add(TileBackground);
											TileBackground.setPreferredSize(new Dimension(232, 300));
											TileBackground.setLayout(null);
											
											JLabel DevAdd = new JLabel("DevAdd");
											DevAdd.setHorizontalAlignment(SwingConstants.CENTER);
											DevAdd.setBounds(0, 5, 232, 14);
											TileBackground.add(DevAdd);
											
											JPanel panel = new JPanel();
											panel.setBackground(Color.DARK_GRAY);
											panel.setBounds(0, 30, 232, 273);
											TileBackground.add(panel);
											GridBagLayout gbl_panel = new GridBagLayout();
											gbl_panel.columnWidths = new int[]{0, 0};
											gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
											gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
											gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
											panel.setLayout(gbl_panel);
											
											JPanel Title_Row = new JPanel();
											GridBagConstraints gbc_Title_Row = new GridBagConstraints();
											gbc_Title_Row.fill = GridBagConstraints.BOTH;
											gbc_Title_Row.gridx = 0;
											gbc_Title_Row.gridy = 0;
											panel.add(Title_Row, gbc_Title_Row);
											GridBagLayout gbl_Title_Row = new GridBagLayout();
											gbl_Title_Row.columnWidths = new int[]{80, 0, 0};
											gbl_Title_Row.rowHeights = new int[]{0, 0};
											gbl_Title_Row.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_Title_Row.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											Title_Row.setLayout(gbl_Title_Row);
											
											JLabel lblSettitle = new JLabel("Set_Title");
											GridBagConstraints gbc_lblSettitle = new GridBagConstraints();
											gbc_lblSettitle.anchor = GridBagConstraints.EAST;
											gbc_lblSettitle.insets = new Insets(0, 0, 0, 5);
											gbc_lblSettitle.gridx = 0;
											gbc_lblSettitle.gridy = 0;
											Title_Row.add(lblSettitle, gbc_lblSettitle);
											
											textField = new JTextField();
											GridBagConstraints gbc_textField = new GridBagConstraints();
											gbc_textField.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField.gridx = 1;
											gbc_textField.gridy = 0;
											Title_Row.add(textField, gbc_textField);
											textField.setColumns(10);
											
											JPanel Author_Row = new JPanel();
											GridBagConstraints gbc_Author_Row = new GridBagConstraints();
											gbc_Author_Row.fill = GridBagConstraints.BOTH;
											gbc_Author_Row.gridx = 0;
											gbc_Author_Row.gridy = 1;
											panel.add(Author_Row, gbc_Author_Row);
											GridBagLayout gbl_Author_Row = new GridBagLayout();
											gbl_Author_Row.columnWidths = new int[]{80, 0, 0};
											gbl_Author_Row.rowHeights = new int[]{0, 0};
											gbl_Author_Row.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_Author_Row.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											Author_Row.setLayout(gbl_Author_Row);
											
											JLabel lblSetauthor = new JLabel("Set_Author");
											GridBagConstraints gbc_lblSetauthor = new GridBagConstraints();
											gbc_lblSetauthor.insets = new Insets(0, 0, 0, 5);
											gbc_lblSetauthor.anchor = GridBagConstraints.EAST;
											gbc_lblSetauthor.gridx = 0;
											gbc_lblSetauthor.gridy = 0;
											Author_Row.add(lblSetauthor, gbc_lblSetauthor);
											
											textField_1 = new JTextField();
											GridBagConstraints gbc_textField_1 = new GridBagConstraints();
											gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField_1.gridx = 1;
											gbc_textField_1.gridy = 0;
											Author_Row.add(textField_1, gbc_textField_1);
											textField_1.setColumns(10);
											
											JPanel panel_1 = new JPanel();
											GridBagConstraints gbc_panel_1 = new GridBagConstraints();
											gbc_panel_1.fill = GridBagConstraints.BOTH;
											gbc_panel_1.gridx = 0;
											gbc_panel_1.gridy = 2;
											panel.add(panel_1, gbc_panel_1);
											GridBagLayout gbl_panel_1 = new GridBagLayout();
											gbl_panel_1.columnWidths = new int[]{80, 0, 0};
											gbl_panel_1.rowHeights = new int[]{0, 0};
											gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											panel_1.setLayout(gbl_panel_1);
											
											JLabel Album_Row = new JLabel("Set_Album");
											GridBagConstraints gbc_Album_Row = new GridBagConstraints();
											gbc_Album_Row.anchor = GridBagConstraints.EAST;
											gbc_Album_Row.insets = new Insets(0, 0, 0, 5);
											gbc_Album_Row.gridx = 0;
											gbc_Album_Row.gridy = 0;
											panel_1.add(Album_Row, gbc_Album_Row);
											
											textField_2 = new JTextField();
											textField_2.setColumns(10);
											GridBagConstraints gbc_textField_2 = new GridBagConstraints();
											gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField_2.gridx = 1;
											gbc_textField_2.gridy = 0;
											panel_1.add(textField_2, gbc_textField_2);
											
											JButton btnAddsong = new JButton("Add_Song");
											GridBagConstraints gbc_btnAddsong = new GridBagConstraints();
											gbc_btnAddsong.gridx = 0;
											gbc_btnAddsong.gridy = 3;
											panel.add(btnAddsong, gbc_btnAddsong);
											
											JPanel Card1 = new JPanel();
											Card1.setBackground(Color.DARK_GRAY);
											Card1.setBounds(33, 517, 300, 341);
										SettingsCardsContainer.add(Card1,"3");
											
											JPanel AddSongCard = new JPanel();
											AddSongCard.setLayout(null);
											AddSongCard.setPreferredSize(new Dimension(300, 300));
											Card1.add(AddSongCard);
											
											JLabel lblDevaddalbum = new JLabel("DevAddArtist");
											lblDevaddalbum.setHorizontalAlignment(SwingConstants.CENTER);
											lblDevaddalbum.setBounds(0, 5, 300, 14);
											AddSongCard.add(lblDevaddalbum);
											
											JPanel panel_4 = new JPanel();
											panel_4.setBackground(Color.DARK_GRAY);
											panel_4.setBounds(0, 30, 300, 273);
											AddSongCard.add(panel_4);
											GridBagLayout gbl_panel_4 = new GridBagLayout();
											gbl_panel_4.columnWidths = new int[]{0, 0};
											gbl_panel_4.rowHeights = new int[]{0, 0, 0};
											gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
											gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
											panel_4.setLayout(gbl_panel_4);
											
											JPanel panel_5 = new JPanel();
											GridBagConstraints gbc_panel_5 = new GridBagConstraints();
											gbc_panel_5.fill = GridBagConstraints.BOTH;
											gbc_panel_5.insets = new Insets(0, 0, 5, 0);
											gbc_panel_5.gridx = 0;
											gbc_panel_5.gridy = 0;
											panel_4.add(panel_5, gbc_panel_5);
											GridBagLayout gbl_panel_5 = new GridBagLayout();
											gbl_panel_5.columnWidths = new int[]{100, 0, 0};
											gbl_panel_5.rowHeights = new int[]{0, 0};
											gbl_panel_5.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											panel_5.setLayout(gbl_panel_5);
											
											JLabel lblSetalbumtitle = new JLabel("Set_Artist_Name");
											GridBagConstraints gbc_lblSetalbumtitle = new GridBagConstraints();
											gbc_lblSetalbumtitle.insets = new Insets(0, 0, 0, 5);
											gbc_lblSetalbumtitle.gridx = 0;
											gbc_lblSetalbumtitle.gridy = 0;
											panel_5.add(lblSetalbumtitle, gbc_lblSetalbumtitle);
											
											textField_3 = new JTextField();
											textField_3.setColumns(10);
											GridBagConstraints gbc_textField_3 = new GridBagConstraints();
											gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField_3.gridx = 1;
											gbc_textField_3.gridy = 0;
											panel_5.add(textField_3, gbc_textField_3);
											
											JButton btnAddalbum = new JButton("Add_Artist");
											GridBagConstraints gbc_btnAddalbum = new GridBagConstraints();
											gbc_btnAddalbum.gridx = 0;
											gbc_btnAddalbum.gridy = 1;
											panel_4.add(btnAddalbum, gbc_btnAddalbum);
											
											JPanel CardY = new JPanel();
											CardY.setBackground(Color.GREEN);
											CardY.setBounds(421, 515, 300, 341);
											SettingsCardsContainer.add(CardY,"1");
											
											JPanel CardZ = new JPanel();
											CardZ.setBackground(Color.CYAN);
											CardZ.setBounds(748, 517, 300, 341);
										
											SettingsCardsContainer.add(CardZ,"2");
											
											JButton btnNewButton = new JButton("New button");
											btnNewButton.addMouseListener(new MouseAdapter() {
												@Override
												public void mouseClicked(MouseEvent e) {
													cl.show(SettingsCardsContainer, "4");
												}
											});
											btnNewButton.setBounds(100, 411, 89, 23);
											frame.getContentPane().add(btnNewButton);
											
											JPanel Card2 = new JPanel();
											Card2.setBackground(Color.DARK_GRAY);
											Card2.setBounds(433, 515, 300, 341);
											SettingsCardsContainer.add(Card2,"4");
											
											JPanel panel_8 = new JPanel();
											panel_8.setLayout(null);
											panel_8.setPreferredSize(new Dimension(232, 300));
											Card2.add(panel_8);
											
											JLabel lblDevremove = new JLabel("DevRemove");
											lblDevremove.setHorizontalAlignment(SwingConstants.CENTER);
											lblDevremove.setBounds(0, 5, 232, 14);
											panel_8.add(lblDevremove);
											
											JPanel panel_9 = new JPanel();
											panel_9.setBackground(Color.DARK_GRAY);
											panel_9.setBounds(0, 30, 232, 273);
											panel_8.add(panel_9);
											GridBagLayout gbl_panel_9 = new GridBagLayout();
											gbl_panel_9.columnWidths = new int[]{0, 0};
											gbl_panel_9.rowHeights = new int[]{0, 0, 0, 0, 0};
											gbl_panel_9.columnWeights = new double[]{1.0, Double.MIN_VALUE};
											gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
											panel_9.setLayout(gbl_panel_9);
											
											JPanel panel_10 = new JPanel();
											GridBagConstraints gbc_panel_10 = new GridBagConstraints();
											gbc_panel_10.fill = GridBagConstraints.BOTH;
											gbc_panel_10.insets = new Insets(0, 0, 5, 0);
											gbc_panel_10.gridx = 0;
											gbc_panel_10.gridy = 0;
											panel_9.add(panel_10, gbc_panel_10);
											GridBagLayout gbl_panel_10 = new GridBagLayout();
											gbl_panel_10.columnWidths = new int[]{80, 0, 0};
											gbl_panel_10.rowHeights = new int[]{0, 0};
											gbl_panel_10.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_panel_10.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											panel_10.setLayout(gbl_panel_10);
											
											JLabel label_5 = new JLabel("Set_Title");
											GridBagConstraints gbc_label_5 = new GridBagConstraints();
											gbc_label_5.anchor = GridBagConstraints.EAST;
											gbc_label_5.insets = new Insets(0, 0, 0, 5);
											gbc_label_5.gridx = 0;
											gbc_label_5.gridy = 0;
											panel_10.add(label_5, gbc_label_5);
											
											textField_6 = new JTextField();
											textField_6.setColumns(10);
											GridBagConstraints gbc_textField_6 = new GridBagConstraints();
											gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField_6.gridx = 1;
											gbc_textField_6.gridy = 0;
											panel_10.add(textField_6, gbc_textField_6);
											
											JPanel panel_11 = new JPanel();
											GridBagConstraints gbc_panel_11 = new GridBagConstraints();
											gbc_panel_11.fill = GridBagConstraints.BOTH;
											gbc_panel_11.insets = new Insets(0, 0, 5, 0);
											gbc_panel_11.gridx = 0;
											gbc_panel_11.gridy = 1;
											panel_9.add(panel_11, gbc_panel_11);
											GridBagLayout gbl_panel_11 = new GridBagLayout();
											gbl_panel_11.columnWidths = new int[]{80, 0, 0};
											gbl_panel_11.rowHeights = new int[]{0, 0};
											gbl_panel_11.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_panel_11.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											panel_11.setLayout(gbl_panel_11);
											
											JLabel label_6 = new JLabel("Set_Author");
											GridBagConstraints gbc_label_6 = new GridBagConstraints();
											gbc_label_6.anchor = GridBagConstraints.EAST;
											gbc_label_6.insets = new Insets(0, 0, 0, 5);
											gbc_label_6.gridx = 0;
											gbc_label_6.gridy = 0;
											panel_11.add(label_6, gbc_label_6);
											
											textField_7 = new JTextField();
											textField_7.setColumns(10);
											GridBagConstraints gbc_textField_7 = new GridBagConstraints();
											gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField_7.gridx = 1;
											gbc_textField_7.gridy = 0;
											panel_11.add(textField_7, gbc_textField_7);
											
											JPanel panel_12 = new JPanel();
											GridBagConstraints gbc_panel_12 = new GridBagConstraints();
											gbc_panel_12.fill = GridBagConstraints.BOTH;
											gbc_panel_12.insets = new Insets(0, 0, 5, 0);
											gbc_panel_12.gridx = 0;
											gbc_panel_12.gridy = 2;
											panel_9.add(panel_12, gbc_panel_12);
											GridBagLayout gbl_panel_12 = new GridBagLayout();
											gbl_panel_12.columnWidths = new int[]{80, 0, 0};
											gbl_panel_12.rowHeights = new int[]{0, 0};
											gbl_panel_12.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
											gbl_panel_12.rowWeights = new double[]{0.0, Double.MIN_VALUE};
											panel_12.setLayout(gbl_panel_12);
											
											JLabel label_7 = new JLabel("Set_Album");
											GridBagConstraints gbc_label_7 = new GridBagConstraints();
											gbc_label_7.anchor = GridBagConstraints.EAST;
											gbc_label_7.insets = new Insets(0, 0, 0, 5);
											gbc_label_7.gridx = 0;
											gbc_label_7.gridy = 0;
											panel_12.add(label_7, gbc_label_7);
											
											textField_8 = new JTextField();
											textField_8.setColumns(10);
											GridBagConstraints gbc_textField_8 = new GridBagConstraints();
											gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
											gbc_textField_8.gridx = 1;
											gbc_textField_8.gridy = 0;
											panel_12.add(textField_8, gbc_textField_8);
											
											JButton button_1 = new JButton("Add_Song");
											GridBagConstraints gbc_button_1 = new GridBagConstraints();
											gbc_button_1.gridx = 0;
											gbc_button_1.gridy = 3;
											panel_9.add(button_1, gbc_button_1);
	}
}
