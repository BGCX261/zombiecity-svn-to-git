import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    private Worlds world;
    
    public Start( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        if( Greenfoot.mouseClicked( this ) )
        {
            getWorld().removeObjects(getWorld().getObjects(Button.class));
            this.world.setWorld();
            Greenfoot.playSound("Music gameplay.mp3");
        }
    }    
}
