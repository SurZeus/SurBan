package dependencies;

import java.awt.CardLayout;
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
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
	public static void addContent(JPanel panel, int rowCount ) {
		int y_pos=-1;
		//rowCount+=100;
		int tab_index = rowCount -1;

		
		for(int i=0;i<rowCount;i++) {
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
						 temp.setText(ShowFormMusic.Utwory[tab_index][0]);
					    break;
				  case 3:
					 temp.setText(ShowFormMusic.Utwory[tab_index][1]);
					    break;
				  case 4:
					  temp.setText(ShowFormMusic.Utwory[tab_index][2]);
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
			tab_index--;
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
			public static void LeftDevPanel_addSongCard(JPanel cardContainer) {
				JPanel Card1 = new JPanel();
				Card1.setBackground(Color.DARK_GRAY);
				Card1.setBounds(33, 517, 300, 341);
		
				JPanel AddSongCard = new JPanel();
				AddSongCard.setLayout(null);
				AddSongCard.setPreferredSize(new Dimension(300, 300));
				Card1.add(AddSongCard);
				
				JLabel label = new JLabel("Add Song");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setBounds(0, 5, 300, 14);
				AddSongCard.add(label);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(Color.DARK_GRAY);
				panel_4.setBounds(0, 30, 300, 273);
				AddSongCard.add(panel_4);
				GridBagLayout gbl_panel_4 = new GridBagLayout();
				gbl_panel_4.columnWidths = new int[]{0, 0};
				gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
				gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
				gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
				
				JLabel label_1 = new JLabel("Set_Title");
				GridBagConstraints gbc_label_1 = new GridBagConstraints();
				gbc_label_1.insets = new Insets(0, 0, 0, 5);
				gbc_label_1.gridx = 0;
				gbc_label_1.gridy = 0;
				panel_5.add(label_1, gbc_label_1);
				
				JTextField textField_3 = new JTextField();
				textField_3.setColumns(10);
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.gridx = 1;
				gbc_textField_3.gridy = 0;
				panel_5.add(textField_3, gbc_textField_3);
				
				JPanel panel_6 = new JPanel();
				GridBagConstraints gbc_panel_6 = new GridBagConstraints();
				gbc_panel_6.fill = GridBagConstraints.BOTH;
				gbc_panel_6.insets = new Insets(0, 0, 5, 0);
				gbc_panel_6.gridx = 0;
				gbc_panel_6.gridy = 1;
				panel_4.add(panel_6, gbc_panel_6);
				GridBagLayout gbl_panel_6 = new GridBagLayout();
				gbl_panel_6.columnWidths = new int[]{100, 0, 0};
				gbl_panel_6.rowHeights = new int[]{0, 0};
				gbl_panel_6.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panel_6.setLayout(gbl_panel_6);
				
				JLabel label_2 = new JLabel("Set_Author");
				GridBagConstraints gbc_label_2 = new GridBagConstraints();
				gbc_label_2.insets = new Insets(0, 0, 0, 5);
				gbc_label_2.gridx = 0;
				gbc_label_2.gridy = 0;
				panel_6.add(label_2, gbc_label_2);
				
				JTextField textField_4 = new JTextField();
				textField_4.setColumns(10);
				GridBagConstraints gbc_textField_4 = new GridBagConstraints();
				gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_4.gridx = 1;
				gbc_textField_4.gridy = 0;
				panel_6.add(textField_4, gbc_textField_4);
				
				JPanel panel_7 = new JPanel();
				GridBagConstraints gbc_panel_7 = new GridBagConstraints();
				gbc_panel_7.fill = GridBagConstraints.BOTH;
				gbc_panel_7.insets = new Insets(0, 0, 5, 0);
				gbc_panel_7.gridx = 0;
				gbc_panel_7.gridy = 2;
				panel_4.add(panel_7, gbc_panel_7);
				GridBagLayout gbl_panel_7 = new GridBagLayout();
				gbl_panel_7.columnWidths = new int[]{100, 0, 0};
				gbl_panel_7.rowHeights = new int[]{0, 0};
				gbl_panel_7.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_7.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panel_7.setLayout(gbl_panel_7);
				
				JLabel label_3 = new JLabel("Set_Album");
				GridBagConstraints gbc_label_3 = new GridBagConstraints();
				gbc_label_3.insets = new Insets(0, 0, 0, 5);
				gbc_label_3.gridx = 0;
				gbc_label_3.gridy = 0;
				panel_7.add(label_3, gbc_label_3);
				
				JTextField textField_5 = new JTextField();
				textField_5.setColumns(10);
				GridBagConstraints gbc_textField_5 = new GridBagConstraints();
				gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_5.gridx = 1;
				gbc_textField_5.gridy = 0;
				panel_7.add(textField_5, gbc_textField_5);
				
				JPanel panel_2 = new JPanel();
				GridBagConstraints gbc_panel_2 = new GridBagConstraints();
				gbc_panel_2.insets = new Insets(0, 0, 5, 0);
				gbc_panel_2.fill = GridBagConstraints.BOTH;
				gbc_panel_2.gridx = 0;
				gbc_panel_2.gridy = 3;
				panel_4.add(panel_2, gbc_panel_2);
				GridBagLayout gbl_panel_2 = new GridBagLayout();
				gbl_panel_2.columnWidths = new int[]{100, 0, 0};
				gbl_panel_2.rowHeights = new int[]{0, 0};
				gbl_panel_2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panel_2.setLayout(gbl_panel_2);
				
				JLabel lblSetduration = new JLabel("Set_Duration");
				GridBagConstraints gbc_lblSetduration = new GridBagConstraints();
				gbc_lblSetduration.insets = new Insets(0, 0, 0, 5);
				gbc_lblSetduration.gridx = 0;
				gbc_lblSetduration.gridy = 0;
				panel_2.add(lblSetduration, gbc_lblSetduration);
				
				JTextField textField_9 = new JTextField();
				textField_9.setColumns(10);
				GridBagConstraints gbc_textField_9 = new GridBagConstraints();
				gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_9.gridx = 1;
				gbc_textField_9.gridy = 0;
				panel_2.add(textField_9, gbc_textField_9);
				
				JPanel panel_13 = new JPanel();
				GridBagConstraints gbc_panel_13 = new GridBagConstraints();
				gbc_panel_13.insets = new Insets(0, 0, 5, 0);
				gbc_panel_13.fill = GridBagConstraints.BOTH;
				gbc_panel_13.gridx = 0;
				gbc_panel_13.gridy = 4;
				panel_4.add(panel_13, gbc_panel_13);
				GridBagLayout gbl_panel_13 = new GridBagLayout();
				gbl_panel_13.columnWidths = new int[]{100, 0, 0};
				gbl_panel_13.rowHeights = new int[]{0, 0};
				gbl_panel_13.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_13.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panel_13.setLayout(gbl_panel_13);
				
				JLabel lblSetreleasedate = new JLabel("Set_ReleaseDate");
				GridBagConstraints gbc_lblSetreleasedate = new GridBagConstraints();
				gbc_lblSetreleasedate.insets = new Insets(0, 0, 0, 5);
				gbc_lblSetreleasedate.gridx = 0;
				gbc_lblSetreleasedate.gridy = 0;
				panel_13.add(lblSetreleasedate, gbc_lblSetreleasedate);
				
				JTextField textField_10 = new JTextField();
				textField_10.setColumns(10);
				GridBagConstraints gbc_textField_10 = new GridBagConstraints();
				gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_10.gridx = 1;
				gbc_textField_10.gridy = 0;
				panel_13.add(textField_10, gbc_textField_10);
				
				JButton button = new JButton("Add_Song");
				GridBagConstraints gbc_button = new GridBagConstraints();
				gbc_button.gridx = 0;
				gbc_button.gridy = 5;
				panel_4.add(button, gbc_button);
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						AddSongToDb temp = new AddSongToDb();
						String title = textField_3.getText();
					
						int album = Integer.parseInt(textField_5.getText());
						int artist = Integer.parseInt(textField_4.getText());
						try {
							temp.dodajbaza(title, album, artist);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						
					}
				});
				cardContainer.add(Card1,"AddSongsCard");
			}
			
			  public static void addPolak(JScrollPane scrollPane, int dbrowCount, int cardNumber) {
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
			JLabel xD = new JLabel();
		xD.setIcon(new ImageIcon(new javax.swing.ImageIcon(LayoutManagmentMethods.class.getResource("/img/polack.jpg")).getImage().getScaledInstance(1200, 560, Image.SCALE_SMOOTH)));
	
		panel_9.add(xD);
			
			
		};

		
			public static void LeftDevPanel_addAlbumCard(JPanel cardContainer) {
				JPanel Card1 = new JPanel();
				Card1.setBackground(Color.DARK_GRAY);
				Card1.setBounds(33, 517, 300, 341);
		
				
				JPanel AddSongCard = new JPanel();
				AddSongCard.setLayout(null);
				AddSongCard.setPreferredSize(new Dimension(300, 300));
				Card1.add(AddSongCard);
				
				JLabel lblDevaddalbum = new JLabel("DevAddAlbum");
				lblDevaddalbum.setHorizontalAlignment(SwingConstants.CENTER);
				lblDevaddalbum.setBounds(0, 5, 300, 14);
				AddSongCard.add(lblDevaddalbum);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(Color.DARK_GRAY);
				panel_4.setBounds(0, 30, 300, 273);
				AddSongCard.add(panel_4);
				GridBagLayout gbl_panel_4 = new GridBagLayout();
				gbl_panel_4.columnWidths = new int[]{0, 0};
				gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0};
				gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
				gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
				
				JLabel lblSetalbumtitle = new JLabel("Set_Album_Title");
				GridBagConstraints gbc_lblSetalbumtitle = new GridBagConstraints();
				gbc_lblSetalbumtitle.insets = new Insets(0, 0, 0, 5);
				gbc_lblSetalbumtitle.gridx = 0;
				gbc_lblSetalbumtitle.gridy = 0;
				panel_5.add(lblSetalbumtitle, gbc_lblSetalbumtitle);
				
				JTextField	textField_3 = new JTextField();
				textField_3.setColumns(10);
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.gridx = 1;
				gbc_textField_3.gridy = 0;
				panel_5.add(textField_3, gbc_textField_3);
				
				JPanel panel_6 = new JPanel();
				GridBagConstraints gbc_panel_6 = new GridBagConstraints();
				gbc_panel_6.fill = GridBagConstraints.BOTH;
				gbc_panel_6.insets = new Insets(0, 0, 5, 0);
				gbc_panel_6.gridx = 0;
				gbc_panel_6.gridy = 1;
				panel_4.add(panel_6, gbc_panel_6);
				GridBagLayout gbl_panel_6 = new GridBagLayout();
				gbl_panel_6.columnWidths = new int[]{100, 0, 0};
				gbl_panel_6.rowHeights = new int[]{0, 0};
				gbl_panel_6.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panel_6.setLayout(gbl_panel_6);
				
				JLabel label_2 = new JLabel("Set_Artist");
				GridBagConstraints gbc_label_2 = new GridBagConstraints();
				gbc_label_2.insets = new Insets(0, 0, 0, 5);
				gbc_label_2.gridx = 0;
				gbc_label_2.gridy = 0;
				panel_6.add(label_2, gbc_label_2);
				
				JTextField textField_4 = new JTextField();
				textField_4.setColumns(10);
				GridBagConstraints gbc_textField_4 = new GridBagConstraints();
				gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_4.gridx = 1;
				gbc_textField_4.gridy = 0;
				panel_6.add(textField_4, gbc_textField_4);
				
				JPanel panel_13 = new JPanel();
				GridBagConstraints gbc_panel_13 = new GridBagConstraints();
				gbc_panel_13.insets = new Insets(0, 0, 5, 0);
				gbc_panel_13.fill = GridBagConstraints.BOTH;
				gbc_panel_13.gridx = 0;
				gbc_panel_13.gridy = 2;
				panel_4.add(panel_13, gbc_panel_13);
				GridBagLayout gbl_panel_13 = new GridBagLayout();
				gbl_panel_13.columnWidths = new int[]{100, 0, 0};
				gbl_panel_13.rowHeights = new int[]{0, 0};
				gbl_panel_13.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_13.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				panel_13.setLayout(gbl_panel_13);
				
				JLabel lblSetreleasedate = new JLabel("Set_ReleaseDate");
				GridBagConstraints gbc_lblSetreleasedate = new GridBagConstraints();
				gbc_lblSetreleasedate.insets = new Insets(0, 0, 0, 5);
				gbc_lblSetreleasedate.gridx = 0;
				gbc_lblSetreleasedate.gridy = 0;
				panel_13.add(lblSetreleasedate, gbc_lblSetreleasedate);
				
				JTextField textField_10 = new JTextField();
				textField_10.setColumns(10);
				GridBagConstraints gbc_textField_10 = new GridBagConstraints();
				gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_10.gridx = 1;
				gbc_textField_10.gridy = 0;
				panel_13.add(textField_10, gbc_textField_10);
				
				JButton btnAddalbum = new JButton("Add_Album");
				GridBagConstraints gbc_btnAddalbum = new GridBagConstraints();
				gbc_btnAddalbum.gridx = 0;
				gbc_btnAddalbum.gridy = 3;
				panel_4.add(btnAddalbum, gbc_btnAddalbum);
				
				btnAddalbum.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						AddAlbumToDb temp = new AddAlbumToDb();
						String album = textField_3.getText();
						int artist = Integer.parseInt(textField_4.getText());
		
						try {
							temp.dodajbaza(album,artist);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						
					}
				});
				
				cardContainer.add(Card1,"AddAlbumsCard");
			}
			
			public static void LeftDevPanel_addArtistCard(JPanel cardsContainer) {
				JPanel Card1 = new JPanel();
				Card1.setBackground(Color.DARK_GRAY);
				Card1.setBounds(33, 517, 300, 341);
			
				
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
				
				JTextField  textField_3 = new JTextField();
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
				btnAddalbum.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						AddArtistToDb temp = new AddArtistToDb();
						String artist = textField_3.getText();
					
		
						try {
							temp.dodajbaza(artist);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
						
					}
				});
				cardsContainer.add(Card1,"AddArtistCard");
				
			}
			public static void addLeftDevPanel(JPanel panel, int rowCount) {
				int y_pos=-1;

				JTextField textField;
				JTextField textField_1;
				JTextField textField_2;
			
				
				
				JPanel LeftDevPanel = new JPanel();
				LeftDevPanel.setBackground(Color.ORANGE);
				LeftDevPanel.setPreferredSize(new Dimension(300, 400));
				
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
				
				JButton btnNewButton_2 = new JButton("AddArtist");
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
				
					///*@Override
					//public void mouseClicked(MouseEvent e) {
					//	String zmienna1 = textField.getText();
					//	String zmienna2 =textField_1.getText();
					//	String zmienna3 =textField_2.getText();
					//	AddToDb obj = new AddToDb();
					//	try {
						//	obj.dodajbaza(zmienna1, zmienna2, zmienna3);
					//	} catch (ClassNotFoundException e1) {
						//	// TODO Auto-generated catch block
						//	e1.printStackTrace();
					//	}
					//}*/
				//});
				LeftDevPanel_addSongCard(SettingsCardsContainer);
				LeftDevPanel_addAlbumCard(SettingsCardsContainer);
				LeftDevPanel_addArtistCard(SettingsCardsContainer);
				cl.show(SettingsCardsContainer, "AddSongsCard");
				btnNewButton_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						cl.show(SettingsCardsContainer,"AddAlbumsCard");
						
					}
				});
				
				btnNewButton_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						cl.show(SettingsCardsContainer,"AddSongsCard");
						
					}
				});
				
				btnNewButton_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						cl.show(SettingsCardsContainer,"AddArtistCard");
						
					}
				});
				panel.add(LeftDevPanel);
			
				
				
				
				};
			
				public static void addRightDevPanel(JPanel panel) {
					JScrollPane DB_View = new JScrollPane();
					DB_View.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
					DB_View.setPreferredSize(new Dimension(700, 400));
					DB_View.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					
					
					JPanel DB_viewPort = new JPanel();
					DB_View.setViewportView(DB_viewPort);
					DB_viewPort.setPreferredSize(new Dimension(300, 3000));
					DB_viewPort.setBackground(Color.DARK_GRAY);
					panel.add(DB_View);
				}
			
			public static void addDevPanel(JScrollPane scrollPane, int dbrowCount, int cardNumber) {
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
				
				JLabel label_6 = new JLabel("Polak lazania");
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
				
				
			

				
				LayoutManagmentMethods.addLeftDevPanel(panel_9,dbrowCount);
				LayoutManagmentMethods.addRightDevPanel(panel_9);
			
				
			};
		
}
