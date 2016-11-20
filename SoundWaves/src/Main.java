import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Background Image
	final File bg = new File("../new_screen_for_SoundWaves.png");
	
	// Sound Files
	final File hiHatNoise = new File("../SoundFiles/Drum/Hi-Hat.wav");
	final File snareNoise = new File("../SoundFiles/Drum/Snare_Drum.wav");
	final File bassNoise = new File("../SoundFiles/Drum/Bass_Drum.wav");
	final File golfNoise = new File("../SoundFiles/golf_swing.wav"); 
	final File baboon1 = new File("../SoundFiles/wav/baboon1.wav");
	final File ballhitcheer = new File("../SoundFiles/wav/Ball+Hit+Cheer.wav");
	final File bark = new File("../SoundFiles/wav/bark.wav");
	final File bearroar = new File("../SoundFiles/wav/bear-roar.wav");
	final File bowling2 = new File("../SoundFiles/wav/bowling2.wav");
	final File camel2 = new File("../SoundFiles/wav/camel2.wav");
	final File Cheetah2 = new File("../SoundFiles/wav/Cheetah2.wav");
	final File dSHAKE = new File("../SoundFiles/wav/dSHAKE.wav");
	final File golfball= new File("../SoundFiles/wav/golfball.wav");
	final File koala = new File("../SoundFiles/wav/koala%5B1%5D.wav");
	
	ArrayList<File> playOld = new ArrayList<File>();
	ArrayList<Double> timeOld = new ArrayList<Double>();
    double startTimeOld = 0;
	ArrayList<File> play = new ArrayList<File>();
	ArrayList<Double> time = new ArrayList<Double>();
    double startTime = -1;
    int playbackIndex = -1;
    double replayStart;
    
	public void playSound(File f)
	{	
		if (startTime > 0)
		{
			time.add(System.currentTimeMillis() - startTime);
	        play.add(f);
		}
		
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
	                if (event.getType() == LineEvent.Type.STOP) {
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
	
	public Main() throws IOException
	{
		JFrame f = new JFrame("SoundWaves");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image backgroundImage = ImageIO.read(bg);
        f.setVisible(true);
        f.setSize(1024, 800);
                
        JPanel pane = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, null);
            }
        };
        f.add(pane);
        
        f.addKeyListener(new KeyListener() {
          
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyChar())
                {
                	case 'd':
	                	playSound(koala);
	                	break;
                	case 'h':
	                	playSound(golfball);
	                	break;
                	case 'y':
	                	playSound(dSHAKE);
	                	break;
                	case 'q':
	                	playSound(Cheetah2);
	                	break;
                	case 'w':
	                	playSound(bearroar);
	                	break;
                	case 'e':
	                	playSound(camel2);
	                	break;
                	case 'r':
	                	playSound(bowling2);
	                	break;
                	case 't':
	                	playSound(bark);
	                	break;
                	case 'a':
	                	playSound(ballhitcheer);
	                	break;
                	case 's':
	                	playSound(baboon1);
	                	break;
                	case 'g':
	                	playSound(golfNoise);
	                	break;
                	case 'j':
	                	playSound(hiHatNoise);
	                	break;
                	case 'k':
	                	playSound(snareNoise);
	                	break;
                	case 'l':
	                	playSound(bassNoise);
	                	break;
	                // Start Recording
                	case 'z':
                		if (startTime < 0)
                		{
	                		System.out.println("Start recording");
	                		play.clear();
	                		time.clear();
	                        startTime = System.currentTimeMillis();
                		}
                		else
                			System.out.println("Currently recording");
                		break;
                	// Stop Recording
                	case 'x':
                		if (startTime >= 0)
                		{
	                		System.out.println("Stop recording");
	                		playbackIndex = -1;
	                        startTime = -1;
	                        startTimeOld = startTime;
	                        playOld.clear();
	                        timeOld.clear();
	                        for (int i = 0; i < time.size(); i++)
	                        {
	                        	playOld.add(play.get(i));
	                        	timeOld.add(time.get(i));
	                        }
                		}
                		else
                			System.out.println("Not recording");
                		break;
                	// Playback Recording
                	case 'c':
                		System.out.println("Playback");
                		if (playbackIndex < 0 || playbackIndex >= timeOld.size())
                		{
	                		playbackIndex = 0;
	                        replayStart = System.currentTimeMillis();
                		}
                		else
                			System.out.println("Can't playback recording");
                		break;
                	// TODO: Toggle loop
                	case 'v':
                		double maxTime = time.get(0) - startTime;
                        int k = 0;
                        while (k < time.size() - 1)
                        {
                            if ((time.get(k + 1) - time.get(k)) > maxTime)
                            {
                                maxTime = time.get(k + 1) - time.get(k);
                            }
                            k++;
                        }
                        double maxTimeUp = Math.round(maxTime/1000) + 1;
                        int j = 0;
                        while (j < maxTimeUp)
						{
						    double replayStart = System.currentTimeMillis();
						    int i = 0;
						    while(i < play.size())
						    {
						        if (time.get(i) - startTime < System.currentTimeMillis() - replayStart)
						        {
						            playSound(play.get(i));
						            i++;
						        }
						    }
						    j++;
						}
                        break;
                	case 'b':
                		if (playbackIndex < 0 || playbackIndex >= timeOld.size())
                		{
	                		System.out.println("Decrease tempo by 2");
							int i = 0;
							while(i < timeOld.size())
							{
								timeOld.set(i, timeOld.get(i)*2);
						        i++;
							}
                		}
                		else
                			System.out.println("Can't change tempo during playback");
                		break;
                	case 'n':
                		if (playbackIndex < 0 || playbackIndex >= timeOld.size())
                		{
	                		System.out.println("Increase tempo by 2");
	                		int i = 0;
	                        while(i < timeOld.size())
	                        {
	                    		timeOld.set(i, timeOld.get(i)/2);
	                            i++;
	                        } 
	                        break;
                		}
                		else
                			System.out.println("Can't change tempo during playback");
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

        while (true)
        {
        	// If playback enabled, play the sounds in it
            if (playbackIndex >= 0 && playbackIndex < timeOld.size())
            {
    	        if (timeOld.get(playbackIndex) - startTimeOld < System.currentTimeMillis() - replayStart)
    	        {
    	            playSound(playOld.get(playbackIndex));
    	            playbackIndex++;
    	        }
            }
            
            try {
				Thread.sleep(1);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
        
	}
	
	public static void main(String[] args) throws Exception 
	{
		new Main();
	}
}