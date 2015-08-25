import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Instructions extends Button
{
    private Worlds world;
    
    public Instructions( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {        
        if( Greenfoot.mouseClicked( this ) )
        {
            this.world.addObject(new Instruction( this.world ), 350, 350);
        }
    }
}
