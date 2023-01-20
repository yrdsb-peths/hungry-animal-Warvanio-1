import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1, false);
        
        Dolphin dolphin = new Dolphin ();
        addObject(dolphin, 400, 700);
        
        //create label here
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 30, 30);
        
        createBread();
    }
    
    //game ends
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("game over", 100);
        addObject(gameOverLabel, 400, 400);
    }
    
    //increase the score
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createBread()
    {
        Bread bread = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bread, x, y);
    }
}


