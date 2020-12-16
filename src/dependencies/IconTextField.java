package dependencies;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class IconTextField extends JTextField {
    private IconTextComponentHelper mHelper = new IconTextComponentHelper(this);

    public IconTextField() {
        super();
    }

    public IconTextField(int cols) {
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
}