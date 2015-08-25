import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Credits extends Button
{
    private Worlds world;
    
    public Credits( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        if( Greenfoot.mouseClicked( this ) )
        {
            this.world.addObject(new Credit( this.world ), 350, 350);
        }
    }
}
