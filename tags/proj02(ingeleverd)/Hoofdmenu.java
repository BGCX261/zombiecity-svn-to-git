import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hoofdmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hoofdmenu extends Button
{
    private Worlds world;
    
    public Hoofdmenu( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        Start start = new Start( this.world );
        this.world.addObject(start, 351, 93);
        
        Instructions instructie = new Instructions( this.world );
        this.world.addObject(instructie, 351, 235);
        
        Credits credits = new Credits( this.world );
        this.world.addObject(credits, 351, 355);
        
        Highscores highscore = new Highscores( this.world );
        this.world.addObject(highscore, 351, 495);
        
        Exit exit = new Exit( this.world );
        this.world.addObject(exit, 351, 605);
    }
}
