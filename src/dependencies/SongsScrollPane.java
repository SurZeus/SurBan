package dependencies;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class SongsScrollPane extends JScrollPane {
	


	
	public SongsScrollPane(int dbrowCount,JPanel Container) {

	Container.add(this, "Albums");
	this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	 this.getViewport().setBackground( new Color(36,36,36));
	this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	this.setBorder(new EmptyBorder(0, 0, 0, 0));
	this.setBackground(new Color(40, 40, 40));

	
}
}