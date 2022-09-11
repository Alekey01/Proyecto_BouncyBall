
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bouncy Ball
 *
 * @author (Alejandro Zapata Delgado)
 * @version (1.0)
 */
public class Ball extends Actor
{
    public Ball(int direction){
        setRotation(direction);

    }
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(atWorldEdge())
            turn(52);

    }
    public boolean atWorldEdge(){
        if(getX() < 10 || getX() > getWorld().getWidth()-10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight()-10)
            return true;
        else
            return false;
    }
}