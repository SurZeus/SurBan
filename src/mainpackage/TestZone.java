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

import dependencies.LayoutManagmentMethods;
import dependencies.RoundLabel;
import java.awt.Font;

public class TestZone {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=499,269
	 */
	

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
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1211, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(15);
		flowLayout.setHgap(15);
		panel.setBackground(Color.GRAY);
		panel.setBounds(369, 11, 756, 420);
		frame.getContentPane().add(panel);
		
		JPanel ArtistTile = new JPanel();
		ArtistTile.setPreferredSize(new Dimension(200, 230));
		ArtistTile.setBackground(Color.DARK_GRAY);
		panel.add(ArtistTile);
		ArtistTile.setLayout(null);
		
		RoundLabel Overlay_1 = new RoundLabel((String) null);
		Overlay_1.setOpaque(true);
		
		
		
		Overlay_1.setBounds(25, 26, 150, 150);
		ArtistTile.add(Overlay_1);
		
		
		
		
		
		
		
		Overlay_1.setText("");
		Overlay_1.setHorizontalAlignment(SwingConstants.CENTER);
		Overlay_1.setBackground(new Color(25,25,25,200));
	
		RoundLabel ArtistImage = new RoundLabel((String) null);
		ArtistImage.setForeground(Color.WHITE);
		ArtistImage.setBackground(Color.WHITE);
		ArtistImage.setOpaque(true);
		ArtistImage.setBounds(25, 26, 150, 150);
		ArtistTile.add(ArtistImage);
		ArtistImage.setHorizontalAlignment(SwingConstants.CENTER);
		ArtistImage.setIcon(new ImageIcon(TestZone.class.getResource("/img/acdc.jpg")));
		ArtistImage.setText("");
		
		JLabel ArtisName = new JLabel("Eminem");
		ArtisName.setFont(new Font("Tahoma", Font.BOLD, 16));
		ArtisName.setForeground(Color.WHITE);
		ArtisName.setHorizontalAlignment(SwingConstants.CENTER);
		ArtisName.setBounds(0, 187, 200, 20);
		ArtistTile.add(ArtisName);
											Overlay_1.setVisible(false);
		ArtistImage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Overlay_1.setVisible(true);
				Overlay_1.setIcon(new ImageIcon(TestZone.class.getResource("/img/playWhite48.png")));
				//lblNewLabel_1.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/playWhite48.png")));
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Overlay_1.setVisible(false);
				Overlay_1.setIcon(new ImageIcon(TestZone.class.getResource("")));
				//lblNewLabel_1.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("")));
			}
			
		});
	}
}
