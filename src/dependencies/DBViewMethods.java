package dependencies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class DBViewMethods {
public static void addUsersRow(JPanel rowContainer,int rowNumber,int status) {
		
		if(status ==1 ) {
			rowNumber =ShowFormUsers.Users.length -1;
		}
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(350, 30));
		rowContainer.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdwykonawcy = new JLabel(ShowFormUsersView.Users[rowNumber][0]);
		lblIdwykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdwykonawcy.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdwykonawcy.setBounds(21, 0, 81, 30);
		panel.add(lblIdwykonawcy);
		
		JLabel lblNazwawykonawcy = new JLabel(ShowFormUsersView.Users[rowNumber][1]);
		lblNazwawykonawcy.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNazwawykonawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwawykonawcy.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
		lblNazwawykonawcy.setBounds(112, 0, 238, 30);
		panel.add(lblNazwawykonawcy);
}


	public static int ArtistsCardAddView(JPanel rowContainer,int runTimes,int dbRowCount,int status) {
		ShowFormUsersView tempMusic1 = new ShowFormUsersView();
			
				
				
				try {
					tempMusic1.displayMusic();
				}catch(Exception e){
					e.getStackTrace();
				}
			
				dbRowCount =ShowFormUsersView.count;
				//ShowFormMusic.Utwory[][];
				for(int i=0;i<dbRowCount;i++) {
				addUsersRow(rowContainer,i,status);
				}
				
				
				return dbRowCount;
			}
	
public static void addSongsRow(JPanel rowContainer,int rowNumber,int status) {
		
		if(status ==1 ) {
			rowNumber =ShowFormMusicView.Utwory.length -1;
		}
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(650, 30));
		rowContainer.add(panel_2);
		
		JLabel lblIdutworu = new JLabel(ShowFormMusicView.Utwory[rowNumber][0]);
		lblIdutworu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdutworu.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdutworu.setBounds(21, 0, 81, 30);
		panel_2.add(lblIdutworu);
		
		JLabel lblIdwykonawcy_1 = new JLabel(ShowFormMusicView.Utwory[rowNumber][1]);
		lblIdwykonawcy_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdwykonawcy_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdwykonawcy_1.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
		lblIdwykonawcy_1.setBounds(112, 0, 113, 30);
		panel_2.add(lblIdwykonawcy_1);
		
		JLabel lblNazwaUtworu = new JLabel(ShowFormMusicView.Utwory[rowNumber][3]);
		lblNazwaUtworu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNazwaUtworu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaUtworu.setBounds(353, 8, 287, 14);
		panel_2.add(lblNazwaUtworu);
		
		JLabel lblIdalbumu = new JLabel(ShowFormMusicView.Utwory[rowNumber][2]);
		lblIdalbumu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdalbumu.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdalbumu.setBounds(235, 8, 108, 14);
		panel_2.add(lblIdalbumu);
}

	public static int SongsCardAddView(JPanel rowContainer,int runTimes,int dbRowCount,int status) {
		ShowFormMusicView tempMusic1 = new ShowFormMusicView();
			
				
				
				try {
					tempMusic1.displayMusic();
				}catch(Exception e){
					e.getStackTrace();
				}
			
				dbRowCount =ShowFormMusicView.count;
				//ShowFormMusic.Utwory[][];
				for(int i=0;i<dbRowCount;i++) {
				addSongsRow(rowContainer,i,status);
				}
				
				
				return dbRowCount;
			}
public static void addAlbumsRow(JPanel rowContainer,int rowNumber,int status) {
		
		if(status ==1 ) {
			rowNumber =ShowFormAlbumsView.Albumy.length -1;
		}
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setPreferredSize(new Dimension(470, 30));
		rowContainer.add(panel_3);
		
		JLabel lblIdalbumu_1 = new JLabel(ShowFormAlbumsView.Albumy[rowNumber][0]);
		lblIdalbumu_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdalbumu_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdalbumu_1.setBounds(21, 0, 68, 30);
		panel_3.add(lblIdalbumu_1);
		
		JLabel lblNazwaAlbumu = new JLabel(ShowFormAlbumsView.Albumy[rowNumber][2]);
		lblNazwaAlbumu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNazwaAlbumu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaAlbumu.setBorder(new MatteBorder(0, 1, 0, 0, (Color) Color.DARK_GRAY));
		lblNazwaAlbumu.setBounds(208, 0, 262, 30);
		panel_3.add(lblNazwaAlbumu);
		
		JLabel lblIdwykonawcy_2 = new JLabel(ShowFormAlbumsView.Albumy[rowNumber][1]);
		lblIdwykonawcy_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIdwykonawcy_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdwykonawcy_2.setBounds(99, 0, 74, 30);
		panel_3.add(lblIdwykonawcy_2);
}
	public static int AlbumsCardAddView(JPanel rowContainer,int runTimes,int dbRowCount,int status) {
		ShowFormAlbumsView tempMusic1 = new ShowFormAlbumsView();
			
				
				
				try {
					tempMusic1.displayMusic();
				}catch(Exception e){
					e.getStackTrace();
				}
			
				dbRowCount =ShowFormAlbumsView.count;
				//ShowFormMusic.Utwory[][];
				for(int i=0;i<dbRowCount;i++) {
				addAlbumsRow(rowContainer,i,status);
				}
				
				
				return dbRowCount;
			}
}
