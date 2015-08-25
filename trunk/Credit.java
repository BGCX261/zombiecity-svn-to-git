import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends Button
{
    private Worlds world;
    
    public Credit( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        getWorld().removeObjects(getWorld().getObjects(Start.class));
        getWorld().removeObjects(getWorld().getObjects(Instructions.class));
        getWorld().removeObjects(getWorld().getObjects(Credits.class));
        getWorld().removeObjects(getWorld().getObjects(Highscores.class));
        getWorld().removeObjects(getWorld().getObjects(Exit.class));
        
        Back back = new Back( this.world );
        this.world.addObject(back, 250, 665);
    }    
}
