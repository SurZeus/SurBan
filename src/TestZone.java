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

public class TestZone {

	private JFrame frame;

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
		
		JPanel AlbumTile = new JPanel();
		panel.add(AlbumTile);
		AlbumTile.setOpaque(false);
		AlbumTile.setBackground(Color.DARK_GRAY);
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
							
									lblNewLabel.setIcon(new ImageIcon(TestZone.class.getResource("/img/acdc.jpg")));
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
													lblNewLabel_1.setIcon(new ImageIcon(TestZone.class.getResource("/img/playWhite48.png")));
												}
												@Override
												public void mouseExited(MouseEvent arg0) {
													Overlay.setBackground(new Color(25,25,25,1));
													lblNewLabel_1.setIcon(new ImageIcon(TestZone.class.getResource("")));
												}
												
											});
											
											JLabel Autor = new JLabel("New label");
											Autor.setHorizontalAlignment(SwingConstants.CENTER);
											Autor.setBounds(0, 40, 196, 35);
											panel_1.add(Autor);
											
											JLabel Title = new JLabel("New label");
											Title.setHorizontalAlignment(SwingConstants.CENTER);
											Title.setBounds(0, 0, 196, 35);
											panel_1.add(Title);
	}
}
