package dependencies;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Audio
{
	private Clip clip; 
	
	public Audio(String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		AudioInputStream audioInputStreamVar = AudioSystem.getAudioInputStream(new File(path));
		AudioFormat audiFormatVar = audioInputStreamVar.getFormat();
		AudioFormat formatedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, audiFormatVar.getSampleRate(), 16,
				audiFormatVar.getChannels(), audiFormatVar.getChannels() * 2, audiFormatVar.getSampleRate(), false);
		
		
		AudioInputStream daudioInputStreamVar = AudioSystem.getAudioInputStream(formatedFormat, audioInputStreamVar);
		clip = AudioSystem.getClip();
		clip.open(daudioInputStreamVar);
	}
	
	
	
	public void play(float volume, int framePos)
	{
		playClip(volume, framePos);
		clip.start();
	}
	

	public void stop()
	{
		if(clip.isRunning())
			clip.stop();
	}
	

	public void close()
	{
		stop();
		clip.close();
	}
	
	public void playAfterPause(int frame)
	{
		clip.setFramePosition(frame);
		clip.start();
	}
	
	public int getFramePosition()
	{
		return clip.getFramePosition();
		
	}
	
	public boolean getIsRunning()
	{
		return clip.isRunning();
	}
	
	
	public void changeVolume(float volume)
	{
		volumeControl(volume);
	}
	
	private void playClip(float volume, int framePos)
	{
		if(clip == null)
			return;
		
		stop();
		volumeControl(volume);
		
		clip.setFramePosition(framePos);
	}
	
	private void volumeControl(float volume)
	{
		FloatControl gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
		try
		{
			gainControl.setValue(volume);
			System.out.println(volume);
		}
		catch(IllegalArgumentException e)
		{
			//e.printStackTrace();
			if(volume > gainControl.getMaximum())
				volume = gainControl.getMaximum();
			else if(volume < gainControl.getMinimum())
				volume = gainControl.getMinimum();
		}	
	}
}
