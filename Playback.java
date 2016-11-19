import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Playback here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playback
{
    public static void main (String args[])
    {
        System.out.println("?");
        ArrayList<Character> play = new ArrayList<Character>();
        ArrayList<Double> time = new ArrayList<Double>();
        double startTime = 0;
        double elapsedTime = 0;
        Scanner keyboard = new Scanner(System.in);
        
    
            while (true)
            {
                String userInput = keyboard.next();
                if (userInput.equals("start"))
                {
                    startTime = System.currentTimeMillis();    
                }
                
                if (startTime > 0)
                {
                    if (userInput.equals("stop"))
                    {
                        startTime = -1;
                    }
                    if (userInput.equals("x")) //check userInput
                    {
                        time.add(System.currentTimeMillis() - startTime);
                        play.add('x');
                    }
                    if (userInput.equals("c"))
                    {
                        time.add(System.currentTimeMillis() - startTime);
                        play.add('c');
                    }
                }
            
                if (userInput.equals("print"))
                {
                    double replayStart = System.currentTimeMillis();
                    while(play.size() > 0)
                    {
                            if (time.get(0)- startTime < System.currentTimeMillis() - replayStart)
                            {
                                System.out.println(play.get(0));
                                play.remove(0);
                                time.remove(0);
                            }
                    }
                        
                        
                        
                    }
                }
            }
        }
    

