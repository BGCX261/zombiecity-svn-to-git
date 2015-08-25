import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Back extends Button
{
    private Worlds world;
    
    public Back( Worlds world )
    {
        this.world = world;
    }
    
    public void act() 
    {
        if( Greenfoot.mouseClicked( this ) )
        {
            getWorld().removeObjects(getWorld().getObjects( Button.class) );
            this.world.addObject(new Hoofdmenu( this.world ), 350, 350);
        }
    }    
}
