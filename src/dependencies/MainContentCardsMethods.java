package dependencies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import mainpackage.TestZone;

public class MainContentCardsMethods {
	public static void addSongsRow(JPanel rowContainer,int rowNumber,int status) {
		
		if(status ==1 ) {
			rowNumber =ShowFormMusic.Utwory.length -1;
		}
		JPanel SongsRowTemplate = new JPanel();
		
		SongsRowTemplate.setBackground(new Color(36,36,36));
		SongsRowTemplate.setMaximumSize(new Dimension(32767, 40));
		rowContainer.add(SongsRowTemplate);
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
		
		JLabel SongsRowFavoriteButton = new JLabel("");
		SongsRowFavoriteButton.setIcon(new ImageIcon(MainContentCardsMethods.class.getResource("/img/favIcon2.png")));
		GridBagConstraints gbc_SongsRowFavoriteButton = new GridBagConstraints();
		gbc_SongsRowFavoriteButton.insets = new Insets(0, 0, 0, 5);
		gbc_SongsRowFavoriteButton.gridx = 1;
		gbc_SongsRowFavoriteButton.gridy = 0;
		SongsRowTemplate.add(SongsRowFavoriteButton, gbc_SongsRowFavoriteButton);
		
		JLabel SongsRowTitle = new JLabel(ShowFormMusic.Utwory[rowNumber][0]);
		SongsRowTitle.setForeground(Color.WHITE);
		SongsRowTitle.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		SongsRowTitle.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_SongsRowTitle = new GridBagConstraints();
		gbc_SongsRowTitle.insets = new Insets(0, 0, 0, 5);
		gbc_SongsRowTitle.anchor = GridBagConstraints.WEST;
		gbc_SongsRowTitle.gridx = 2;
		gbc_SongsRowTitle.gridy = 0;
		SongsRowTemplate.add(SongsRowTitle, gbc_SongsRowTitle);
		
		JLabel lblCreator = new JLabel(ShowFormMusic.Utwory[rowNumber][1]);
		lblCreator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreator.setForeground(Color.WHITE);
		lblCreator.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCreator = new GridBagConstraints();
		gbc_lblCreator.insets = new Insets(0, 0, 0, 5);
		gbc_lblCreator.anchor = GridBagConstraints.WEST;
		gbc_lblCreator.gridx = 3;
		gbc_lblCreator.gridy = 0;
		SongsRowTemplate.add(lblCreator, gbc_lblCreator);
		
		JLabel label = new JLabel(ShowFormMusic.Utwory[rowNumber][2]);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.gridx = 4;
		gbc_label.gridy = 0;
		SongsRowTemplate.add(label, gbc_label);
		
		JLabel lblDate = new JLabel("");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDuration = new GridBagConstraints();
		gbc_lblDuration.anchor = GridBagConstraints.CENTER;
		gbc_lblDuration.insets = new Insets(0, 0, 0, 5);
		gbc_lblDuration.gridx = 5;
		gbc_lblDuration.gridy = 0;
		SongsRowTemplate.add(lblDate, gbc_lblDuration);
		
		JLabel lblDuration_1 = new JLabel("");
		lblDuration_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration_1.setForeground(Color.WHITE);
		lblDuration_1.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDuration_1 = new GridBagConstraints();
		gbc_lblDuration_1.anchor = GridBagConstraints.WEST;
		gbc_lblDuration_1.gridx = 6;
		gbc_lblDuration_1.gridy = 0;
		SongsRowPlayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SongsRowPlayButton.setIcon(new ImageIcon(MainContentCardsMethods.class.getResource("/img/playWhite24.png")));
				SongsRowTemplate.setBackground(new Color(50,50,50));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SongsRowPlayButton.setIcon(null);
				SongsRowTemplate.setBackground(new Color(36,36,36));
			}
		});
		SongsRowTemplate.add(lblDuration_1, gbc_lblDuration_1);
	}

	public static int SongsCardAddContent(JPanel rowContainer,int runTimes,int dbRowCount,int status) {
ShowFormMusic tempMusic1 = new ShowFormMusic();
	
		
		
		try {
			tempMusic1.displayMusic();
		}catch(Exception e){
			e.getStackTrace();
		}
	
		dbRowCount =ShowFormMusic.count;
		//ShowFormMusic.Utwory[][];
		for(int i=0;i<dbRowCount;i++) {
		addSongsRow(rowContainer,i,status);
		}
		
		
		return dbRowCount;
	}
	public static int dCardAddContent(JPanel rowContainer,int runTimes,int dbRowCount,int status) {
		ShowFormMusic tempMusic1 = new ShowFormMusic();
			
				
				
				try {
					tempMusic1.displayMusic();
				}catch(Exception e){
					e.getStackTrace();
				}
			
				dbRowCount =ShowFormMusic.count;
				//ShowFormMusic.Utwory[][];
				for(int i=0;i<dbRowCount;i++) {
				addSongsRow(rowContainer,i,status);
				}
				
				
				return dbRowCount;
			}
	
		public static void addArtistsTile(JPanel rowContainer,int rowNumber,int status) {
			
			if(status ==1 ) {
				rowNumber =ShowFormArtists.Artysci.length -1;
			}
			JPanel ArtistTile = new JPanel();
			ArtistTile.setPreferredSize(new Dimension(200, 230));
			ArtistTile.setBackground(Color.DARK_GRAY);
			rowContainer.add(ArtistTile);
			ArtistTile.setLayout(null);
			ArtistTile.setOpaque(false);
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
	
			ArtistImage.setIcon(new ImageIcon(new javax.swing.ImageIcon(MainContentCardsMethods.class.getResource("/img/nf2.jpg")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
			ArtistImage.setText("");
			
			JLabel ArtisName = new JLabel(ShowFormArtists.Artysci[rowNumber][0]);
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
		

		public static int ArtistsCardAddContent(JPanel rowContainer,int runTimes,int dbRowCount,int status) {
	ShowFormArtists tempMusic1 = new ShowFormArtists();
		
			
			
			try {
				tempMusic1.displayMusic();
			}catch(Exception e){
				e.getStackTrace();
			}
		
			dbRowCount =ShowFormArtists.count;
			//ShowFormMusic.Utwory[][];
			for(int i=0;i<dbRowCount;i++) {
			addArtistsTile(rowContainer,i,status);
			}
			
			
			return dbRowCount;
		}
		
		
			
		
	public static void refreshIfNeeded() {
		
	}
}
