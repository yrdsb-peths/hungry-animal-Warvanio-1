import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for da dolphin.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends Actor
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * The bread class
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
    }    
}
