package dependencies;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class LayoutManagmentMethods {
	
	public static void addSongs(JScrollPane scrollPane, int dbrowCount, int cardNumber) {
		JPanel panel_9 = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		panel_9.setOpaque(false);
		panel_9.setPreferredSize(new Dimension(10, 1000));
		panel_9.setBackground(new Color(250,250,250,1));
		JPanel panelHeaderView = new JPanel();
		panelHeaderView.setPreferredSize(new Dimension(10, 60));
		panelHeaderView.setBackground(new Color(40,40,40));
		scrollPane.setColumnHeaderView(panelHeaderView);
		GridBagLayout gbl_panelHeaderView = new GridBagLayout();
		gbl_panelHeaderView.columnWidths = new int[]{70, 40, 300, 350, 300, 100, 0};
		gbl_panelHeaderView.rowHeights = new int[]{60, 0, 0};
		gbl_panelHeaderView.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelHeaderView.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panelHeaderView.setLayout(gbl_panelHeaderView);
		
		JLabel lblNewLabel_4 = new JLabel("");
		
		//lblNewLabel_4.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/playWhite32.png")));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		panelHeaderView.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(null);
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 0;
		panelHeaderView.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		
		JLabel tempLbl = new JLabel("TYTU\u0141");
		tempLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tempLbl.setForeground(new Color(179, 179, 179));
		tempLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 12));
		GridBagConstraints gbc_lblTytu = new GridBagConstraints();
		gbc_lblTytu.fill = GridBagConstraints.VERTICAL;
		gbc_lblTytu.anchor = GridBagConstraints.WEST;
		gbc_lblTytu.insets = new Insets(0, 0, 5, 5);
		gbc_lblTytu.gridx = 2;
		gbc_lblTytu.gridy = 0;
		if(cardNumber == 1) {
			tempLbl.setText("TYTU\u0141");
		}
		else {
			tempLbl.setText("skurwiel");
		}
		panelHeaderView.add(tempLbl, gbc_lblTytu);
		
		
		JLabel lblWykonawca = new JLabel("WYKONAWCA");
		lblWykonawca.setHorizontalAlignment(SwingConstants.CENTER);
		lblWykonawca.setForeground(new Color(179, 179, 179));
		lblWykonawca.setFont(new Font("Dubai Medium", Font.PLAIN, 12));
		GridBagConstraints gbc_lblWykonawca = new GridBagConstraints();
		gbc_lblWykonawca.fill = GridBagConstraints.VERTICAL;
		gbc_lblWykonawca.anchor = GridBagConstraints.WEST;
		gbc_lblWykonawca.insets = new Insets(0, 0, 5, 5);
		gbc_lblWykonawca.gridx = 3;
		gbc_lblWykonawca.gridy = 0;
		panelHeaderView.add(lblWykonawca, gbc_lblWykonawca);
		
		JLabel lblAlbum = new JLabel("ALBUM");
		lblAlbum.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlbum.setForeground(new Color(179, 179, 179));
		lblAlbum.setFont(new Font("Dubai Medium", Font.PLAIN, 12));
		GridBagConstraints gbc_lblAlbum = new GridBagConstraints();
		gbc_lblAlbum.fill = GridBagConstraints.VERTICAL;
		gbc_lblAlbum.anchor = GridBagConstraints.WEST;
		gbc_lblAlbum.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlbum.gridx = 4;
		gbc_lblAlbum.gridy = 0;
		panelHeaderView.add(lblAlbum, gbc_lblAlbum);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/clockGray16.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(179, 179, 179));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.fill = GridBagConstraints.VERTICAL;
		gbc_label_6.gridx = 5;
		gbc_label_6.gridy = 0;
		panelHeaderView.add(label_6, gbc_label_6);
		 scrollPane.getColumnHeader().setBackground( Color.RED);
		scrollPane.setViewportView(panel_9);
		
		
	

		GridBagLayout gbl_panel_9 = new GridBagLayout();
		int numberOfRows =dbrowCount;;
		int rowCount =numberOfRows +1;
		int[] rowHeights = new int[rowCount];
		double[] rowWeights = new double[rowCount +1];
		
		for(int i=0;i<rowCount;i++) {
			rowHeights[i] = 40;
			
			
			}
		for(int i=0;i<=rowCount;i++) {
		
			if(i ==rowCount-1) {
			rowWeights[i] = 1.0;
		}
		else rowWeights[i]=0.0;
		}; 
	
		gbl_panel_9.columnWidths = new int[] {70, 40, 300, 350, 300, 100, 0};
		gbl_panel_9.rowHeights = rowHeights;
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights =rowWeights;
		panel_9.setLayout(gbl_panel_9);
		LayoutManagmentMethods.addContent(panel_9,dbrowCount);
	};
	public static void addContent(JPanel panel, int rowCount) {
		int y_pos=-1;
		
		int i_pos = rowCount -1;
		for(int i=0;i<rowCount-1;i++) {
			int x_pos =0;
			
			
			 y_pos++;
			for(int z=0;z<6;z++) {
				JLabel temp = new JLabel();
				
				temp.setHorizontalAlignment(SwingConstants.LEFT);
			
				switch(x_pos) {
				  case 0:
					 // temp.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/polack.png")));
				    break;
				  case 1:
					  temp.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/favIcon2.png")));
				    break;
				  case 2:
						 temp.setText(ShowFormMusic.Utwory[i_pos][0]);
					    break;
				  case 3:
					 temp.setText(ShowFormMusic.Utwory[i_pos][1]);
					    break;
				  case 4:
					  temp.setText(ShowFormMusic.Utwory[i_pos][2]);
					    break;
				  case 5:
					  temp.setText("-||-");
					    break;
				  default:
				    // code block
					  
				}
			
		//	temp.setHorizontalTextPosition(SwingConstants.CENTER);
			Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
			//temp.setBorder(loweredetched);
			temp.setBorder(BorderFactory.createMatteBorder(
                    0, 0, 1, 0,new Color(40,40,40)));
			temp.setForeground(new Color(255,255,255));
			temp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		temp.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		if(x_pos == 0) {
		temp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				  temp.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/playWhite24.png")));
					temp.setHorizontalAlignment(SwingConstants.CENTER);
					
					
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				  temp.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("")));
			}
		});
		}
			
			GridBagConstraints gbc_temp= new GridBagConstraints();
			gbc_temp.fill = GridBagConstraints.BOTH;
			/*if(x_pos == 0 ) {
				gbc_temp.anchor = GridBagConstraints.EAST;
			}
			else {
				gbc_temp.anchor = GridBagConstraints.EAST;
			}*/
			gbc_temp.insets = new Insets(0, 0, 0, 0);
			gbc_temp.gridx = x_pos;
			gbc_temp.gridy = y_pos;
			panel.add(temp, gbc_temp);
			x_pos++;
			
			}
			i_pos--;
		}
		};
		
		
		public static void addAlbums(JScrollPane scrollPane, int dbrowCount, int cardNumber) {
			JPanel panel_9 = new JPanel(){
			    protected void paintComponent(Graphics g)
			    {
			        g.setColor( getBackground() );
			        g.fillRect(0, 0, getWidth(), getHeight());
			        super.paintComponent(g);
			    }
			};
			panel_9.setOpaque(false);
			panel_9.setPreferredSize(new Dimension(10, 1000));
			panel_9.setBackground(new Color(250,250,250,1));
			GridLayout AlbumGrid = new GridLayout(1,3);
			FlowLayout AlbumPanelLayout = new FlowLayout();
			AlbumPanelLayout.setVgap(15);
			AlbumPanelLayout.setHgap(15);
			AlbumPanelLayout.setAlignment(FlowLayout.LEFT);
			panel_9.setLayout(AlbumPanelLayout);
			JPanel panelHeaderView = new JPanel();
			panelHeaderView.setPreferredSize(new Dimension(10, 60));
			panelHeaderView.setBackground(new Color(40,40,40));
			scrollPane.setColumnHeaderView(panelHeaderView);
			GridBagLayout gbl_panelHeaderView = new GridBagLayout();
			gbl_panelHeaderView.columnWidths = new int[]{70, 40, 300, 350, 300, 100, 0};
			gbl_panelHeaderView.rowHeights = new int[]{60, 0, 0};
			gbl_panelHeaderView.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panelHeaderView.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			panelHeaderView.setLayout(gbl_panelHeaderView);
			
			JLabel lblNewLabel_4 = new JLabel("");
			
			//lblNewLabel_4.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/playWhite32.png")));
			GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
			gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
			gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4.gridx = 0;
			gbc_lblNewLabel_4.gridy = 0;
			panelHeaderView.add(lblNewLabel_4, gbc_lblNewLabel_4);
			
			JLabel lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(null);
			GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
			gbc_lblNewLabel_7.fill = GridBagConstraints.VERTICAL;
			gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_7.gridx = 1;
			gbc_lblNewLabel_7.gridy = 0;
			panelHeaderView.add(lblNewLabel_7, gbc_lblNewLabel_7);
			
			
			JLabel tempLbl = new JLabel("");
			tempLbl.setHorizontalAlignment(SwingConstants.CENTER);
			tempLbl.setForeground(new Color(179, 179, 179));
			tempLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 12));
			GridBagConstraints gbc_lblTytu = new GridBagConstraints();
			gbc_lblTytu.fill = GridBagConstraints.VERTICAL;
			gbc_lblTytu.anchor = GridBagConstraints.WEST;
			gbc_lblTytu.insets = new Insets(0, 0, 5, 5);
			gbc_lblTytu.gridx = 2;
			gbc_lblTytu.gridy = 0;
			if(cardNumber == 1) {
				tempLbl.setText("");
			}
			else {
				tempLbl.setText("");
			}
			panelHeaderView.add(tempLbl, gbc_lblTytu);
			
			
			JLabel lblWykonawca = new JLabel("");
			lblWykonawca.setHorizontalAlignment(SwingConstants.CENTER);
			lblWykonawca.setForeground(new Color(179, 179, 179));
			lblWykonawca.setFont(new Font("Dubai Medium", Font.PLAIN, 12));
			GridBagConstraints gbc_lblWykonawca = new GridBagConstraints();
			gbc_lblWykonawca.fill = GridBagConstraints.VERTICAL;
			gbc_lblWykonawca.anchor = GridBagConstraints.WEST;
			gbc_lblWykonawca.insets = new Insets(0, 0, 5, 5);
			gbc_lblWykonawca.gridx = 3;
			gbc_lblWykonawca.gridy = 0;
			panelHeaderView.add(lblWykonawca, gbc_lblWykonawca);
			
			JLabel lblAlbum = new JLabel("");
			lblAlbum.setHorizontalAlignment(SwingConstants.CENTER);
			lblAlbum.setForeground(new Color(179, 179, 179));
			lblAlbum.setFont(new Font("Dubai Medium", Font.PLAIN, 12));
			GridBagConstraints gbc_lblAlbum = new GridBagConstraints();
			gbc_lblAlbum.fill = GridBagConstraints.VERTICAL;
			gbc_lblAlbum.anchor = GridBagConstraints.WEST;
			gbc_lblAlbum.insets = new Insets(0, 0, 5, 5);
			gbc_lblAlbum.gridx = 4;
			gbc_lblAlbum.gridy = 0;
			panelHeaderView.add(lblAlbum, gbc_lblAlbum);
			
			JLabel label_6 = new JLabel("");
			label_6.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("")));
			label_6.setHorizontalAlignment(SwingConstants.CENTER);
			label_6.setForeground(new Color(179, 179, 179));
			label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_label_6 = new GridBagConstraints();
			gbc_label_6.anchor = GridBagConstraints.WEST;
			gbc_label_6.fill = GridBagConstraints.VERTICAL;
			gbc_label_6.gridx = 5;
			gbc_label_6.gridy = 0;
			panelHeaderView.add(label_6, gbc_label_6);
			 scrollPane.getColumnHeader().setBackground( Color.RED);
			scrollPane.setViewportView(panel_9);
			
			
		

			
			LayoutManagmentMethods.addContent1(panel_9,dbrowCount);
			LayoutManagmentMethods.addContent1(panel_9,dbrowCount);
			LayoutManagmentMethods.addContent1(panel_9,dbrowCount);
			LayoutManagmentMethods.addContent1(panel_9,dbrowCount);
		};
		public static void addContent1(JPanel panel, int rowCount) {
			int y_pos=-1;

			JPanel AlbumTile = new JPanel();
				AlbumTile.setPreferredSize(new Dimension(196, 270));
			AlbumTile.setOpaque(false);
			AlbumTile.setBackground(Color.DARK_GRAY);
			AlbumTile.setBounds(66, 50, 196, 270);
		
			AlbumTile.setLayout(null);
			
			JPanel ImageFrame = new JPanel() {
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
			ImageFrame.setBackground(Color.GRAY);
			ImageFrame.setInheritsPopupMenu(true);

			ImageFrame.setOpaque(false);
			ImageFrame.setBounds(0, 0, 196, 196);
			AlbumTile.add(ImageFrame);
			ImageFrame.setLayout(null);
			
			JPanel Overlay = new JPanel() {
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};

			Overlay.setOpaque(false);
			Overlay.setBackground(new Color(25,25,25,1));
			
			
			Overlay.setBounds(0, 0, 196, 196);
			ImageFrame.add(Overlay);
			Overlay.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setPreferredSize(new Dimension(196, 196));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(0, 0, 196, 196);
		
			Overlay.add(lblNewLabel_1);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

			lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(LayoutManagmentMethods.class.getResource("/img/dkac2.jpg")).getImage().getScaledInstance(196, 196, Image.SCALE_SMOOTH)));
			lblNewLabel.setBounds(0, 0, 196, 196);
			ImageFrame.add(lblNewLabel);
			
			JPanel panel_1 = new JPanel() {
					protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
			panel_1.setBackground(new Color(255,255,255,1));
			panel_1.setOpaque(false);

			panel_1.setBounds(0, 196, 196, 75);
			AlbumTile.add(panel_1);
			panel_1.setLayout(null);
			Overlay.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Overlay.setBackground(new Color(25,25,25,200));
					lblNewLabel_1.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("/img/playWhite48.png")));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Overlay.setBackground(new Color(25,25,25,1));
					lblNewLabel_1.setIcon(new ImageIcon(LayoutManagmentMethods.class.getResource("")));
				}
				
			});
			
			
			JLabel Title = new JLabel("The Way");
			Title .setForeground(new Color(255,255,255));
			Title .setFont(new Font("Dubai Medium", Font.PLAIN, 16));
			Title.setHorizontalAlignment(SwingConstants.LEFT);
			Title.setBounds(0, 0, 196, 35);
			panel_1.add(Title);
			JLabel Autor = new JLabel("AC/DC");
			Autor.setForeground(new Color(179, 179, 179));
			Autor.setFont(new Font("Dubai Medium", Font.PLAIN, 16));
			Autor.setHorizontalAlignment(SwingConstants.LEFT);
			Autor.setBounds(0, 20, 196, 35);
			panel_1.add(Autor);
			
		
			panel.add(AlbumTile);
			
			
		
			
			
			
		
			
			
			
			};
		
}
