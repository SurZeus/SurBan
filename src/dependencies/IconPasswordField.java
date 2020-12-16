package dependencies;







import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class IconPasswordField extends JPasswordField {
    private IconTextComponentHelper mHelper = new IconTextComponentHelper(this);

    public IconPasswordField() {
        super();
    }

    public IconPasswordField(int cols) {
        super(cols);
    }

    private IconTextComponentHelper getHelper() {
        if (mHelper == null)
            mHelper = new IconTextComponentHelper(this);

        return mHelper;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        getHelper().onPaintComponent(graphics);
    }

    public void setIcon(Icon icon) {
        getHelper().onSetIcon(icon);
    }

    public void setIconSpacing(int spacing) {
        getHelper().onSetIconSpacing(spacing);
    }

    @Override
    public void setBorder(Border border) {
        getHelper().onSetBorder(border);
        super.setBorder(getHelper().getBorder());
    }
};
    
   /* this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseExited(MouseEvent arg0) {
			SignInButton.setForeground(Color.LIGHT_GRAY);
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			SignInButton.setForeground(Color.WHITE);
		}
	});*/
