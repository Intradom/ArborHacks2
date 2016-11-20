import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.sound.sampled.LineEvent.Type;
import javax.swing.JComponent;
import javax.swing.JFrame;

class ImagePanel extends JComponent {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;
    public ImagePanel(Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}

public class Main {
	
	// Background Image
	final static File bg = new File("../Screen_for_SoundWaves.png");
	
	// Sound Files
	final static File hiHatNoise = new File("../SoundFiles/Drum/Hi-Hat.wav");
	final static File snareNoise = new File("../SoundFiles/Drum/Snare_Drum.wav");
	final static File bassNoise = new File("../SoundFiles/Drum/Bass_Drum.wav");
	final static File golfNoise = new File("../SoundFiles/golf_swing.wav"); 
	final static File baboon1 = new File("../SoundFiles/wav/baboon1.wav");
	final static File ballhitcheer = new File("../SoundFiles/wav/Ball+Hit+Cheer.wav");
	final static File bark = new File("../SoundFiles/wav/bark.wav");
	final static File bearroar = new File("../SoundFiles/wav/bear-roar.wav");
	final static File bowling2 = new File("../SoundFiles/wav/bowling2.wav");
	final static File camel2 = new File("../SoundFiles/wav/camel2.wav");
	final static File Cheetah2 = new File("../SoundFiles/wav/Cheetah2.wav");
	final static File dSHAKE = new File("../SoundFiles/wav/dSHAKE.wav");
	final static File golfball= new File("../SoundFiles/wav/golfball.wav");
	final static File koala = new File("../SoundFiles/wav/koala%5B1%5D.wav");
	
	// Clips for the sound files
	static Clip hiHatNoiseClip;
	static Clip snareNoiseClip;
	static Clip bassNoiseClip;
	static Clip golfNoiseClip;
	static Clip baboon1Clip;
	static Clip ballhitcheerClip;
	static Clip barkClip;
	static Clip bearroarClip;
	static Clip bowling2Clip;
	static Clip camel2Clip;
	static Clip Cheetah2Clip;
	static Clip dSHAKEClip;
	static Clip golfballClip;
	static Clip koalaClip;
	
	public static Clip loadSound(File f)
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
		    
		    //LineListener listener = new LineListener() {
		    //    public void update(LineEvent event) {
	        //        if (event.getType() == Type.STOP) {
	        //            clip.stop();
	        //        }
		    //    }
		    //};
		    //clip.addLineListener(listener);
		    
		    return clip;
		}
		catch (Exception e) {
		  e.printStackTrace();
		  System.exit(1);		
        }
		
		// Try failed
		return null;
	}
	
	public static void loadAllClips()
	{
		hiHatNoiseClip = loadSound(hiHatNoise);
		snareNoiseClip = loadSound(snareNoise);
		bassNoiseClip = loadSound(bassNoise);
		golfNoiseClip = loadSound(golfNoise);
		baboon1Clip = loadSound(baboon1);
		ballhitcheerClip = loadSound(ballhitcheer);
		barkClip = loadSound(bark);
		bearroarClip = loadSound(bearroar);
		bowling2Clip = loadSound(bowling2);
		camel2Clip = loadSound(camel2);
		Cheetah2Clip = loadSound(Cheetah2);
		dSHAKEClip = loadSound(dSHAKE);
		golfballClip = loadSound(golfball);
		koalaClip = loadSound(koala);

	}
	
	public static void playSound(Clip clip)
	{	
		clip.setFramePosition(0);
		clip.start();
	}
	
	public static void main(String[] args) throws Exception 
	{
        JFrame f = new JFrame("SoundWaves");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage myImage = ImageIO.read(bg);
        f.setContentPane(new ImagePanel(myImage));
        f.setVisible(true);
        f.setSize(1024, 800);
        
        loadAllClips();
        
        f.addKeyListener(new KeyListener() {
          
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyChar())
                {
                	case 'd':
	                	playSound(koalaClip);
	                	break;
                	case 'h':
	                	playSound(golfballClip);
	                	break;
                	case 'y':
	                	playSound(dSHAKEClip);
	                	break;
                	case 'q':
	                	playSound(Cheetah2Clip);
	                	break;
                	case 'w':
	                	playSound(bearroarClip);
	                	break;
                	case 'e':
	                	playSound(camel2Clip);
	                	break;
                	case 'r':
	                	playSound(bowling2Clip);
	                	break;
                	case 't':
	                	playSound(barkClip);
	                	break;
                	case 'a':
	                	playSound(ballhitcheerClip);
	                	break;
                	case 's':
	                	playSound(baboon1Clip);
	                	break;
                	case 'g':
	                	playSound(golfNoiseClip);
	                	break;
                	case 'j':
	                	playSound(hiHatNoiseClip);
	                	break;
                	case 'k':
	                	playSound(snareNoiseClip);
	                	break;
                	case 'l':
	                	playSound(bassNoiseClip);
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