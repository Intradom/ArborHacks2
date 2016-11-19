
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    public bool circleTouch(double x, double y, double centerX, double centerY)
    {
        boolean sound;
        if (Math.sqrt(Math.pow((centerX - x), 2)+ Math.pow((centerY - y), 2)) <= r)
        {
            sound = true;
        }
        else
        {
            sound = false;
        }
        return sound;
    }
}
