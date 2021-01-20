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
import java.awt.Cursor;

public class FlagsWindow {

	private JFrame frmWelcome;
	private SurbanRecordsApp wind;
	private FlagsWindow flag;
	public int LangNo = 0;
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
					FlagsWindow window = new FlagsWindow();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}
	
	
	
	/**
	 * Create the application.
	 */
	public FlagsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcome = new JFrame();
		frmWelcome.setTitle("Welcome!");
		frmWelcome.setBackground(Color.MAGENTA);
		frmWelcome.getContentPane().setBackground(Color.DARK_GRAY);
		frmWelcome.setBounds(100, 100, 615, 231);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		frmWelcome.setLocationRelativeTo(null) ;
		JPanel FlagContainer = new JPanel();
		FlagContainer.setOpaque(false);
		FlagContainer.setBounds(0, 76, 606, 116);
		frmWelcome.getContentPane().add(FlagContainer);
		FlagContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel FlagTile = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		FlagTile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		FlagTile.setPreferredSize(new Dimension(160, 100));
		FlagContainer.add(FlagTile);
		FlagTile.setLayout(null);
		
		JLabel Overlay = new JLabel(""){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		Overlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wind = new SurbanRecordsApp(3);
				wind.frmWelcome.setVisible(true);
				frmWelcome.setVisible(false);
				
			}
		});
		Overlay.setHorizontalAlignment(SwingConstants.CENTER);
		Overlay.setHorizontalTextPosition(SwingConstants.CENTER);
		Overlay.setIcon(new ImageIcon(FlagsWindow.class.getResource("/img/check.png")));
		
		Overlay.setBackground(new Color(255,255,255,150));
		Overlay.setBounds(0, 0, 160, 100);
		FlagTile.add(Overlay);
		Overlay.setVisible(false);
		JLabel flagDe = new JLabel("");
		flagDe.setBounds(0, 0, 160, 100);
		FlagTile.add(flagDe);
		flagDe.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/de.png")).getImage().getScaledInstance(160, 100, Image.SCALE_SMOOTH)));
		
		
	
		
		JPanel FlagTile2 = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		FlagTile2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		FlagTile2.setPreferredSize(new Dimension(160, 100));
		FlagContainer.add(FlagTile2);
		FlagTile2.setLayout(null);
		
		JLabel Overlay2 = new JLabel(""){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		Overlay2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wind = new SurbanRecordsApp(2);
				wind.frmWelcome.setVisible(true);
				frmWelcome.setVisible(false);
			}
		});
		Overlay2.setHorizontalAlignment(SwingConstants.CENTER);
		Overlay2.setHorizontalTextPosition(SwingConstants.CENTER);
		Overlay2.setIcon(new ImageIcon(FlagsWindow.class.getResource("/img/check.png")));
		
		Overlay2.setBackground(new Color(255,255,255,150));
		Overlay2.setBounds(0, 0, 160, 100);
		FlagTile2.add(Overlay2);
		Overlay2.setVisible(false);
		
		JLabel flagUs = new JLabel("");
		flagUs.setBounds(0, 0, 160, 100);
		FlagTile2.add(flagUs);
		flagUs.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/us.png")).getImage().getScaledInstance(160, 100, Image.SCALE_SMOOTH)));
		
		
		JPanel FlagTile3 = new JPanel(){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		FlagTile3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		FlagTile3.setPreferredSize(new Dimension(160, 100));
		FlagContainer.add(FlagTile3);
		FlagTile3.setLayout(null);
		
		JLabel Overlay3 = new JLabel(""){
		    protected void paintComponent(Graphics g)
		    {
		        g.setColor( getBackground() );
		        g.fillRect(0, 0, getWidth(), getHeight());
		        super.paintComponent(g);
		    }
		};
		Overlay3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				wind = new SurbanRecordsApp(1);
				wind.frmWelcome.setVisible(true);
				frmWelcome.setVisible(false);
			}
		});
		Overlay3.setHorizontalAlignment(SwingConstants.CENTER);
		Overlay3.setHorizontalTextPosition(SwingConstants.CENTER);
		Overlay3.setIcon(new ImageIcon(FlagsWindow.class.getResource("/img/check.png")));
		
		Overlay3.setBackground(new Color(255,255,255,150));
		Overlay3.setBounds(0, 0, 160, 100);
		FlagTile3.add(Overlay3);
		Overlay3.setVisible(false);
		
		JLabel flagPl = new JLabel("");
		flagPl.setBounds(0, 0, 160, 100);
		FlagTile3.add(flagPl);
		flagPl.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl.png")).getImage().getScaledInstance(160, 100, Image.SCALE_SMOOTH)));
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBounds(0, 0, 606, 78);
		frmWelcome.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblChooseLanguage = new JLabel("CHOOSE LANGUAGE");
		lblChooseLanguage.setForeground(Color.WHITE);
		lblChooseLanguage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChooseLanguage.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseLanguage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblChooseLanguage.setBounds(0, 5, 596, 73);
		panel_2.add(lblChooseLanguage);
		
		
		
		
	
		
		FlagTile2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Overlay2.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Overlay2.setVisible(false);
			}
		});
		FlagTile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Overlay.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Overlay.setVisible(false);
			}
		});
		FlagTile3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Overlay3.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Overlay3.setVisible(false);
			}
		});
	}
}
