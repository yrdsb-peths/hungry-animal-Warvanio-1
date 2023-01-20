import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        eat();
    }
    //eats apple spawns new one
    public void eat()
    {
        if(isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBread();
            world.increaseScore();
        }
    }
}
