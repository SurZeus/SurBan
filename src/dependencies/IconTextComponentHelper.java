package dependencies;

import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

class IconTextComponentHelper {
    private static int ICON_SPACING = 10;

    private Border mBorder;
    private Icon mIcon;
    private Border mOrigBorder;
    private JTextComponent mTextComponent;

    IconTextComponentHelper(JTextComponent component) {
        mTextComponent = component;
        mOrigBorder = component.getBorder();
        mBorder = mOrigBorder;
        
    }

    Border getBorder() {
        return mBorder;
    }

    void onPaintComponent(Graphics g) {
        if (mIcon != null) {
            Insets iconInsets = mOrigBorder.getBorderInsets(mTextComponent);
            mIcon.paintIcon(mTextComponent, g, 250, iconInsets.top);
           // System.out.println(iconInsets.left);
        }
    }

    void onSetBorder(Border border) {
        mOrigBorder = border;

        if (mIcon == null) {
            mBorder = border;
        } else {
            Border margin = BorderFactory.createEmptyBorder(0, 0, 0,mIcon.getIconWidth() + ICON_SPACING);
            mBorder = BorderFactory.createCompoundBorder(border, margin);
        }
    }

    void onSetIcon(Icon icon) {
        mIcon = icon;
        resetBorder();
    }

    private void resetBorder() {
        mTextComponent.setBorder(mOrigBorder);
    }

	public void onSetIconSpacing(int spacing) {
		ICON_SPACING = spacing;
		
	}
	
}