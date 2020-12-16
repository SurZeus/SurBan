package dependencies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainContentCardsMethods {
	public static void addSongsRow(JPanel rowContainer,int rowNumber) {
		
		JPanel SongsRowTemplate = new JPanel();
		SongsRowTemplate.setBackground(Color.DARK_GRAY);
		SongsRowTemplate.setMaximumSize(new Dimension(32767, 40));
		rowContainer.add(SongsRowTemplate);
		GridBagLayout gbl_SongsRowTemplate = new GridBagLayout();
		gbl_SongsRowTemplate.columnWidths = new int[]{64, 30, 250, 250, 250, 0, 0, 0};
		gbl_SongsRowTemplate.rowHeights = new int[]{40, 0};
		gbl_SongsRowTemplate.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_SongsRowTemplate.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		SongsRowTemplate.setLayout(gbl_SongsRowTemplate);
		
		JLabel SongsRowPlayButton = new JLabel("");
		SongsRowPlayButton.setIcon(new ImageIcon(MainContentCardsMethods.class.getResource("/img/playWhite24.png")));
		GridBagConstraints gbc_SongsRowPlayButton = new GridBagConstraints();
		gbc_SongsRowPlayButton.insets = new Insets(0, 0, 0, 5);
		gbc_SongsRowPlayButton.gridx = 0;
		gbc_SongsRowPlayButton.gridy = 0;
		SongsRowTemplate.add(SongsRowPlayButton, gbc_SongsRowPlayButton);
		
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
		
		JLabel lblDate = new JLabel("00:00");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDuration = new GridBagConstraints();
		gbc_lblDuration.anchor = GridBagConstraints.WEST;
		gbc_lblDuration.insets = new Insets(0, 0, 0, 5);
		gbc_lblDuration.gridx = 5;
		gbc_lblDuration.gridy = 0;
		SongsRowTemplate.add(lblDate, gbc_lblDuration);
		
		JLabel lblDuration_1 = new JLabel("-||-");
		lblDuration_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuration_1.setForeground(Color.WHITE);
		lblDuration_1.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDuration_1 = new GridBagConstraints();
		gbc_lblDuration_1.anchor = GridBagConstraints.WEST;
		gbc_lblDuration_1.gridx = 6;
		gbc_lblDuration_1.gridy = 0;
		SongsRowTemplate.add(lblDuration_1, gbc_lblDuration_1);
	}

	public static int SongsCardAddContent(JPanel rowContainer,int runTimes,int dbRowCount) {
		
		//ShowFormMusic.Utwory[][];
		for(int i=0;i<dbRowCount;i++) {
		addSongsRow(rowContainer,i);
		}
		
		
		return dbRowCount;
	}
		
	
	public static void refreshIfNeeded() {
		
	}
}
