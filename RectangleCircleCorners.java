
/**
 * Write a description of class Rectangles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleCircleCorners
{
    public static void main (String []args)
    {
        //Drum Screen Upper Left Corners of Rectangles
        Switch (882, 74)
        Loop (882, 147)
        TempoUp (882, 203)
        TempoDown (882, 277)
        Replay (882, 351)
        Record (882, 499)
        Stop (882, 647)
        
        //Drum Screen Upper Left Corners of Circles
        Hi-Hat (144, 306)
        Snare (340, 500)
        Bass (520, 279)
        
        //Piano Screen Upper Left Corners
        Replay (0, 649)
        Record (144, 649)
        Stop (288, 649)
        Switch Instruments (432, 628)
        Switch Drums (432, 720)
        Tempo Up (576, 630)
        Tempo Down (576, 722)
        Loop (720, 639)
        //Piano Screen Piano Key Corners
        //white (these are for the bottom half of the key)
        C_a (72, 380)
        D_s (180, 380)
        E_d (288, 380)
        F_f (396, 380)
        G_g (504, 380)
        A_h (612, 380)
        B_j (720, 380)
        highC_k (828, 380)
        //black
        Db_w (126, 92)
        Eb_e (234, 92)
        Gb_t (414, 92)
        Ab_y (522, 92)
        Bb_u (630, 92)
        
        
    }
}