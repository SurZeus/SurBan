package mainpackage;
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

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import dependencies.DBViewMethods;
import dependencies.LayoutManagmentMethods;
import dependencies.MainContentCardsMethods;
import dependencies.RoundLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class DataBaseView {

	static JFrame frame;
	/**
	 * @wbp.nonvisual location=499,269
	 */
	

	/**
	 * Launch the application.
	 */
	
	
			
	
	/**
	 * Create the application.
	 */
	public DataBaseView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.MAGENTA);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1800, 505);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel MainDbContainer = new JPanel();
		MainDbContainer.setBounds(0, 0, 1800, 466);
		frame.getContentPane().add(MainDbContainer);
		MainDbContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Refresh");
		
		MainDbContainer.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(700, 400));
		MainDbContainer.add(panel_1);
		
		JPanel DBSongsCard = new JPanel();
		DBSongsCard.setBackground(Color.GRAY);
		DBSongsCard.setBounds(0, 5, 700, 29);
		panel_1.add(DBSongsCard);
		
		JLabel lblUtwory = new JLabel("Utwory");
		DBSongsCard.add(lblUtwory);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(0, 33, 700, 367);
		panel_1.add(scrollPane_1);
		
		JPanel DBSongsCardViewPort = new JPanel();
		DBSongsCardViewPort.setPreferredSize(new Dimension(700, 1000));
		scrollPane_1.setViewportView(DBSongsCardViewPort);
		DBSongsCardViewPort.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(650, 30));
		DBSongsCardViewPort.add(panel_2);
		
		JLabel lblIdutworu = new JLabel("Id_Utworu");
		lblIdutworu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdutworu.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdutworu.setBounds(21, 0, 81, 30);
		panel_2.add(lblIdutworu);
		
		JLabel lblIdwykonawcy_1 = new JLabel("Id_Wykonawcy");
		lblIdwykonawcy_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdwykonawcy_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdwykonawcy_1.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
		lblIdwykonawcy_1.setBounds(112, 0, 113, 30);
		panel_2.add(lblIdwykonawcy_1);
		
		JLabel lblNazwaUtworu = new JLabel("Nazwa Utworu");
		lblNazwaUtworu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNazwaUtworu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaUtworu.setBounds(353, 8, 287, 14);
		panel_2.add(lblNazwaUtworu);
		
		JLabel lblIdalbumu = new JLabel("Id_Albumu");
		lblIdalbumu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdalbumu.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdalbumu.setBounds(235, 8, 108, 14);
		panel_2.add(lblIdalbumu);
		
		JPanel DBArtistsCard = new JPanel();
		DBArtistsCard.setPreferredSize(new Dimension(400, 400));
		MainDbContainer.add(DBArtistsCard);
		DBArtistsCard.setLayout(null);
		
		
		JPanel ArtistsHeader = new JPanel();
		ArtistsHeader.setBackground(Color.GRAY);
		ArtistsHeader.setBounds(0, 5, 400, 29);
		DBArtistsCard.add(ArtistsHeader);
		
		JLabel lblWykonawcy = new JLabel("Wykonawcy");
		ArtistsHeader.add(lblWykonawcy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 33, 400, 367);
		DBArtistsCard.add(scrollPane);
		
		JPanel DBArtistsCardViewPort = new JPanel();
		DBArtistsCardViewPort.setPreferredSize(new Dimension(400, 1000));
		DBArtistsCardViewPort.setBackground(Color.WHITE);
		scrollPane.setViewportView(DBArtistsCardViewPort);
	
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(350, 30));
		DBArtistsCardViewPort.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdwykonawcy = new JLabel("Id_Wykonawcy");
		lblIdwykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdwykonawcy.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdwykonawcy.setBounds(21, 0, 81, 30);
		panel.add(lblIdwykonawcy);
		
		JLabel lblNazwawykonawcy = new JLabel("Nazwa Wykonawcy");
		lblNazwawykonawcy.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNazwawykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwawykonawcy.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
		lblNazwawykonawcy.setBounds(112, 0, 238, 30);
		panel.add(lblNazwawykonawcy);
		DBViewMethods.ArtistsCardAddView(DBArtistsCardViewPort, 0, 1,0);
		DBViewMethods.SongsCardAddView(DBSongsCardViewPort, 0, 1,0);
		
		JPanel DBAlbumsCard = new JPanel();
		DBAlbumsCard.setLayout(null);
		DBAlbumsCard.setPreferredSize(new Dimension(500, 400));
		MainDbContainer.add(DBAlbumsCard);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(500, 10));
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(0, 5, 500, 29);
		DBAlbumsCard.add(panel_4);
		
		JLabel lblAlbumy = new JLabel("Albumy");
		panel_4.add(lblAlbumy);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(0, 33, 500, 367);
		DBAlbumsCard.add(scrollPane_2);
		
		JPanel DBAlbumsCardViewPort = new JPanel();
		DBAlbumsCardViewPort.setPreferredSize(new Dimension(500, 1000));
		scrollPane_2.setViewportView(DBAlbumsCardViewPort);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setPreferredSize(new Dimension(470, 30));
		DBAlbumsCardViewPort.add(panel_3);
		
		JLabel lblIdalbumu_1 = new JLabel("Id_Albumu");
		lblIdalbumu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdalbumu_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdalbumu_1.setBounds(21, 0, 68, 30);
		panel_3.add(lblIdalbumu_1);
		
		JLabel lblNazwaAlbumu = new JLabel("Nazwa Albumu");
		lblNazwaAlbumu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNazwaAlbumu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaAlbumu.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
		lblNazwaAlbumu.setBounds(208, 0, 262, 30);
		panel_3.add(lblNazwaAlbumu);
		
		JLabel lblIdwykonawcy_2 = new JLabel("Id_Wykonawcy");
		lblIdwykonawcy_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdwykonawcy_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdwykonawcy_2.setBounds(99, 0, 74, 30);
		panel_3.add(lblIdwykonawcy_2);
		DBViewMethods.AlbumsCardAddView(DBAlbumsCardViewPort, 0, 1,0);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DBAlbumsCardViewPort.removeAll();
				DBSongsCardViewPort.removeAll();
				DBArtistsCardViewPort.removeAll();
				MainDbContainer.setVisible(false);
				
				JPanel panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setPreferredSize(new Dimension(650, 30));
				DBSongsCardViewPort.add(panel_2);
				
				JLabel lblIdutworu = new JLabel("Id_Utworu");
				lblIdutworu.setHorizontalTextPosition(SwingConstants.CENTER);
				lblIdutworu.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdutworu.setBounds(21, 0, 81, 30);
				panel_2.add(lblIdutworu);
				
				JLabel lblIdwykonawcy_1 = new JLabel("Id_Wykonawcy");
				lblIdwykonawcy_1.setHorizontalTextPosition(SwingConstants.CENTER);
				lblIdwykonawcy_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdwykonawcy_1.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
				lblIdwykonawcy_1.setBounds(112, 0, 113, 30);
				panel_2.add(lblIdwykonawcy_1);
				
				JLabel lblNazwaUtworu = new JLabel("Nazwa Utworu");
				lblNazwaUtworu.setHorizontalTextPosition(SwingConstants.CENTER);
				lblNazwaUtworu.setHorizontalAlignment(SwingConstants.CENTER);
				lblNazwaUtworu.setBounds(353, 8, 287, 14);
				panel_2.add(lblNazwaUtworu);
				
				JLabel lblIdalbumu = new JLabel("Id_Albumu");
				lblIdalbumu.setHorizontalTextPosition(SwingConstants.CENTER);
				lblIdalbumu.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdalbumu.setBounds(235, 8, 108, 14);
				panel_2.add(lblIdalbumu);
				
				JPanel panel = new JPanel();
				panel.setPreferredSize(new Dimension(350, 30));
				DBArtistsCardViewPort.add(panel);
				panel.setLayout(null);
				
				JLabel lblIdwykonawcy = new JLabel("Id_Wykonawcy");
				lblIdwykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdwykonawcy.setHorizontalTextPosition(SwingConstants.CENTER);
				lblIdwykonawcy.setBounds(21, 0, 81, 30);
				panel.add(lblIdwykonawcy);
				
				JLabel lblNazwawykonawcy = new JLabel("Nazwa Wykonawcy");
				lblNazwawykonawcy.setHorizontalTextPosition(SwingConstants.CENTER);
				lblNazwawykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
				lblNazwawykonawcy.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
				lblNazwawykonawcy.setBounds(112, 0, 238, 30);
				panel.add(lblNazwawykonawcy);
				
				
				JPanel DBAlbumsCard = new JPanel();
				DBAlbumsCard.setLayout(null);
				DBAlbumsCard.setPreferredSize(new Dimension(500, 400));
				MainDbContainer.add(DBAlbumsCard);
				
				/*JPanel panel_4 = new JPanel();
				panel_4.setPreferredSize(new Dimension(500, 10));
				panel_4.setBackground(Color.GRAY);
				panel_4.setBounds(0, 5, 500, 29);
				DBAlbumsCard.add(panel_4);
				*/
				JPanel panel_3 = new JPanel();
				panel_3.setLayout(null);
				panel_3.setPreferredSize(new Dimension(470, 30));
				DBAlbumsCardViewPort.add(panel_3);
				
				JLabel lblIdalbumu_1 = new JLabel("Id_Albumu");
				lblIdalbumu_1.setHorizontalTextPosition(SwingConstants.CENTER);
				lblIdalbumu_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdalbumu_1.setBounds(21, 0, 68, 30);
				panel_3.add(lblIdalbumu_1);
				
				JLabel lblNazwaAlbumu = new JLabel("Nazwa Albumu");
				lblNazwaAlbumu.setHorizontalTextPosition(SwingConstants.CENTER);
				lblNazwaAlbumu.setHorizontalAlignment(SwingConstants.CENTER);
				lblNazwaAlbumu.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
				lblNazwaAlbumu.setBounds(208, 0, 262, 30);
				panel_3.add(lblNazwaAlbumu);
				
				JLabel lblIdwykonawcy_2 = new JLabel("Id_Wykonawcy");
				lblIdwykonawcy_2.setHorizontalTextPosition(SwingConstants.CENTER);
				lblIdwykonawcy_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdwykonawcy_2.setBounds(99, 0, 74, 30);
				panel_3.add(lblIdwykonawcy_2);
				
				DBViewMethods.AlbumsCardAddView(DBAlbumsCardViewPort, 0, 1,0);
				DBViewMethods.ArtistsCardAddView(DBArtistsCardViewPort, 0, 1,0);
				DBViewMethods.SongsCardAddView(DBSongsCardViewPort, 0, 1,0);
				MainDbContainer.setVisible(true);
				
				
			}
		});
	}
}
