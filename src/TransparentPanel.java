import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class TransparentPanel extends JPanel {

	protected static final String ERROR_MESSAGE = null;
	{
        setOpaque(false);
    }
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        Rectangle r = g.getClipBounds();
        g.fillRect(r.x, r.y, r.width, r.height);
        super.paintComponent(g);
    }
	public void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
	}
}