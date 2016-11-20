
/**
 * Write a description of class Outlines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Outlines
{
    final Image recordDrumSOutline = ImageIO.read(new File("../new_stop_record_replay_outline.png"));
    final Image stopDrumSOutline = ImageIO.read(new File("../new_stop_record_replay_outline.png"));
    final Image replayDrumSOutline = ImageIO.read(new File("../new_stop_record_replay_outline.png"));
    final Image loopDrumSOutline = ImageIO.read(new File("../switch_int_outline_also_for_loop_on_first_page.png"));
    final Image tempoUpDrumSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image tempoDownDrumSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image switchDrumSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image s1DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s2DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s3DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s4DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s5DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s6DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s7DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image s8DrumSOutline = ImageIO.read(new File("../sound_boxes_outline.png"));
    final Image recordPianoSOutline = ImageIO.read(new File("../new_stop_record_replay_outline.png"));
    final Image stopPianoSOutline = ImageIO.read(new File("../new_stop_record_replay_outline.png"));
    final Image replayPianoSOutline = ImageIO.read(new File("../new_stop_record_replay_outline.png"));
    final Image loopPianoSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image tempoUPPianoSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image tempoDownPianoSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image switchPianoSOutline = ImageIO.read(new File("../tempoup_down_loop_switch_outline.png"));
    final Image ku1PianoSOutline = ImageIO.read(new File("../newblack_key_outline.png"));
    final Image ku2PianoSOutline = ImageIO.read(new File("../newblack_key_outline.png"));
    final Image ku3PianoSOutline = ImageIO.read(new File("../newblack_key_outline.png"));
    final Image ku4PianoSOutline = ImageIO.read(new File("../newblack_key_outline.png"));
    final Image ku5PianoSOutline = ImageIO.read(new File("../newblack_key_outline.png"));
    final Image kl1PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl2PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl3PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl4PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl5PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl6PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl7PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    final Image kl8PianoSOutline = ImageIO.read(new File("../new_white_key_outline.png"));
    

    
     // Visual toggles
    boolean recordDrumSOutlineOn = false;
    boolean stopDrumSOutlineOn = false; 
    boolean replayDrumSOutlineOn = false; 
    boolean loopDrumSOutlineOn = false; 
    boolean tempoUpDrumSOutlineOn = false; 
    boolean tempoDownDrumSOutlineOn = false; 
    boolean switchDrumSOutlineOn = false; 
    boolean s1DrumSOutlineOn = false; 
    boolean s2DrumSOutlineOn = false; 
    boolean s3DrumSOutlineOn = false; 
    boolean s4DrumSOutlineOn = false; 
    boolean s5DrumSOutlineOn = false; 
    boolean s6DrumSOutlineOn = false; 
    boolean s7DrumSOutlineOn = false; 
    boolean s8DrumSOutlineOn = false; 
    boolean recordPianoSOutlineOn = false; 
    boolean stopPianoSOutlineOn = false; 
    boolean replayPianoSOutlineOn = false; 
    boolean loopPianoSOutlineOn = false; 
    boolean tempoUPPianoSOutlineOn = false; 
    boolean tempoDownPianoSOutlineOn = false; 
    boolean switchPianoSOutlineOn = false; 
    boolean ku1PianoSOutlineOn = false;
    boolean ku2PianoSOutlineOn = false;
    boolean ku3PianoSOutlineOn = false;
    boolean ku4PianoSOutlineOn = false;
    boolean ku5PianoSOutlineOn = false;
    boolean kl1PianoSOutlineOn = false;
    boolean kl2PianoSOutlineOn = false;
    boolean kl3PianoSOutlineOn = false;
    boolean kl4PianoSOutlineOn = false;
    boolean kl5PianoSOutlineOn = false;
    boolean kl6PianoSOutlineOn = false;
    boolean kl7PianoSOutlineOn = false;
    boolean kl8PianoSOutlineOn = false;
    
    @Override
    public void keyReleased(KeyEvent arg0)
    {
        switch(arg0.getKeyChar())
        {
            case '2':
                recordDrumSOutlineOn = false;
                recordPianoSOutlineOn = false;
                pane.repaint();
                break;
            case '1':
                stopDrumSOutlineOn = false;
                stopPianoSOutlineOn = false;
                pane.repaint();
                break;
            case '3':
                replayDrumSOutlineOn = false;
                replayPianoSOutlineOn = false;
                pane.repaint();
                break;
            case '6':
                loopDrumSOutlineOn = false;
                loopPianoSOutlineOn = false;
                pane.repaint();
                break;
            case '5':
                tempoUpDrumSOutlineOn = false;
                tempoUPPianoSOutlineOn = false;
                pane.repaint();
                break;
            case '4':
                tempoDownDrumSOutlineOn = false;
                tempoDownPianoSOutlineOn = false;
                pane.repaint();
                break;
            case '7':
                switchDrumSOutlineOn = false;
                switchPianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'z':
                s1DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'x':
                s2DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'c':
                s3DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'v':
                s4DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'b':
                s5DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'n':
                s6DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'm':
                s7DrumSOutlineOn = false;
                pane.repaint();
                break;
            case ',':
                s8DrumSOutlineOn = false;
                pane.repaint();
                break;
            case 'w':
                ku1PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'e':
                ku2PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 't':
                ku3PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'y':
                ku4PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'u':
                ku5PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'a':
                kl1PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 's':
                kl2PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'd':
                kl3PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'f':
                kl4PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'g':
                kl5PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'h':
                kl6PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'j':
                kl7PianoSOutlineOn = false;
                pane.repaint();
                break;
            case 'k':
                kl8PianoSOutlineOn = false;
                pane.repaint();
                break;
            }

            
        }
    }
