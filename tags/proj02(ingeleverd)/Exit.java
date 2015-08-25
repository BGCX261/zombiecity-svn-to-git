import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    private Worlds world;
    
    public Exit( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        if( Greenfoot.mouseClicked( this ) )
        {
            Greenfoot.stop();
        }
    }    
}
