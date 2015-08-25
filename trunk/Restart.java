import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Button
{
    private Worlds world;
    
    public Restart( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        if( Greenfoot.mouseClicked( this ) )
        {
            getWorld().removeObjects(getWorld().getObjects(Button.class));
            Greenfoot.playSound("Music gameplay.mp3");
            this.world.setWorld();
        }
    }    
}
