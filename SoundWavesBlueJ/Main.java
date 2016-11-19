import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

import javax.sound.sampled.*;
import javax.sound.sampled.LineEvent.Type;
import javax.swing.JFrame;

public class Main {

	final static File drumNoise = new File("../SoundFiles/Drum/Snare_Drum.wav");
	final static File golfNoise = new File("../SoundFiles/golf_swing.wav"); 
	
	public static void playSound(File f)
	{	
		try {
		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;

		    stream = AudioSystem.getAudioInputStream(f);
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		    
		    LineListener listener = new LineListener() {
		        public void update(LineEvent event) {
	                if (event.getType() == Type.STOP) {
	                    clip.close();
	                    event.getLine().close();
	                }
		        }
		    };
		clip.addLineListener(listener );
		}
		catch (Exception e) {
		  e.printStackTrace();
		  System.exit(1);		
        }
	}
	
	public static void main(String[] args) throws Exception 
	{
		JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(1024, 768);
        
        f.addKeyListener(new KeyListener() {
          
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyChar())
                {
                	case 'd':
                		playSound(drumNoise);
                		break;
                	case 'g':
                		playSound(golfNoise);
                		break;
                }
            }

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        });
	}
}