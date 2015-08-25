import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Highscores extends Button
{
    private Worlds world;
    
    public Highscores( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {        
        if( Greenfoot.mouseClicked( this ) )
        {
            this.world.addObject(new Scores( this.world ), 350, 350);
        }
    }
}
