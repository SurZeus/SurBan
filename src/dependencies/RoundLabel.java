package dependencies;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
import java.awt.event.*;
 
public class RoundLabel extends JLabel {
  private BufferedImage bim;
  public RoundLabel(String label) {
    super(label);
 
    setBackground(Color.lightGray);
    setFocusable(false);
 
    /*
     These statements enlarge the button so that it 
     becomes a circle rather than an oval.
    */
    Dimension size = getPreferredSize();
    size.width = size.height = Math.max(size.width, size.height);
    setPreferredSize(size);
 
    /*
     This call causes the JButton not to paint the background.
     This allows us to paint a round background.
    */
    
  }
 
protected void paintComponent(Graphics g) {
    g.setClip(new Ellipse2D.Double(0, 0, getWidth(), getHeight()));  // set the area that shall be painted
    g.drawImage(bim, 0, 0, getWidth(), getHeight(), null);    // draw the image, if available
    
  
  
 


    super.paintComponent(g);
}

public void setButtonImage(BufferedImage pbim) {
    bim = pbim;
    repaint();
}
 
  protected void paintBorder(Graphics g) {
    g.setColor(new Color(255,255,255,0));
    g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
  }
 
  // Hit detection.
  Shape shape;
 
  public boolean contains(int x, int y) {
    // If the button has changed size,  make a new shape object.
    if (shape == null || !shape.getBounds().equals(getBounds())) {
      shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
    }
    return shape.contains(x, y);
  }
 
  
}