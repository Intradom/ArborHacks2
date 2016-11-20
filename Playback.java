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
            
                if (userInput.equals("replay"))
                {
                    double replayStart = System.currentTimeMillis();
                    int i = 0;
                    while(i < play.size())
                    {
                            if (time.get(i) - startTime < System.currentTimeMillis() - replayStart)
                            {
                                System.out.println(play.get(i));
                                i++;
                            }
                    } 
                }
                else if (userInput.equals("loop"))
                {
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
                    System.out.println(maxTimeUp);
                    int j = 0;
                    while (j < maxTimeUp)
                    {
                    double replayStart = System.currentTimeMillis();
                    int i = 0;
                    while(i < play.size())
                    {
                           if (time.get(i) - startTime < System.currentTimeMillis() - replayStart)
                            {
                               System.out.println(play.get(i));
                               i++;
                            }
                   }
                    j++;
                }
                }
                }
            }
        }
        
    

