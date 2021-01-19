package dependencies;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JProgressBar;

public class ClickableProgressBar extends JProgressBar implements MouseListener {
	
	public ClickableProgressBar()
	{
		addMouseListener(this);
	}
	
	public void SetProgressBarValue(int value)
	{
		this.setValue(value);
	}
	
	@Override
    public void mouseClicked(MouseEvent e) {

		
    }

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		int position = e.getX();
		int max = this.getMaximum();
		int width = this.getWidth();
		
		float ratio = (float)(position)/(float)(width);
		int ProgressBarValue = (int)((ratio) * max);
		
		
		if((ProgressBarValue>this.getMinimum()) && (ProgressBarValue<this.getMaximum()))
		{
		SetProgressBarValue(ProgressBarValue);
		}
		else if(ProgressBarValue<this.getMinimum())
		{
		SetProgressBarValue(this.getMinimum());
		}
		else if(ProgressBarValue>this.getMaximum())
		{
		SetProgressBarValue(this.getMaximum());
		}
		
		//System.out.println(this.getValue());
		
	}


	

}
