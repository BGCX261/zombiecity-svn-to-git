import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends Button
{
    private Worlds world;
    
    public Instruction( Worlds world )
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
